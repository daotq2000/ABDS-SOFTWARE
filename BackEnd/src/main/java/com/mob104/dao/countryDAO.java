package com.mob104.dao;

import com.mob104.mapper.countryMapper;
import com.mob104.model.CountryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class countryDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void setTemplate(JdbcTemplate template) {
        this.jdbcTemplate = template;
    }
    public List<CountryEntity> getAll(){
        String sql = "SELECT * FROM `country`";
        List<CountryEntity> list = jdbcTemplate.query(sql,new countryMapper());
        return list;
    }
    public CountryEntity getById(long id){
        String sql = "SELECT * FROM `country` where CountryID = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new countryMapper());
    }
    public CountryEntity addCountry(CountryEntity country){
        String sql = "INSERT INTO `country` ( `CountryName`) VALUES (?)";
        jdbcTemplate.update(sql, new Object[]{country.getCountryName()});
        return country;
    }
    public CountryEntity updateCountry(CountryEntity country,long id){
        String sql = "UPDATE country SET CountryName = ? where CountryID = ?";
        jdbcTemplate.update(sql, new Object[]{country.getCountryName(),id});
        return country;
    }
    public boolean deleteCountry(long id){
        String sql = "DELETE FROM country where CountryID = ?";
        int m =  jdbcTemplate.update(sql, id);
        if(m > 0 ){
            return true;
        }
        return false;
    }
}

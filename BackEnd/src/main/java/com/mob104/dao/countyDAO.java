package com.mob104.dao;

import com.mob104.mapper.countryMapper;
import com.mob104.mapper.countyMapper;
import com.mob104.model.CountyEntity;
import com.mob104.model.CountyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class countyDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void setTemplate(JdbcTemplate template) {
        this.jdbcTemplate = template;
    }
    public List<CountyEntity> getAll(){
        String sql = "SELECT * FROM `county`";
        List<CountyEntity> list = jdbcTemplate.query(sql,new countyMapper());
        return list;
    }
    public CountyEntity getById(long id){
        String sql = "SELECT * FROM `county` where CountyID  = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new countyMapper());
    }
    public CountyEntity addCounty(CountyEntity county){
        String sql = "INSERT INTO `county` ( `CountryID`, `CountyName`) VALUES (?,?)";
        jdbcTemplate.update(sql, new Object[]{county.getCountryId(),county.getCountyName()});
        return county;
    }
    public CountyEntity updateCounty(CountyEntity county,long id){
        String sql = "UPDATE `county` SET CountryID = ? , CountyName = ? where CountyID  = ?";
        jdbcTemplate.update(sql, new Object[]{county.getCountryId(),county.getCountyName(),id});
        return county;
    }
    public boolean deleteCounty(long id){
        String sql = "DELETE FROM county where CountyID = ?";
        int m =  jdbcTemplate.update(sql, id);
        if(m > 0 ){
            return true;
        }
        return false;
    }
}

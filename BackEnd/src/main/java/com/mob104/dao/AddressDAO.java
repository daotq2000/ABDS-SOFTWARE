package com.mob104.dao;

import com.mob104.mapper.addressMapper;
import com.mob104.model.AddressEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AddressDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void setTemplate(JdbcTemplate template) {
        this.jdbcTemplate = template;
    }

    public List<AddressEntity> getAll(){
        String sql = "Select * from address";
        return jdbcTemplate.query(sql,new addressMapper());
    }
    public AddressEntity getById(long id){
        String sql = "Select * from address where AddressID = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new addressMapper());
    }
    public AddressEntity addAddress(AddressEntity address){
        String sql = "INSERT INTO address ( PostCode, TownID, CountyID, CountryID) VALUES ( ?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{address.getPostCode(),address.getTownId(),address.getCountyId(),address.getCountryId()});
        return address;
    }
    public AddressEntity updateAddress(AddressEntity address,long id){
        String sql = "UPDATE address SET  PostCode = ?, TownID = ?, CountyID = ?, CountryID = ? where AddressID = ?";
        jdbcTemplate.update(sql, new Object[]{address.getPostCode(),address.getTownId(),address.getCountyId(),address.getCountryId(),id});
        return address;
    }
    public boolean deleteAddress(long id){
        String sql = "DELETE FROM address where address.AddressID = ?";
        int m =  jdbcTemplate.update(sql, id);
        if(m > 0 ){
            return true;
        }
        return false;
    }

}

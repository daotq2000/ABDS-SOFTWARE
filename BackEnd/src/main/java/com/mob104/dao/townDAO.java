package com.mob104.dao;

import com.mob104.mapper.townMapper;
import com.mob104.model.TownEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class townDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void setTemplate(JdbcTemplate template) {
        this.jdbcTemplate = template;
    }

    public List<TownEntity> getAll(){
        String sql = "Select * from town";
        return jdbcTemplate.query(sql,new townMapper());
    }
    public TownEntity getById(long id){
        String sql = "Select * from town where townID = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new townMapper());
    }
    public TownEntity addtown(TownEntity town){
        String sql = "INSERT INTO `town` (`TownID`, `CountyID`, `Country`, `TownName`) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]{town.getTownId(),town.getCountyId(),town.getCountry(),town.getTownName()});
        return town;
    }
    public TownEntity updatetown(TownEntity town,long id){
        String sql = "UPDATE town SET  CountyID = ?, Country = ?, TownName = ? where townID = ?";
        jdbcTemplate.update(sql, new Object[]{town.getCountyId(),town.getCountry(),town.getTownName(),id});
        return town;
    }
    public boolean deletetown(long id){
        String sql = "DELETE FROM town where town.townID = ?";
        int m =  jdbcTemplate.update(sql, id);
        if(m > 0 ){
            return true;
        }
        return false;
    }

}

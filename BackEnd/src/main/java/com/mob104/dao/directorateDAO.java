package com.mob104.dao;

import com.mob104.mapper.directorateMapper;
import com.mob104.model.DirectorateEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class directorateDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void setTemplate(JdbcTemplate template) {
        this.jdbcTemplate = template;
    }

    public List<DirectorateEntity> getAll(){
        String sql = "Select * from directorate";
        return jdbcTemplate.query(sql,new directorateMapper());
    }
    public DirectorateEntity getById(long id){
        String sql = "Select * from directorate where DirectorateID  = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new directorateMapper());
    }
    public DirectorateEntity addDirect(DirectorateEntity direct){
        String sql = "INSERT INTO `directorate` (`DirectorateID`, `OrgID`, `ContactID`) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]{direct.getDirectorateId(),direct.getOrgId(),direct.getContactId()});
        return direct;
    }
    public DirectorateEntity updateDirect(DirectorateEntity direct,long id){
        String sql = "UPDATE  `directorate` SET  `OrgID` = ?, `ContactID` = ? WHERE `DirectorateID` = ?";
        jdbcTemplate.update(sql, new Object[]{direct.getOrgId(),direct.getContactId(),id});
        return direct;
    }
    public boolean deleteDirect(long id){
        String sql = "DELETE FROM directorate where directorate.DirectorateID = ?";
        int m =  jdbcTemplate.update(sql, id);
        if(m > 0 ){
            return true;
        }
        return false;
    }

}

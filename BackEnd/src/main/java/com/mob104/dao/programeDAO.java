package com.mob104.dao;

import com.mob104.mapper.organisationMapper;
import com.mob104.mapper.programmeMapper;
import com.mob104.model.OrganisationEntity;
import com.mob104.model.ProgrammeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class programeDAO {
    @Autowired private
    JdbcTemplate jdbcTemplate;
    public void setTemplate(JdbcTemplate template) {
        this.jdbcTemplate = template;
    }
    public List<ProgrammeEntity> getAll(){
        String sql = "SELECT * FROM programme";
        return jdbcTemplate.query(sql,new programmeMapper());
    }
    public ProgrammeEntity getById(int id){
        String sql = "SELECT * FROM programme WHERE programmeId = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new programmeMapper());
    }
    public  ProgrammeEntity addPrograme(ProgrammeEntity programme){
        String sql = "INSERT INTO programme (programeName, description,isactive, ContactID) VALUES ( ?, ?, ?,?)";
        jdbcTemplate.update(sql, new Object[]{programme.getProgrameName(),programme.getDescription(),programme.isIsactive(),programme.getContactId()});
        return programme;
    }
    public  ProgrammeEntity updatePrograme(ProgrammeEntity programme,long id){
        String sql = "UPDATE  programme SET  programeName = ?, description = ?, isactive = ?, ContactID = ? WHERE programme.ProgrammeID = ?";
        jdbcTemplate.update(sql, new Object[]{programme.getProgrameName(),programme.getDescription(),programme.isIsactive(),programme.getContactId(),id});
        return programme;
    }
    public boolean deletePrograme(long id){
        String sql = "Delete from programme where programme.ProgrammeID = ? ";
        int num = jdbcTemplate.update(sql,id);
        if(num > 0){
            return true;
        }
        return false;
    }

}

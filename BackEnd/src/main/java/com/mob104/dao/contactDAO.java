package com.mob104.dao;

import com.mob104.mapper.contactMapper;
import com.mob104.model.ContactEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class contactDAO {
    @Autowired private JdbcTemplate jdbcTemplate;
    public void setTemplate(JdbcTemplate template) {
        this.jdbcTemplate = template;
    }
    public List<ContactEntity> getAll(){
        String sql = "SELECT * FROM contact";
        List<ContactEntity> list = jdbcTemplate.query(sql,new contactMapper());
        return list;
    }
    public ContactEntity getById(long id){
        String sql = "SELECT * FROM contact where contactId = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new contactMapper());
    }
    public ContactEntity addContact(ContactEntity contact){
        String sql = "INSERT INTO contact (firstname, ManagerID) VALUES (?,?) ";
        jdbcTemplate.update(sql, new Object[]{contact.getFirstname(),contact.getManagerId()});
        return contact;
    }
    public ContactEntity updateContact(ContactEntity contact,long id){
        String sql = "UPDATE contact SET firstname = ?, ManagerID = ? where contact.ContactID = ?";
        jdbcTemplate.update(sql, new Object[]{contact.getFirstname(),contact.getManagerId(),id});
        return contact;
    }
    public boolean deleteContact(long id){
        String sql = "DELETE FROM contact where contact.ContactID = ?";
        int m =  jdbcTemplate.update(sql, id);
        if(m > 0 ){
            return true;
        }
        return false;
    }
}

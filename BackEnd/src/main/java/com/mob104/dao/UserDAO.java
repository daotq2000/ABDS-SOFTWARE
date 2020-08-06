package com.mob104.dao;

import com.mob104.mapper.usersMapper;
import com.mob104.model.UsersEntity;
import com.mob104.model.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void setTemplate(JdbcTemplate template) {
        this.jdbcTemplate = template;
    }

    public List<UsersEntity> getAll(){
        String sql = "Select * from users";
        return jdbcTemplate.query(sql,new usersMapper());
    }
    public UsersEntity getById(long id){
        String sql = "Select * from users where USERID = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new usersMapper());
    }
    public UsersEntity addUsers(UsersEntity users){
        String sql = "INSERT INTO `users` (`USERID`, `ACCOUNTS`, `EMAIL`, `ROLE`, `PASSWORDS`) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]{users.getUserid(),users.getAccounts(),users.getEmail(),users.getRole(),users.getPasswords()});
        return users;
    }
    public UsersEntity updateUsers(UsersEntity users,long id){
        String sql = "UPDATE users SET  ACCOUNTS = ?, EMAIL = ?, ROLE = ?, PASSWORDS = ? where USERID = ?";
        jdbcTemplate.update(sql, new Object[]{users.getAccounts(),users.getEmail(),users.getRole(),users.getPasswords(),id});
        return users;
    }
    public boolean deleteUsers(long id){
        String sql = "DELETE FROM users where users.USERID = ?";
        int m =  jdbcTemplate.update(sql, id);
        if(m > 0 ){
            return true;
        }
        return false;
    }

}

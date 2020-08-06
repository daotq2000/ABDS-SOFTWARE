package com.mob104.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mob104.model.*;
public class usersMapper implements RowMapper<UsersEntity> {
    public UsersEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        UsersEntity user = new UsersEntity();
       user.setUserid(resultSet.getInt("USERID"));
       user.setAccounts(resultSet.getString("ACCOUNTS"));
        user.setEmail(resultSet.getString("EMAIL"));
        user.setRole(resultSet.getInt("ROLE"));
        user.setPasswords(resultSet.getString("PASSWORDS"));
        return user;
    }
}

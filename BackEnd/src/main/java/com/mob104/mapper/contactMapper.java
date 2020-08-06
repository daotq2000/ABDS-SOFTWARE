package com.mob104.mapper;

import org.springframework.jdbc.core.RowMapper;
import com.mob104.model.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class contactMapper implements RowMapper<ContactEntity> {
    public ContactEntity mapRow(ResultSet resultSet, int i) throws SQLException {
       ContactEntity contact = new ContactEntity();
       contact.setContactId(resultSet.getLong("ContactID"));
        contact.setFirstname(resultSet.getString("firstname"));
        contact.setManagerId(resultSet.getInt("ManagerID"));
        return contact;
    }
}

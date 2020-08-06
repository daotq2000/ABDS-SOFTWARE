package com.mob104.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mob104.model.*;
public class directorateMapper implements RowMapper<DirectorateEntity> {
    public DirectorateEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        DirectorateEntity directorate = new DirectorateEntity();
        directorate.setDirectorateId(resultSet.getLong("DirectorateID"));
        directorate.setContactId(resultSet.getLong("ContactID"));
        directorate.setOrgId(resultSet.getInt("OrgID"));

        return directorate;
    }
}

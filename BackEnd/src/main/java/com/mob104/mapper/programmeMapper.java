package com.mob104.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mob104.model.*;
public class programmeMapper implements RowMapper<ProgrammeEntity> {
    public ProgrammeEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        ProgrammeEntity programme = new ProgrammeEntity();
        programme.setProgrammeId(resultSet.getLong("ProgrammeID"));
        programme.setProgrameName(resultSet.getString("programeName"));
        programme.setDescription(resultSet.getString("description"));
        programme.setIsactive(resultSet.getBoolean("isactive"));
        programme.setContactId(resultSet.getLong("ContactID"));
        return programme;
    }
}

package com.mob104.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mob104.model.*;
public class referenceMapper implements RowMapper<ReferencedataEntity> {
    public ReferencedataEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        ReferencedataEntity reference = new ReferencedataEntity();
        reference.setRefId(resultSet.getLong("RefID"));
        reference.setRefCode(resultSet.getString("RefCode"));
        reference.setRefValue(resultSet.getString("RefValue"));
        return reference;
    }
}

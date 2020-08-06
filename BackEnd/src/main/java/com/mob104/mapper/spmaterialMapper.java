package com.mob104.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mob104.model.*;
public class spmaterialMapper implements RowMapper<SupportingmaterialEntity> {
    public SupportingmaterialEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        SupportingmaterialEntity sp = new SupportingmaterialEntity();
        sp.setSupportingMaterialId(resultSet.getInt("SupportingMaterialID"));
        sp.setOrgId(resultSet.getInt("OrgID"));
        sp.setUserId(resultSet.getInt("UserID"));
        sp.setUrl(resultSet.getString("url"));
        sp.setDescription(resultSet.getString("description"));
        sp.setType(resultSet.getString("type"));
        sp.setAddBy(resultSet.getString("addBy"));
        sp.setAddDate(resultSet.getDate("addDate"));
        return sp;
    }
}

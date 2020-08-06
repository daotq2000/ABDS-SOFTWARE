package com.mob104.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mob104.model.*;
public class trustDitrictMapper implements RowMapper<TrusdistrictEntity> {
    public TrusdistrictEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        TrusdistrictEntity trusdistrtic = new TrusdistrictEntity();
        trusdistrtic.setTrustDistrictId(resultSet.getInt("TrustDistrictID"));
        trusdistrtic.setName(resultSet.getString("Name"));
        trusdistrtic.setDescription(resultSet.getString("Description"));
        trusdistrtic.setActive(resultSet.getBoolean("isActive"));
        trusdistrtic.setTrustRegionId(resultSet.getLong("TrustRegionID"));
        return trusdistrtic;
    }
}

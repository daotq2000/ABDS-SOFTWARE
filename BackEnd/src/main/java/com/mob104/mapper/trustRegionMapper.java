package com.mob104.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mob104.model.*;
public class trustRegionMapper implements RowMapper<TrustregionEntity> {
    public TrustregionEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        TrustregionEntity trustregion = new TrustregionEntity();
        trustregion.setTrustRegionId(resultSet.getInt("TrustRegionID"));
        trustregion.setName(resultSet.getString("Name"));
        trustregion.setDescription(resultSet.getString("Description"));
        trustregion.setActive(resultSet.getBoolean("isActive"));
        trustregion.setCountryId(resultSet.getLong("CountryID"));
        return trustregion;
    }
}

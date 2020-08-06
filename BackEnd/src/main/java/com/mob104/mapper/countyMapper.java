package com.mob104.mapper;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mob104.model.*;
public class countyMapper implements RowMapper<CountyEntity> {
    public CountyEntity mapRow(ResultSet resultSet, int i) throws SQLException {

        CountyEntity county = new CountyEntity();
        county.setCountryId(resultSet.getLong("CountyID"));
        county.setCountyId(resultSet.getLong("CountryID"));
        county.setCountyName(resultSet.getString("CountyName"));
        return county;
    }
}

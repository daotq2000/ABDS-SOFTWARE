package com.mob104.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mob104.model.*;
public class townMapper implements RowMapper<TownEntity> {
    public TownEntity mapRow(ResultSet resultSet, int i) throws SQLException {
            TownEntity town = new TownEntity();
            town.setTownId(resultSet.getLong("TownID"));
        town.setCountyId(resultSet.getLong("CountyID"));
        town.setCountry(resultSet.getLong("Country"));
        town.setTownName(resultSet.getString("TownName"));

return town;

    }
}

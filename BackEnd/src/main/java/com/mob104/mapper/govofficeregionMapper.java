package com.mob104.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mob104.model.*;
public class govofficeregionMapper implements RowMapper<GovofficeregionEntity> {
    public GovofficeregionEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        GovofficeregionEntity govo = new GovofficeregionEntity();
        govo.setActive(resultSet.getBoolean("isActive"));
        govo.setCountryId(resultSet.getLong("CountryID"));
        govo.setCountyId(resultSet.getLong("CountyID"));
        govo.setGovOfficeRegionId(resultSet.getLong("GovOfficeRegionID"));
        govo.setGovOfficeRegionName(resultSet.getString("GovOfficeRegionName"));
        return govo;
    }

}

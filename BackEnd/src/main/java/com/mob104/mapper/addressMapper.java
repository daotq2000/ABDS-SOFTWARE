package com.mob104.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mob104.model.*;
import org.springframework.jdbc.core.RowMapper;

public class addressMapper  implements RowMapper<AddressEntity> {

    public AddressEntity mapRow(ResultSet resultSet, int i) throws SQLException {

        AddressEntity address = new AddressEntity();
        address.setAddressId(resultSet.getLong("AddressID"));
        address.setCountryId(resultSet.getLong("CountryID"));
        address.setCountyId(resultSet.getLong("CountyID"));
        address.setPostCode(resultSet.getString("PostCode"));
        address.setTownId(resultSet.getLong("TownID"));
        return address;
    }

}

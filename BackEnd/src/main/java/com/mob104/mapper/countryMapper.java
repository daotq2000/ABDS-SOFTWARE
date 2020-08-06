package com.mob104.mapper;
import org.springframework.jdbc.core.RowMapper;
import com.mob104.model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
public class countryMapper  implements RowMapper<CountryEntity>{
    public CountryEntity mapRow(ResultSet resultSet, int i) throws SQLException {

        CountryEntity county = new CountryEntity();
        county.setCountryId(resultSet.getLong("CountryID"));
        county.setCountryName(resultSet.getString("CountryName"));
        return county;
    }
}

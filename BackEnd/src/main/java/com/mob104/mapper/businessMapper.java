package com.mob104.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mob104.model.*;
import org.springframework.jdbc.core.RowMapper;
public class businessMapper implements  RowMapper<BusinessEntity> {
    public BusinessEntity mapRow(ResultSet resultSet, int i) throws SQLException {

        BusinessEntity business = new BusinessEntity();
        business.setBusinessId(resultSet.getLong("BusinessID"));
        business.setBusinessName(resultSet.getString("BusinessName"));
        business.setSic2007(resultSet.getString("Sic2007"));
        business.setSic2003(resultSet.getString("sic2003"));
        business.setShortDepcription(resultSet.getString("shortDepcription"));
        business.setCoppyAddress(resultSet.getBoolean("coppyAddress"));
        business.setAddress1(resultSet.getString("address1"));
        business.setCityTown(resultSet.getString("cityTown"));
        business.setNationCountry(resultSet.getString("nationCountry"));
        business.setCountry(resultSet.getString("Country"));
        business.setFullDescription(resultSet.getString("fullDescription"));
        business.setSicCode(resultSet.getString("sicCode"));
        business.setPhone(resultSet.getString("phone"));
        business.setEmail(resultSet.getString("email"));
        business.setWebsite(resultSet.getString("website"));
        business.setCharityNumber(resultSet.getString("charityNumber"));
        business.setCompanyNumber(resultSet.getString("companyNumber"));
        return business;
    }
}

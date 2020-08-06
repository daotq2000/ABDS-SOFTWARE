package com.mob104.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mob104.model.*;
public class organisationMapper implements RowMapper<OrganisationEntity> {
    public OrganisationEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        OrganisationEntity organisation = new OrganisationEntity();
        organisation.setOrgId(resultSet.getInt("OrgID"));
        organisation.setOrgname(resultSet.getString("Orgname"));
        organisation.setAddress1(resultSet.getString("address1"));
        organisation.setActive(resultSet.getBoolean("isActive"));
        organisation.setShortDepcription(resultSet.getString("shortDepcription"));
        organisation.setCityTown(resultSet.getString("cityTown"));
        organisation.setCountry(resultSet.getString("Country"));
        organisation.setContactId(resultSet.getLong("ContactID"));
        organisation.setNationCountry(resultSet.getString("nationCountry"));
        organisation.setPreferenceOrg(resultSet.getBoolean("preferenceOrg"));
        organisation.setExInternet(resultSet.getBoolean("exInternet"));
        organisation.setSicCode(resultSet.getString("sicCode"));
        organisation.setFullDescription(resultSet.getString("fullDescription"));
        organisation.setPhone(resultSet.getString("phone"));
        organisation.setFax(resultSet.getString("fax"));
        organisation.setWebsite(resultSet.getString("website"));
        organisation.setCharityNumber(resultSet.getString("charityNumber"));
        organisation.setCompanyNumber(resultSet.getString("companyNumber"));
        organisation.setEmail("email");
        return organisation;
    }
}

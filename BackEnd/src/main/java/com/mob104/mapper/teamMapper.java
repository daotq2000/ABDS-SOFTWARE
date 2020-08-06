package com.mob104.mapper;

import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;
import com.mob104.model.*;
public class teamMapper implements RowMapper<TeamEntity> {
    public TeamEntity mapRow(ResultSet resultSet, int i) throws SQLException {

        TeamEntity team = new TeamEntity();
        team.setTeamId(resultSet.getLong("TeamID "));
        team.setTeamName(resultSet.getString("teamName"));
        team.setDepartmentId(resultSet.getLong("DepartmentID"));
        team.setContactId(resultSet.getLong("ContactID"));
        team.setShortDepcription(resultSet.getString("shortDepcription"));
        team.setAddress1(resultSet.getString("address1"));
        team.setPostcode(resultSet.getString("postcode"));

        team.setCityTown(resultSet.getString("cityTown"));
        team.setNationCountry(resultSet.getString("nationCountry"));
        team.setCountry(resultSet.getString("Country"));
        team.setFullDescription(resultSet.getString("fullDescription"));
        team.setSicCode(resultSet.getString("sicCode"));
        team.setPhone(resultSet.getString("phone"));
        team.setFax(resultSet.getString("fax"));
        team.setEmail(resultSet.getString("email"));
        team.setWebsite(resultSet.getString("website"));
        team.setCharityNumber(resultSet.getString("charityNumber"));
        team.setCompanyNumber(resultSet.getString("companyNumber"));


        return team;
    }
}

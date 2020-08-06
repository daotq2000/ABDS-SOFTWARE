package com.mob104.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mob104.model.*;
import org.springframework.jdbc.core.RowMapper;

public class departmentMapper implements RowMapper<DepartmentEntity> {
    public DepartmentEntity  mapRow(ResultSet resultSet, int i) throws SQLException {

        DepartmentEntity department = new DepartmentEntity();
         department.setDepartmentId(resultSet.getLong("DepartmentID"));
         department.setDirectorateId(resultSet.getLong("DirectorateID"));
         department.setContactId(resultSet.getLong("ContactID"));
         department.setShortDepcription(resultSet.getString("shortDepcription"));
        department.setAddress1(resultSet.getString("address1"));
        department.setPostcode(resultSet.getString("postcode"));
        department.setCityTown(resultSet.getString("cityTown"));
        department.setNationCountry(resultSet.getString("nationCountry"));
        department.setCountry(resultSet.getString("Country"));
        department.setFullDescription(resultSet.getString("fullDescription"));
        department.setSicCode(resultSet.getString("sicCode"));
        department.setPhone(resultSet.getString("phone"));
        department.setFax(resultSet.getString("fax"));
        department.setEmail(resultSet.getString("email"));
        department.setWebsite(resultSet.getString("website"));
        department.setCharityNumber(resultSet.getString("charityNumber"));
        department.setCompanyNumber(resultSet.getString("companyNumber"));
        return department;
    }
}

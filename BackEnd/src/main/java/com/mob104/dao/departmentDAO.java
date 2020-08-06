package com.mob104.dao;

import com.mob104.mapper.departmentMapper;
import com.mob104.model.DepartmentEntity;
import com.mob104.model.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class departmentDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void setTemplate(JdbcTemplate template) {
        this.jdbcTemplate = template;
    }

    public List<DepartmentEntity> getAll(){
        String sql = "Select * from department";
        return jdbcTemplate.query(sql,new departmentMapper());
    }
    public DepartmentEntity getById(long id){
        String sql = "Select * from department where DepartmentID = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new departmentMapper());
    }
    public DepartmentEntity addDepart(DepartmentEntity depart){
        String sql = "INSERT INTO `department` (`DepartmentID`, `DirectorateID`, `ContactID`, `shortDepcription`," +
                " `address1`, `postcode`, `cityTown`, `nationCountry`, `Country`, `fullDescription`, `sicCode`, " +
                "`phone`, `fax`, `email`, `website`, `charityNumber`, `companyNumber`) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,depart.getDepartmentId(),depart.getDirectorateId(),depart.getContactId(),depart.getShortDepcription(),
                depart.getAddress1(),depart.getPostcode(),depart.getCityTown(),depart.getNationCountry(),
                depart.getCountry(),depart.getFullDescription(),depart.getSicCode(),depart.getPhone(),depart.getFax(),depart.getEmail(),
                depart.getWebsite(),depart.getCharityNumber(),depart.getCompanyNumber());
        return depart;
    }
    public DepartmentEntity updateDepart(DepartmentEntity depart,long id){
        String sql = "UPDATE `department` SET `DirectorateID`= ?, `ContactID` = ?, `shortDepcription` = ?," +
                " `address1` = ?, `postcode` = ?, `cityTown` = ?, `nationCountry` = ?, `Country` = ?, `fullDescription` = ?, `sicCode` = ?, " +
                "`phone` = ?, `fax` = ?, `email` = ?, `website` = ?, `charityNumber` = ?, `companyNumber` = ? where department.DepartmentID = ? ";
        jdbcTemplate.update(sql,depart.getDirectorateId(),depart.getContactId(),depart.getShortDepcription(),
                depart.getAddress1(),depart.getPostcode(),depart.getCityTown(),depart.getNationCountry(),
                depart.getCountry(),depart.getFullDescription(),depart.getSicCode(),depart.getPhone(),depart.getFax(),depart.getEmail(),
                depart.getWebsite(),depart.getCharityNumber(),depart.getCompanyNumber(),id);
    return depart;
    }
    public boolean deleteDepart(long id){
        String sql = "DELETE FROM department where department.DepartmentID = ?";
        int m =  jdbcTemplate.update(sql, id);
        if(m > 0 ){
            return true;
        }
        return false;
    }

}

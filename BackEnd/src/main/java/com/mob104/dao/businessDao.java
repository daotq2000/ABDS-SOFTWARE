package com.mob104.dao;

import com.mob104.mapper.addressMapper;
import com.mob104.mapper.businessMapper;
import com.mob104.model.BusinessEntity;
import com.mob104.model.BusinessEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class businessDao {
    @Autowired private JdbcTemplate jdbcTemplate;
    public void setTemplate(JdbcTemplate template) {
        this.jdbcTemplate = template;
    }

    public List<BusinessEntity> getAll(){
        String sql = "SELECT * FROM `business`";
        return jdbcTemplate.query(sql,new businessMapper());
    }
    public BusinessEntity getById(long id){
        String sql = "SELECT * FROM `business` where BusinessID  = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new businessMapper());
    }
    public BusinessEntity addBusiness(BusinessEntity b){
        String sql = "INSERT INTO `business` (`BusinessID`, `BusinessName`, `Sic2007`, `Sic2003`," +
                " `shortDepcription`, `coppyAddress`, `address1`, `cityTown`, `nationCountry`, `Country`," +
                " `fullDescription`, `sicCode`, `phone`, `fax`, `email`, `website`, `charityNumber`, " +
                "`companyNumber`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,b.getBusinessId(),b.getBusinessName(),b.getSic2007(),b.getSic2003()
        ,b.getShortDepcription(),b.isCoppyAddress(),b.getAddress1(),b.getCityTown(),b.getNationCountry(),
                b.getCountry(),b.getFullDescription(),b.getSicCode(),b.getPhone(),b.getFax(),b.getEmail(),
                b.getWebsite(),b.getCharityNumber(),b.getCompanyNumber());
        return b;
    }
    public BusinessEntity updateBusiness(BusinessEntity b,long id){
        String sql = "UPDATE  `business` SET `BusinessName` = ?, `Sic2007` = ?," +
                " `Sic2003` = ?, `shortDepcription` = ?, " +
                "`coppyAddress` = ?, `address1` = ?, `cityTown` = ?, `nationCountry` = ?, `Country` = ?, `fullDescription` = ?, " +
                "`sicCode` = ?, `phone` = ?, `fax` = ?, `email` = ?, `website` = ?," +
                " `charityNumber` = ?, `companyNumber` = ? where `BusinessID` = ?";
        jdbcTemplate.update(sql,b.getBusinessName(),b.getSic2007(),b.getSic2003()
                ,b.getShortDepcription(),b.isCoppyAddress(),b.getAddress1(),b.getCityTown(),b.getNationCountry(),
                b.getCountry(),b.getFullDescription(),b.getSicCode(),b.getPhone(),b.getFax(),b.getEmail(),
                b.getWebsite(),b.getCharityNumber(),b.getCompanyNumber(),id);
        return b;
    }
    public boolean deleteBusiness(long id){
        String sql = "DELETE FROM business where business.BusinessID = ?";
        int m =  jdbcTemplate.update(sql, id);
        if(m > 0 ){
            return true;
        }
        return false;
    }
}

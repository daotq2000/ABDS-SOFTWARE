package com.mob104.dao;

import com.mob104.mapper.addressMapper;
import com.mob104.mapper.premisesMapper;
import com.mob104.model.AddressEntity;
import com.mob104.model.PremiseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class premisesDAO {
@Autowired private JdbcTemplate jdbcTemplate;
    public void setTemplate(JdbcTemplate template) {
        this.jdbcTemplate = template;
    }

    public List<PremiseEntity> getAll(){
        String sql = "SELECT * FROM `premise`";
        return jdbcTemplate.query(sql,new premisesMapper());
    }
    public PremiseEntity getById(long id){
        String sql = "Select * from premise where PremiseID  = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new premisesMapper());
    }
    public PremiseEntity addPremises(PremiseEntity p){
        String sql = "INSERT INTO premise (PremiseID, premiseName, locationName, knowas, locationstatusDate, cityTown," +
                " country, nationCountry, primaryLocation, locationManager, stNetworkConnectivity, locationDescription," +
                " genaralFaxNumber, minisecondNumber, isNew, flagDate, address, phoneNumber, projectCode, isActive, " +
                "specialShop, ServiceID) VALUES (?,?,?,?,?, ?, ?, ?, ?, ?, ?," +
                " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]{
                p.getPremiseId(),p.getPremiseName(),p.getLocationName(),p.getKnowas(),p.getLocationstatusDate(),
                p.getCityTown(),p.getCountry(),p.getNationCountry(),p.isPrimaryLocation(),p.isLocationManager(),p.isStNetworkConnectivity(),
                p.getLocationDescription(),p.getGenaralFaxNumber(),p.getMinisecondNumber(),p.isNew(),p.getFlagDate(),p.getAddress(),p.getPhoneNumber(),
                p.getProjectCode(),p.isActive(),p.isSpecialShop(),p.getServiceId()
        });
        return p;
    }
    public PremiseEntity updatePremises(PremiseEntity p,long id){
        String sql = "UPDATE premise SET premiseName = ? , locationName = ?, knowas = ?, locationstatusDate = ?, cityTown = ?," +
                " country = ?, nationCountry = ?, primaryLocation = ?, locationManager = ?, stNetworkConnectivity = ?, locationDescription = ?," +
                " genaralFaxNumber = ?, minisecondNumber = ?, isNew = ?, flagDate = ?, address = ?, phoneNumber = ?, projectCode = ?, isActive = ?, " +
                "specialShop = ?, ServiceID = ? WHERE premise.PremiseID = ?";
        jdbcTemplate.update(sql, new Object[]{
               p.getPremiseName(),p.getLocationName(),p.getKnowas(),p.getLocationstatusDate(),
                p.getCityTown(),p.getCountry(),p.getNationCountry(),p.isPrimaryLocation(),p.isLocationManager(),p.isStNetworkConnectivity(),
                p.getLocationDescription(),p.getGenaralFaxNumber(),p.getMinisecondNumber(),p.isNew(),p.getFlagDate(),p.getAddress(),p.getPhoneNumber(),
                p.getProjectCode(),p.isActive(),p.isSpecialShop(),p.getServiceId(),id
        });  
        return p;
    }
    public boolean deletePremisses(long id){
        String sql = "DELETE FROM premise where premise.PremiseID = ?";
        int m =  jdbcTemplate.update(sql, id);
        if(m > 0 ){
            return true;
        }
        return false;
    }
}

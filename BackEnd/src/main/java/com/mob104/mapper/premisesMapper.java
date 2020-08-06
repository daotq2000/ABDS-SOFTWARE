package com.mob104.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mob104.model.*;
public class premisesMapper implements RowMapper<PremiseEntity> {
    public PremiseEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        PremiseEntity premise = new PremiseEntity();
        premise.setPremiseId(resultSet.getLong("PremiseID"));
        premise.setPremiseName(resultSet.getString("premiseName"));
        premise.setPremiseName(resultSet.getString("locationName"));
        premise.setKnowas(resultSet.getString("knowas"));
        premise.setLocationstatusDate(resultSet.getDate("locationstatusDate"));
        premise.setCityTown(resultSet.getString("cityTown"));
        premise.setCountry(resultSet.getString("country"));
        premise.setNationCountry(resultSet.getString("nationCountry"));
        premise.setPrimaryLocation(resultSet.getBoolean("primaryLocation"));
        premise.setLocationManager(resultSet.getBoolean("locationManager"));
        premise.setStNetworkConnectivity(resultSet.getBoolean("stNetworkConnectivity"));
        premise.setLocationDescription(resultSet.getString("locationDescription"));
        premise.setGenaralFaxNumber(resultSet.getString("genaralFaxNumber"));
        premise.setMinisecondNumber(resultSet.getString("minisecondNumber"));
        premise.setNew(resultSet.getBoolean("isNew"));
        premise.setFlagDate(resultSet.getDate("flagDate"));
        premise.setAddress(resultSet.getString("address"));
        premise.setPhoneNumber(resultSet.getString("phoneNumber"));
        premise.setProjectCode(resultSet.getString("projectCode"));
        premise.setActive(resultSet.getBoolean("isActive"));
        premise.setSpecialShop(resultSet.getBoolean("specialShop"));
        premise.setServiceId(resultSet.getLong("ServiceID"));
        return premise;
    }
}

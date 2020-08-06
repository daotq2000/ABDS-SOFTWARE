package com.mob104.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mob104.model.*;
public class serviceMapper implements RowMapper<ServiceEntity> {
    public ServiceEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        ServiceEntity service = new ServiceEntity();
       service.setServiceId(resultSet.getLong("ServiceId"));
       service.setServiceName(resultSet.getString("ServiceName"));
        service.setShortDescription(resultSet.getString("shortDescription"));
        service.setSubType(resultSet.getString("subType"));
        service.setClientDescription(resultSet.getString("clientDescription"));
        service.setServiceStart(resultSet.getDate("serviceStart"));
        service.setServiceEnd(resultSet.getDate("serviceEnd"));
        service.setServiceEntendable(resultSet.getBoolean("serviceEntendable"));
        service.setServiceActive(resultSet.getBoolean("serviceActive"));
        service.setFullDescription(resultSet.getString("fullDescription"));
        service.setDeptCode(resultSet.getString("deptCode"));
        service.setDeliverDescription(resultSet.getString("deliverDescription"));
        service.setContractCode(resultSet.getString("contractCode"));
        service.setContractValue(resultSet.getString("contractValue"));
        service.setContractPayment(resultSet.getBoolean("contractPayment"));
        service.setServiceTimelimit(resultSet.getBoolean("serviceTimelimit"));
        service.setContactId(resultSet.getLong("ContactID"));

        return service;
    }
}

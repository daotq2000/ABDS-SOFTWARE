package com.mob104.dao;

import com.mob104.mapper.serviceMapper;
import com.mob104.model.ServiceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class serviceDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public void setTemplate(JdbcTemplate template) {
        this.jdbcTemplate = template;
    }
    public List<ServiceEntity> getAll(){
        String sql = "SELECT * FROM service";
        List<ServiceEntity> list = jdbcTemplate.query(sql,new serviceMapper());
        return list;
    }
    public ServiceEntity getById(long id){
        String sql = "SELECT * FROM service where serviceId = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new serviceMapper());
    }
    public ServiceEntity addService(ServiceEntity service){
        String sql = "INSERT INTO service ( serviceName, shortDescription," +
                " subType, clientDescription, serviceStart, serviceEnd, serviceEntendable," +
                " serviceActive, fullDescription, deptCode, deliverDescription, contractCode, " +
                "contractValue, contractPayment, serviceTimelimit, ContactID) " +
                "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{service.getServiceName(),service.getShortDescription(),
        service.getSubType(),service.getClientDescription(),service.getServiceStart(),service.getServiceEnd(),service.isServiceEntendable(),service.isServiceActive()
        ,service.getFullDescription(),service.getDeptCode(),service.getDeliverDescription(),service.getContractCode()
        ,service.getContractValue(),service.isContractPayment(),service.isServiceTimelimit(),service.getContactId()});
        return service;
    }
    public ServiceEntity updateService(ServiceEntity service, long id){
        String sql = "UPDATE service SET serviceName = ?, shortDescription = ?," +
                " subType = ?, clientDescription = ?, serviceStart = ?, serviceEnd = ?, serviceEntendable = ?," +
                " serviceActive = ?, fullDescription = ?, deptCode = ?, deliverDescription = ?, contractCode = ?, " +
                "contractValue = ?, contractPayment = ?, serviceTimelimit = ?, ContactID = ? WHERE service.serviceId = ?";
        jdbcTemplate.update(sql,new Object[]{service.getServiceName(),service.getShortDescription(),
                service.getSubType(),service.getClientDescription(),service.getServiceStart(),service.getServiceEnd(),service.isServiceEntendable(),service.isServiceActive()
                ,service.getFullDescription(),service.getDeptCode(),service.getDeliverDescription(),service.getContractCode()
                ,service.getContractValue(),service.isContractPayment(),service.isServiceTimelimit(),service.getContactId(),id});
        return service;
    }
    public boolean deleteService (long id){
        String sql = "DELETE FROM  service WHERE service.serviceId = ?";
        int num = jdbcTemplate.update(sql,id);
        if(num > 0){
            return true;
        }
        return false;
    }
}

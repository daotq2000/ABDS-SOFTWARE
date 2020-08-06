package com.mob104.dao;

import com.mob104.mapper.organisationMapper;
import com.mob104.model.OrganisationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class organisationDAO {
   @Autowired
   JdbcTemplate jdbcTemplate;
    organisationMapper mapper;
    public void setTemplate(JdbcTemplate template) {
        this.jdbcTemplate = template;
    }
    public List<OrganisationEntity> getAll(){
        String sql = "SELECT * FROM organisation";
         List<OrganisationEntity> list  = jdbcTemplate.query(sql,new organisationMapper());
        return list;
    }
    public OrganisationEntity getById(int id){
        String sql = "SELECT * FROM organisation WHERE OrgID = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id},new organisationMapper());
    }
    public OrganisationEntity addOrganisation(OrganisationEntity organisation){
        String sql = "INSERT INTO organisation (OrgID, Orgname, address1, isActive, shortDepcription, cityTown, Country, ContactID, nationCountry, preferenceOrg, exInternet, sicCode, fullDescription, phone, fax, website, charityNumber, companyNumber, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//        jdbcTemplate.update(sql, new organisationMapper());
            jdbcTemplate.update(sql,new Object[]{organisation.getOrgId(),organisation.getOrgname(),
                    organisation.getAddress1(),organisation.isActive(),organisation.getShortDepcription(),
                    organisation.getCityTown(),organisation.getCountry(),organisation.getContactId(),
                    organisation.getNationCountry(),organisation.getPreferenceOrg(),organisation.isExInternet()
                    ,organisation.getSicCode(),organisation.getFullDescription(),organisation.getPhone(),
                    organisation.getFax(),organisation.getWebsite(),organisation.getCharityNumber(),
                    organisation.getCompanyNumber(),organisation.getEmail()});
        return organisation;
    }
    public OrganisationEntity updateOrganisation(OrganisationEntity organisation,Integer id){
        String sql = "UPDATE organisation SET  Orgname = ?, address1 = ?, isActive = ?, shortDepcription = ?, cityTown = ?, Country = ?, ContactID = ?, nationCountry = ?, preferenceOrg = ?, exInternet = ?, sicCode = ?, fullDescription = ?, phone = ?, fax = ?, website = ?, charityNumber = ?, companyNumber = ?, email = ? where organisation.OrgID = ?";
        jdbcTemplate.update(sql,new Object[]{organisation.getOrgname(),
                organisation.getAddress1(),organisation.isActive(),organisation.getShortDepcription(),
                organisation.getCityTown(),organisation.getCountry(),organisation.getContactId(),
                organisation.getNationCountry(),organisation.getPreferenceOrg(),organisation.isExInternet()
                ,organisation.getSicCode(),organisation.getFullDescription(),organisation.getPhone(),
                organisation.getFax(),organisation.getWebsite(),organisation.getCharityNumber(),
                organisation.getCompanyNumber(),organisation.getEmail(),id});
        return organisation;
    }
    public boolean deleteOrganisation (Integer id){
        String sql = "DELETE FROM  organisation WHERE organisation.OrgID = ?";
        int num = jdbcTemplate.update(sql,id);
        if(num > 0){
            return true;
        }
        return false;
    }
}

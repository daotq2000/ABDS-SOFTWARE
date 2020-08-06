package com.mob104.controller;

import com.mob104.dao.organisationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import  com.mob104.model.*;
import java.util.List;

@RestController
@RequestMapping("/organisation")
@CrossOrigin(origins = "http://localhost:4200")
public class OrganisationController {

    @Autowired private organisationDAO dao;
    @GetMapping("")
    public List<OrganisationEntity> getlist(){
        return dao.getAll();
    }
    @GetMapping("/{id}")
    public  OrganisationEntity getById(@PathVariable("id") int id){
        return dao.getById(id);
    }
    @PostMapping("/add")
    public OrganisationEntity add(@RequestBody OrganisationEntity organisation){
        return dao.addOrganisation(organisation);
    }
    @PutMapping("/update/{id}")
    public  OrganisationEntity update(@RequestBody OrganisationEntity organisation, @PathVariable("id") int id){
        return dao.updateOrganisation(organisation,id);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id")int id){
        boolean isDetele = dao.deleteOrganisation(id);
        if(isDetele){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

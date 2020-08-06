package com.mob104.controller;

import com.mob104.dao.businessDao;
import com.mob104.model.BusinessEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/business")
@CrossOrigin(origins = "http://localhost:4200")
public class businessController {
    @Autowired
    private businessDao repository;
    @GetMapping("")
    public List<BusinessEntity> getAll(){
        List<BusinessEntity> list = repository.getAll();
        return list;
    }
    @GetMapping("/{id}")
    public BusinessEntity getAll(@PathVariable("id")long id){
        BusinessEntity address  = repository.getById(id);
        return address;
    }
    @PostMapping("/add")
    public BusinessEntity add(@RequestBody BusinessEntity business){

        return repository.addBusiness(business);
    }
    @PutMapping("/update/{id}")
    public BusinessEntity update(@RequestBody BusinessEntity business, @PathVariable("id") long id){
        business = repository.updateBusiness(business,id);
        return business;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<BusinessEntity> delete(@PathVariable("id") long id){
        boolean isDelete = repository.deleteBusiness(id);
        if(isDelete){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

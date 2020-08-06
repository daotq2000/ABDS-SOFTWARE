package com.mob104.controller;

import com.mob104.dao.countryDAO;
import com.mob104.dao.countyDAO;
import com.mob104.model.CountyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/county")
@CrossOrigin(origins = "http://localhost:4200")
public class countyController {
    @Autowired
    private countyDAO repository;
    @GetMapping("")
    public List<CountyEntity> getAll(){
        List<CountyEntity> list = repository.getAll();
        return list;
    }
    @GetMapping("/{id}")
    public CountyEntity getAll(@PathVariable("id")long id){
        CountyEntity county  = repository.getById(id);
        return county;
    }
    @PostMapping("/add")
    public CountyEntity add(@RequestBody CountyEntity county){

        return repository.addCounty(county);
    }
    @PutMapping("/update/{id}")
    public CountyEntity update(@RequestBody CountyEntity county, @PathVariable("id") long id){
        county = repository.updateCounty(county,id);
        return county;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<CountyEntity> delete(@PathVariable("id") long id){
        boolean isDelete = repository.deleteCounty(id);
        if(isDelete){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

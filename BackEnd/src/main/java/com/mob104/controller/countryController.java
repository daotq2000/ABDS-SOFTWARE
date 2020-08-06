package com.mob104.controller;

import com.mob104.dao.AddressDAO;
import com.mob104.dao.countryDAO;
import com.mob104.model.CountryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/country")
@CrossOrigin(origins = "http://localhost:4200")
public class countryController {
    @Autowired
    private countryDAO repository;
    @GetMapping("")
    public List<CountryEntity> getAll(){
        List<CountryEntity> list = repository.getAll();
        return list;
    }
    @GetMapping("/{id}")
    public CountryEntity getAll(@PathVariable("id")long id){
        CountryEntity address  = repository.getById(id);
        return address;
    }
    @PostMapping("/add")
    public CountryEntity add(@RequestBody CountryEntity address){

        return repository.addCountry(address);
    }
    @PutMapping("/update/{id}")
    public CountryEntity update(@RequestBody CountryEntity address, @PathVariable("id") long id){
        address = repository.updateCountry(address,id);
        return address;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<CountryEntity> delete(@PathVariable("id") long id){
        boolean isDelete = repository.deleteCountry(id);
        if(isDelete){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

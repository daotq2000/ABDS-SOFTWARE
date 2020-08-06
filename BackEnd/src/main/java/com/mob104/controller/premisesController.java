package com.mob104.controller;

import com.mob104.dao.AddressDAO;
import com.mob104.dao.premisesDAO;
import com.mob104.model.PremiseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/premisses")
@CrossOrigin(origins = "http://localhost:4200")
public class premisesController {
    @Autowired
    private premisesDAO repository;
    @GetMapping("")
    public List<PremiseEntity> getAll(){
        List<PremiseEntity> list = repository.getAll();
        return list;
    }
    @GetMapping("/{id}")
    public PremiseEntity getAll(@PathVariable("id")long id){
        PremiseEntity address  = repository.getById(id);
        return address;
    }
    @PostMapping("/add")
    public PremiseEntity add(@RequestBody PremiseEntity address){

        return repository.addPremises(address);
    }
    @PutMapping("/update/{id}")
    public PremiseEntity update(@RequestBody PremiseEntity address, @PathVariable("id") long id){
        address = repository.updatePremises(address,id);
        return address;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<PremiseEntity> delete(@PathVariable("id") long id){
        boolean isDelete = repository.deletePremisses(id);
        if(isDelete){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

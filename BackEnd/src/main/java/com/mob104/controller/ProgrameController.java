package com.mob104.controller;

import com.mob104.dao.programeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import  com.mob104.model.*;

import java.util.List;

@RestController
@RequestMapping("/programe")
@CrossOrigin(origins = "http://localhost:4200")
public class ProgrameController {
    @Autowired private programeDAO service;
    @GetMapping("")
    public List<ProgrammeEntity> getAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public  ProgrammeEntity getById(@PathVariable("id") int id){
        return service.getById(id);
    }
    @PostMapping("/add")
    public ProgrammeEntity addPrograme(@RequestBody ProgrammeEntity programme){
        return service.addPrograme(programme);
    }
    @PutMapping("/update/{id}")
    public ProgrammeEntity updatePrograme(@RequestBody ProgrammeEntity programme, @PathVariable("id")long id){
        ProgrammeEntity programmeEntity= service.updatePrograme(programme,id);
        return programmeEntity;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deletePrograme(@PathVariable("id")long id){
        boolean isDelete = service.deletePrograme(id);
        if(isDelete){
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

package com.mob104.controller;

import com.mob104.dao.serviceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import  com.mob104.model.*;

import java.util.List;

@RestController
@RequestMapping("/service")
@CrossOrigin(origins = "http://localhost:4200")
public class ServiceController {
        @Autowired private serviceDao repository;
        @GetMapping("")
        public List<ServiceEntity> getAll(){
        return repository.getAll();
        }
        @GetMapping("/{id}")
        public ServiceEntity getById(@PathVariable("id") long id){
        ServiceEntity  service = repository.getById(id);
        return service;
        }
        @PostMapping("/add")
        public ServiceEntity addService(@RequestBody ServiceEntity service){
            return repository.addService(service);
        }
        @PutMapping("/update/{id}")
        public ServiceEntity updateEntity(@RequestBody ServiceEntity service, @PathVariable("id") long id){
                return repository.updateService(service,id);
        }
        @DeleteMapping("/delete/{id}")
        public ResponseEntity<ServiceEntity> deleteService(@PathVariable("id") long id){
                boolean isDelete = repository.deleteService(id);
                if(isDelete){
                        return  new ResponseEntity<>(HttpStatus.OK);
                }
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
}

package com.mob104.controller;

import com.mob104.dao.AddressDAO;
import com.mob104.model.AddressEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
@CrossOrigin(origins = "http://localhost:4200")
public class addressController {
    @Autowired
    private AddressDAO repository;
    @GetMapping("")
    public List<AddressEntity> getAll(){
        List<AddressEntity> list = repository.getAll();
        return list;
    }
    @GetMapping("/{id}")
    public AddressEntity getAll(@PathVariable("id")long id){
        AddressEntity address  = repository.getById(id);
        return address;
    }
    @PostMapping("/add")
    public AddressEntity add(@RequestBody AddressEntity address){

        return repository.addAddress(address);
    }
    @PutMapping("/update/{id}")
    public AddressEntity update(@RequestBody AddressEntity address, @PathVariable("id") long id){
        address = repository.updateAddress(address,id);
        return address;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<AddressEntity> delete(@PathVariable("id") long id){
        boolean isDelete = repository.deleteAddress(id);
        if(isDelete){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

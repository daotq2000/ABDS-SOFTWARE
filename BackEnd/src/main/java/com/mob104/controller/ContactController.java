package com.mob104.controller;

import com.mob104.dao.contactDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import  com.mob104.model.*;

@RestController
@RequestMapping("/contact")
@CrossOrigin(origins = "http://localhost:4200")
public class ContactController {
    @Autowired private contactDAO repository;
    @GetMapping("")
    public List<ContactEntity> getAll(){
        List<ContactEntity> list = repository.getAll();
    return list;
    }
    @GetMapping("/{id}")
    public ContactEntity getAll(@PathVariable("id")long id){
        ContactEntity contact  = repository.getById(id);
        return contact;
    }
    @PostMapping("/add")
    public ContactEntity add(@RequestBody ContactEntity contact){

        return repository.addContact(contact);
    }
    @PutMapping("/update/{id}")
    public ContactEntity update(@RequestBody ContactEntity contact, @PathVariable("id") long id){
        contact = repository.updateContact(contact,id);
        return contact;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ContactEntity> delete(@PathVariable("id") long id){
        boolean isDelete = repository.deleteContact(id);
        if(isDelete){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

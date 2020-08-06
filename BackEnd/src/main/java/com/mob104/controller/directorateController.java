package com.mob104.controller;

import com.mob104.dao.directorateDAO;
import com.mob104.dao.directorateDAO;
import com.mob104.model.DirectorateEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/directorate")
@CrossOrigin(origins = "http://localhost:4200")
public class directorateController {
    @Autowired
    private directorateDAO repository;
    @GetMapping("")
    public List<DirectorateEntity> getAll(){
        List<DirectorateEntity> list = repository.getAll();
        return list;
    }
    @GetMapping("/{id}")
    public DirectorateEntity getAll(@PathVariable("id")long id){
        DirectorateEntity directorate  = repository.getById(id);
        return directorate;
    }
    @PostMapping("/add")
    public DirectorateEntity add(@RequestBody DirectorateEntity directorate){

        return repository.addDirect(directorate);
    }
    @PutMapping("/update/{id}")
    public DirectorateEntity update(@RequestBody DirectorateEntity directorate, @PathVariable("id") long id){
        directorate = repository.updateDirect(directorate,id);
        return directorate;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<DirectorateEntity> delete(@PathVariable("id") long id){
        boolean isDelete = repository.deleteDirect(id);
        if(isDelete){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

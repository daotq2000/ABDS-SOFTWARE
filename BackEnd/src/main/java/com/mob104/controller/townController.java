package com.mob104.controller;

import com.mob104.dao.townDAO;
import com.mob104.dao.townDAO;
import com.mob104.model.TownEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/town")
@CrossOrigin(origins = "http://localhost:4200")
public class townController {
    @Autowired
    private townDAO repository;
    @GetMapping("")
    public List<TownEntity> getAll(){
        List<TownEntity> list = repository.getAll();
        return list;
    }
    @GetMapping("/{id}")
    public TownEntity getAll(@PathVariable("id")long id){
        TownEntity town  = repository.getById(id);
        return town;
    }
    @PostMapping("/add")
    public TownEntity add(@RequestBody TownEntity town){

        return repository.addtown(town);
    }
    @PutMapping("/update/{id}")
    public TownEntity update(@RequestBody TownEntity town, @PathVariable("id") long id){
        town = repository.updatetown(town,id);
        return town;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<TownEntity> delete(@PathVariable("id") long id){
        boolean isDelete = repository.deletetown(id);
        if(isDelete){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

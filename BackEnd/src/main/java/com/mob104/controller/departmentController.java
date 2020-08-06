package com.mob104.controller;

import com.mob104.dao.countryDAO;
import com.mob104.dao.departmentDAO;
import com.mob104.dao.departmentDAO;
import com.mob104.model.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/depart")
@CrossOrigin(origins = "http://localhost:4200")
public class departmentController {
    @Autowired
    private departmentDAO repository;
    @GetMapping("")
    public List<DepartmentEntity> getAll(){
        List<DepartmentEntity> list = repository.getAll();
        return list;
    }
    @GetMapping("/{id}")
    public DepartmentEntity getAll(@PathVariable("id")long id){
        DepartmentEntity depart  = repository.getById(id);
        return depart;
    }
    @PostMapping("/add")
    public DepartmentEntity add(@RequestBody DepartmentEntity depart){

        return repository.addDepart(depart);
    }
    @PutMapping("/update/{id}")
    public DepartmentEntity update(@RequestBody DepartmentEntity depart, @PathVariable("id") long id){
        depart = repository.updateDepart(depart,id);
        return depart;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<DepartmentEntity> delete(@PathVariable("id") long id){
        boolean isDelete = repository.deleteDepart(id);
        if(isDelete){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

package com.mob104.controller;

import com.mob104.dao.UserDAO;
import com.mob104.model.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:4200")
public class usersController {
    @Autowired
    private UserDAO repository;
    @GetMapping("")
    public List<UsersEntity> getAll(){
        List<UsersEntity> list = repository.getAll();
        return list;
    }
    @GetMapping("/{id}")
    public UsersEntity getAll(@PathVariable("id")long id){
        UsersEntity users  = repository.getById(id);
        return users;
    }
    @PostMapping("/add")
    public UsersEntity add(@RequestBody UsersEntity users){

        return repository.addUsers(users);
    }
    @PutMapping("/update/{id}")
    public UsersEntity update(@RequestBody UsersEntity users, @PathVariable("id") long id){
        users = repository.updateUsers(users,id);
        return users;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<UsersEntity> delete(@PathVariable("id") long id){
        boolean isDelete = repository.deleteUsers(id);
        if(isDelete){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

package com.example.Elasticsearch.controller;

import com.example.Elasticsearch.Model.UserEntity;
import com.example.Elasticsearch.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepo repo;
    @PostMapping("/insert")
    public void insert(@RequestBody UserEntity user){
        user.setLastTouched(new Date());
        repo.save(user);
        Optional<UserEntity> op=repo.findById("hello");
        //return op.get().getTime();

    }
    @GetMapping("/users")
    public Iterable<UserEntity> getAllUser(){
        return repo.findAll();
    }
}

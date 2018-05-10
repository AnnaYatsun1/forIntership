package com.example.testsprinboot.demo.controllers;

import com.example.testsprinboot.demo.model.User;
import com.example.testsprinboot.demo.service.UseServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class UserComtroller {
    @Autowired
    private UseServise useServise;

    @RequestMapping(method=RequestMethod.GET, value="/users")
    public List<User>  getList(){
        return useServise.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/users")
    public User save(@RequestBody User user) {
       useServise.save(user);
        return user;
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/contacts/{id}")
    public String delete(@PathVariable String id) {
      useServise.delete(id);
        return "";
    }


    @RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
    public ResponseEntity<User> update(@PathVariable String id, @RequestBody User user) {
        Optional<User> us = useServise.findById(id);
        if (!us.isPresent()) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        User us1 = us.get();
        us1.setName(user.getName());
        us1.setLastName(user.getLastName());
        us1.setPhone(user.getPhone());
        useServise.save(us1);
        return new ResponseEntity<User>(us1, HttpStatus.OK);
    }


}
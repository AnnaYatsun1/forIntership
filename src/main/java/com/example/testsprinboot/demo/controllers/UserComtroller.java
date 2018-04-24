package com.example.testsprinboot.demo.controllers;

import com.example.testsprinboot.demo.model.User;
import com.example.testsprinboot.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api")
public class UserComtroller {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/contacts")
    public Iterable<User> user() {
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/contacts")
    public ResponseEntity<User> save(@RequestBody User user) {
        userRepository.save(user);
        return new ResponseEntity<User>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/contacts/{id}")
    public Optional<User> show(@PathVariable String id) {
        return userRepository.findById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/contacts/{id}")
    public ResponseEntity<User> update(@PathVariable String id, @RequestBody User user) {
        Optional<User> us = userRepository.findById(id);
        if (!us.isPresent()) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        User us1 = us.get();
        us1.setName(user.getName());
        us1.setLastName(user.getLastName());
        us1.setPhone(user.getPhone());
        userRepository.save(us1);
        return new ResponseEntity<User>(us1, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/contacts/{id}")
    public String delete(@PathVariable String id) {
        userRepository.deleteById(id);
        return "";
    }

}
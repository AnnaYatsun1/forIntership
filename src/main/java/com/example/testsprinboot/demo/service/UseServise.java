package com.example.testsprinboot.demo.service;

import com.example.testsprinboot.demo.model.User;
import com.example.testsprinboot.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UseServise {
    @Autowired
    private UserRepository repository;


    private static List<User> items = new ArrayList<>();

    static {
        items.add(new User("Anna", "Yatsun", "1111111"));
        items.add(new User("Anna", "Yatsun", "1111111"));
        items.add(new User("Anna", "Yatsun", "1111111"));
        items.add(new User("Anna", "Yatsun", "1111111"));
    }


    //@PostConstruct
//public void init(){
//        repository.saveAll(items);
//}
//
    public List<User> findAll() {
        return repository.findAll();
    }

    public Iterable<User> save(User user) {
        repository.save(user);
        return (Iterable<User>) user;

    }

    public String delete(String id) {
        repository.deleteById(id);
        return "";
    }

    public User update(User user, String id) {
        return user;
    }

    public Optional<User> findById(String id) {
        return repository.findById(id);
    }
}

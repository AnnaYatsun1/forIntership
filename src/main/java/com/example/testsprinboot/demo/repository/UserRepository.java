package com.example.testsprinboot.demo.repository;

import com.example.testsprinboot.demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {

}


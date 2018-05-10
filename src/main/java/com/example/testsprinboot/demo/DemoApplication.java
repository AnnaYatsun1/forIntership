package com.example.testsprinboot.demo;

import com.example.testsprinboot.demo.model.User;
import com.example.testsprinboot.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
public class DemoApplication  {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

}

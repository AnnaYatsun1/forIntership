package com.example.testsprinboot.demo;

import com.example.testsprinboot.demo.model.User;
import com.example.testsprinboot.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication  {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}
//	@Autowired
//	private UserRepository userRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		userRepository.save(new User("one","one", 1111111 ));
//		userRepository.save(new User("two","otwo", 1111111 ));
//	}
}

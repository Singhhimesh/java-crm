package com.krayin.krayin;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.krayin.krayin.entity.User;
import com.krayin.krayin.repositories.UserRepository;

@SpringBootApplication
public class KrayinCrmApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(KrayinCrmApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

		List<User> users = userRepository.findByEmailContaining("suraj");

		users.forEach((user) -> {
			System.out.println(user);
		});
	}
}

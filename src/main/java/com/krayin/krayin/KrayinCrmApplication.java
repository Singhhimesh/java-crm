package com.krayin.krayin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class KrayinCrmApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(KrayinCrmApplication.class, args);
	}
}

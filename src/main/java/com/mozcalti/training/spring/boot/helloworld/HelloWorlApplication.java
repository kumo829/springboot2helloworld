package com.mozcalti.training.spring.boot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.mozcalti.training.spring.boot.helloworld.controllers")
@SpringBootApplication
public class HelloWorlApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorlApplication.class, args);
	}
}

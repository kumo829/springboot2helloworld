package com.mozcalti.training.spring.boot.helloworld.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mozcalti.training.spring.boot.helloworld.data.Greet;

import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {
	@Bean
	CommandLineRunner init() {
		return args -> {
			Flux.just(new Greet("Hugo"),
					  new Greet("Paco"),
					  new Greet("Luis")).subscribe(System.out::println);
		};	
	}
}

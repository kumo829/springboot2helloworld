package com.mozcalti.training.spring.boot.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mozcalti.training.spring.boot.helloworld.data.Greet;

import reactor.core.publisher.Flux;

@RestController
public class HomeController {

	@GetMapping
    public Greet index(@RequestParam(required=false, defaultValue="") String name) {
    	String greet =name.equals("") ? "Hi!" : "Hi " + name + "!";
    	
        return new Greet(greet); 
    }
	
	@GetMapping("/people")
	public Flux<Greet> listing(){
		return Flux.just(new Greet("Hugo"),
				  new Greet("Paco"),
				  new Greet("Luis"));
	}

}
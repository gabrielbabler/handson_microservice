package com.handson.beers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class BeersApplication {
	public static void main(String[] args) {
		SpringApplication.run(BeersApplication.class, args);
	}
	log.info("The microservice handson-beers is started.");

}

package com.handson.beers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

@Slf4j
@SpringBootApplication
public class BeersApplication implements ApplicationRunner {
	public static void main(String[] args) {
		SpringApplication.run(BeersApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		log.info("--------------------- Application Arguments ---------------------");
		Stream.of(applicationArguments.getSourceArgs()).forEach(log::info);
		log.info("--------------------- Application Arguments ---------------------");
		log.info("MS Beers successfully started!");
	}
}

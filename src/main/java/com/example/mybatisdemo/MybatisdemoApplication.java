package com.example.mybatisdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisdemoApplication implements CommandLineRunner {

	@Autowired
	PersonRepository repository;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(MybatisdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Person id 1 -> {}", repository.findById(1L));
	}
}

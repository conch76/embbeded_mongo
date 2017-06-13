package com.conch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmbeddedMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmbeddedMongodbApplication.class, args);
	}
}

package com.icepoint.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestfulApplication.class, args);
		System.out.println("Running...");
	}
}

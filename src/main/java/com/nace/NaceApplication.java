package com.nace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.nace")
@SpringBootApplication
public class NaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NaceApplication.class, args);
	}

}

package com.vapps.carelink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CareLinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CareLinkApplication.class, args);
	}

}

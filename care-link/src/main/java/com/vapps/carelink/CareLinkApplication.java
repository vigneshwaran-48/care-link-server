package com.vapps.carelink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages = { "com.vapps.security", "com.vapps.carelink" })
public class CareLinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CareLinkApplication.class, args);
	}

}

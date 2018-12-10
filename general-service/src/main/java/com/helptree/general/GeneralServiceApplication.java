package com.helptree.general;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GeneralServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeneralServiceApplication.class, args);
	}
}

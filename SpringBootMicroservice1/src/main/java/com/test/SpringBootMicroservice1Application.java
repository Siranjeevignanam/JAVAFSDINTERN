package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMicroservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservice1Application.class, args);
	}

}

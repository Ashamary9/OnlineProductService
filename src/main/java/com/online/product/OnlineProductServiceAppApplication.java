package com.online.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OnlineProductServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineProductServiceAppApplication.class, args);
	}

}

package com.spring.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaTwo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaTwo2Application.class, args);
	}
}

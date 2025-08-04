package com.ozmenyavuz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan
@Configuration
public class SpringbootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestApplication.class, args);
	}

}

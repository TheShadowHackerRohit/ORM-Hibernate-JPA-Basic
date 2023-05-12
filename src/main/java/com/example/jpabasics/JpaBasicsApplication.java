package com.example.jpabasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class JpaBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaBasicsApplication.class, args);
	}

}

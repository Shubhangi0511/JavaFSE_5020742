package com.example.EmployeeManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class employeemanagementsystem {

	public static void main(String[] args) {
		SpringApplication.run(employeemanagementsystem.class, args);
	}
}

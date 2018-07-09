package com.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	PersistenceContext persistenceContext;

	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		employeeRepository.save(new Employee(1, "ali", 10.0));
		Employee employee = employeeRepository.findOne(1);
		System.out.println(employee);
		System.out.println("**DONE**");

	}
}

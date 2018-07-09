package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
	@Autowired
	EmployeeRepository repository;
	
	@Autowired 
	PresistenceContext persist;
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }

	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
	
		
		
		System.out.println(repository.findAll());
		
	}
}

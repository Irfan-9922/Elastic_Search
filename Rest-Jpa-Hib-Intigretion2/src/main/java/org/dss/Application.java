package org.dss;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.dss.beans.EmployeeRegistretion;
import org.dss.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	/*
	 * @Autowired RegistretionRepository repository;
	 */

	@Autowired
	EmployeeService service;

	/*@Autowired
	PersistenceContext persistence;*/

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public void run(String... arg0) throws Exception {
	
		
		
	
		System.out.println(service.getAllRecord());
		
		
	}
	
	/*
	 * if record is not present in db use below method to add static record
	 */

	private void ADD_RECORD() {
		EmployeeRegistretion reg=new EmployeeRegistretion(1, "latur", 413512, new Date(), "Java Dev", "irfan", "Male", "shaikh", "Single", 4545);
		EmployeeRegistretion reg2=new EmployeeRegistretion(2, "NEWYOURK", 90877, new Date(), "Manager", "Farhan", "Male", "Khan", "Single", 3455);
		EmployeeRegistretion reg3=new EmployeeRegistretion(3, "mumbai", 989483, new Date(), "db_Manager", "Neha", "Feale", "Mane", "Married", 2343);
		EmployeeRegistretion reg4=new EmployeeRegistretion(4, "pune", 89838, new Date(), "php", "Mahesh", "Male", "Kale", "Sngle", 21334);

		/* service.createRecord(reg);
		 service.createRecord(reg2);
		 service.createRecord(reg3);
		 service.createRecord(reg4);*/
	}

}

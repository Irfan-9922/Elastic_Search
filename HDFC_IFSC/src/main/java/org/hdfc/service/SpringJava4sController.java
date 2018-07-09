/*
 * Copyright (c) 2018 Bonprix and/or its affiliates. All rights reserved.
 * Bonprix PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package org.hdfc.service;

import java.util.List;
import javax.ws.rs.core.MediaType;

import org.hdfc.beans.EmployeeEntity;
import org.hdfc.dao.RegistretionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * The <code>SpringJava4sController</code> class contains several useful methods
 *thos method calls from   <p>servicelayer</p>
 *this layer is responsible for web call
 *
 * @author  I.Shaikh
 * 
 */
@RestController
public class SpringJava4sController {

	@Autowired
	EmployeeService ser;
	
	@Autowired
	RegistretionRepository repository;

	@RequestMapping("/")
	public String welcome() {
		return "hdfc1111";
	}

	@RequestMapping("/he")
	public String myData() {
		return "Hello hdfc";
	}

	@RequestMapping("/allhdfcbank")

	public List<EmployeeEntity> all() {
   System.out.println("from get all");
		System.out.println(ser.getAllRecord());
		return ser.getAllRecord();

	}

	@RequestMapping("/employee/{id}")
	public EmployeeEntity getone(@PathVariable int id) {

		return ser.getById(id);
	}
	@RequestMapping(value = "/create/employee", method = RequestMethod.POST , consumes=MediaType.APPLICATION_JSON)
	
	public EmployeeEntity createUser(@RequestBody EmployeeEntity user) {
System.out.println("request come here");
		return ser.createRecord(user);
	}
    
	@RequestMapping("/modify")
	public EmployeeEntity updateStudent(@RequestBody EmployeeEntity emp) {
		System.out.println("control comes here");

		if(repository.exists(emp.getId())) {
		return repository.save(emp);
		}else {
			System.out.println("record not found");
			return null;
		}
	}
	
	
	
	
	@RequestMapping("/emp/{id}")
	public void delete(@PathVariable ("id") int i) {

		 ser.deleteById(i);
	}

	

}

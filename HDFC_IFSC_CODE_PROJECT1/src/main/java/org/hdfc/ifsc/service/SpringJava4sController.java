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

package org.hdfc.ifsc.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.hdfc.ifsc.dao.RegistretionRepository;
import org.hdfc.ifsc.entity.HdfcIfscCodeEntity;
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
		return "Welcome to Spring Boot Tutorials";
	}

	@RequestMapping("/hii")
	public String myData() {
		return "Hello hdfc modified";
	}

	@RequestMapping("/allhdfcbank")

	public List<HdfcIfscCodeEntity> all() throws JsonGenerationException, JsonMappingException, IOException {
   System.out.println("from get all");
   //for getting object and converting in to json  and storing into file
   

		return ser.getAllRecord();
		
	}

	@RequestMapping("/employee/{id}")
	public HdfcIfscCodeEntity getone(@PathVariable int id) throws JsonGenerationException, JsonMappingException, IOException {
		   

		return ser.getById(id);
	}
	@RequestMapping(value = "/create/employee", method = RequestMethod.POST , consumes=MediaType.APPLICATION_JSON)
	
	public HdfcIfscCodeEntity createUser(@RequestBody HdfcIfscCodeEntity user) {
System.out.println("request come here");
		return ser.createRecord(user);
	}
    
	/*@RequestMapping("/modify")
	public HdfcIfscCodeEntity updateStudent(@RequestBody HdfcIfscCodeEntity emp) {
		System.out.println("control comes here");

		if(repository.exists(emp.getIFSC())) {
		return repository.save(emp);
		}else {
			System.out.println("record not found");
			return null;
		}*/
//	}
	
	
	
	
	@RequestMapping("/emp/{id}")
	public void delete(@PathVariable ("id") int i) {

		 ser.deleteById(i);
	}

	

}

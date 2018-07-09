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

package org.dss.service;

import java.util.List;

import org.dss.beans.EmployeeEntity;
import org.dss.dao.RegistretionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * The <code>EmployeeService</code> class contains several useful methods
 *that holds  <p>RegistretionRepository</p>
 *like Hibernate configuration bd cresential and transaction for spring data jpa
 * <p>Among the facilities provided by the <code>EmployeeService</code> class
 * are contains main buiseness logic
 *
 * @author  I.Shaikh
 * 
 */

@Service

public class EmployeeService {
	
	@Autowired
	RegistretionRepository repository;
	EmployeeService(){
		
	}
	/*
	 * Get all record from database
	 */
	public List<EmployeeEntity> getAllRecord() {
		//System.out.println("from service layer");
		return (List<EmployeeEntity>) repository.findAll();
	}

	/*
	 * get data based on Id
	 */
	public EmployeeEntity getById(int id) {
		
			return repository.findOne(id);
	
	}

	/*
	 * delete record based on id
	 */
	public void deleteById(int id) {
		repository.delete(id);

	}
	/*
	 * creat new record in database
	 */
	public EmployeeEntity createRecord(EmployeeEntity reg) {
		EmployeeEntity de = repository.save(reg);
		return de;
	}
	
	/*
	 * Update a  record in database
	 */
	public EmployeeEntity update(EmployeeEntity e ) {
		System.out.println("inside update");
		EmployeeEntity de = repository.save(e);
		
		return de;
	}
}

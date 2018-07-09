package org.dss.service;

import java.util.List;

import org.dss.beans.EmployeeRegistretion;
import org.dss.dao.RegistretionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EmployeeService2 {
	
	@Autowired
	RegistretionRepository repository;
	EmployeeService2(){
		
	}
	/*
	 * Get all record from database
	 */
	public List<EmployeeRegistretion> getAllRecord() {
		System.out.println("from service layer");
		return (List<EmployeeRegistretion>) repository.findAll();
	}

	/*
	 * get data based on Id
	 */
	public EmployeeRegistretion getById(int id) {
		
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
	public EmployeeRegistretion createRecord(EmployeeRegistretion reg) {
		EmployeeRegistretion de = repository.save(reg);
		return de;
	}
	
	
}

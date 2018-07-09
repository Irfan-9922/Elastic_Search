package org.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.demo.beans.Emp;
import org.demo.dao.EmpDao;
import org.demo.dao.EmpOnsite;
import org.demo.dao.Empdaoimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class EmpService {
	
	
	@Autowired 
	private Empdaoimpl dao;

	public Empdaoimpl getDao() {
		return dao;
	}

	public void setDao(Empdaoimpl dao) {
		this.dao = dao;
	}

	public void sayHello(){
	      System.out.println("Hello Spring Boot!");
	   }
	
	public int math(int i,int j) {
		
		return i+j;
	}
	
	public List<Emp> allemp(){
		System.out.println("control in service");
		System.out.println("control in service updated");
	List<Emp> al=new ArrayList<Emp>();
	al= dao.getallonsiteEmp();
	System.out.println(al);
	System.out.println(al+"from emp service test");
		return al;
		
	}
	
	public List<Emp> getallonsite(){
		List<Emp> emp=new ArrayList<Emp>();
		System.out.println("servcie hit here");
		emp=dao.getallonsiteEmp();
		System.out.println(emp+"from service layer 11");
		return emp;
	}

	}
	
	
	



package org.dss.db;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dss.beans.Employee;

public class db {
	
	
	private static Map<Integer,Employee> map=new HashMap();
	
	
	static {
		init();
		 List<Employee> list;
	}

	private static void init() {

		Employee d=new Employee(1, "latur", 1234, new Date(), "jd", "irfan", "Male", "shaikh", "single", 2323);
		Employee d2=new Employee(2, "pune", 4543, new Date(), "php", "shubham", "Male", "thakur", "single", 1213);
		Employee d3=new Employee(3, "mumbai", 56454, new Date(), "db", "ramesh", "Male", "malhotra", "marrid", 3434);
		Employee d4=new Employee(4, "hyd", 2113, new Date(), "mn", "nisar", "Male", "shaikh", "single", 54545);
		map.put(d.getId(), d);
		
		map.put(d2.getId(), d2);
		map.put(d3.getId(), d3);
		map.put(d4.getId(), d4);
	    
	  
	}

	
	 /* public static Employee getEmployee(int i) {
	        return map.get(i);
	    }*/
	 public static Employee getEmployee(int i) {
	        return map.get(i);
	    }
	  
	  public static void deleteEmployee(int i) {
		  map.remove(i);
	  }
	  
	  
	  public static Employee creatresource(Employee e) {
		  return map.put(e.getId(), e);
	  }
	  
	   public static List<Employee> getAllEmployees() {
	        Collection<Employee> c = map.values();
	        ArrayList<Employee> list = new ArrayList<Employee>();
	        list.addAll(c);
	        System.out.println(list);
	        return (List<Employee>) list;
	    }
	     
	   public static Employee updateEmployee(Employee emp) {
		   map.put(emp.getId(), emp);
	        return emp;
	    }
	   
	 
	
}

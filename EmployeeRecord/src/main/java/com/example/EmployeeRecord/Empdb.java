/**
 * All rights are reserved for diss.
 */
package com.example.EmployeeRecord;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * @author i.shaikh
 *
 * @Date  Feb 12, 2018
 * @Time  2:38:04 PM
 */
public class Empdb {
	public static Map<Integer,Employee> allemp=new HashMap();
	
	
	
	static {
		init();
	}
	
	
	

	public static List<Employee> allperson(){
		Collection<Employee> dd = allemp.values();
		
		ArrayList al=new ArrayList<>();
		al.add(dd);
		return al;
	}
	
	public static Employee addemp(Employee e) {
		
		return allemp.put(e.getId(), e);
	}

	/**
	 * 
	 */
	private static void init() {
		
		Employee p1=new Employee(1,"latur",1231,new Date(),"jd","irfan","male","shaikh","single",1223);
		Employee p2=new Employee(12,"pune",1231,new Date(),"jd","hhh","mmm","ddd","single",23232);
		
		allemp.put(p1.getId(), p1);
		allemp.put(p2.getId(), p2);
		
		
		
		
		
	}
	public static void main(String[] args) {
		
		System.out.println(allperson());
	}

}

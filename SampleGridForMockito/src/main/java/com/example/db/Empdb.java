/**
 * All rights are reserved for diss.
 */
package com.example.db;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.bean.Employee;



/**
 * @author i.shaikh
 *
 * @Date  Feb 12, 2018
 * @Time  2:38:04 PM
 */
public class Empdb {
	public  Map<Integer,Employee> allemp=new HashMap();
	 {
		init();
	}
	
	/**
	 * @return the allemp
	 */
	public Map<Integer, Employee> getAllemp() {
		return allemp;
	}

	/**
	 * @param allemp the allemp to set
	 */
	public void setAllemp(Map<Integer, Employee> allemp) {
		this.allemp = allemp;
	}

	public  List<Employee> allperson(){
		Collection<Employee> dd = allemp.values();
		
		ArrayList al=new ArrayList<>();
		al.add(dd);
		return al;
	}
	
	public  Employee addemp(Employee e) {
		
		return allemp.put(e.getId(), e);
	}

	private  void init() {
		
		Employee p1=new Employee(111,"irfan",1010);
		Employee p2=new Employee(222,"nisar",2121);
		Employee p3=new Employee(333,"sam",1234);
		Employee p4=new Employee(444,"mack",5678);
		Employee p5=new Employee(555,"mark",6789);
		Employee p6=new Employee(666,"shan",7808);
		
		
		allemp.put(p1.getId(), p1);
		allemp.put(p2.getId(), p2);
		allemp.put(p3.getId(), p3);
		allemp.put(p4.getId(), p4);
		allemp.put(p5.getId(), p5);
		
	
	}
	

}

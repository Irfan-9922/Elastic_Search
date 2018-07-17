/**
 * All rights are reserved for diss.
 */
package com.example.sampletask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author i.shaikh
 *
 * @Date  Feb 19, 2018
 * @Time  3:29:03 PM
 */
public class Backend {
	
	public Map<String ,EmployeeDemo> demo=new HashMap<>();
	
	
	Backend(){
		
		EmployeeDemo d=new EmployeeDemo("1", "latur", 1234, new Date(), "jd", "irfan", "Male", "shaikh", "single", 2323);
		EmployeeDemo d2=new EmployeeDemo("2", "pune", 4543, new Date(), "php", "shubham", "Male", "thakur", "single", 1213);
		EmployeeDemo d3=new EmployeeDemo("3", "mumbai", 56454, new Date(), "db", "ramesh", "Male", "malhotra", "marrid", 3434);
		EmployeeDemo d4=new EmployeeDemo("4", "hyd", 2113, new Date(), "mn", "nisar", "Male", "shaikh", "single", 54545);
		demo.put(d.getId(), d);
		
		demo.put(d2.getId(), d2);
		demo.put(d3.getId(), d3);
		demo.put(d4.getId(), d4);
	}
	
	public List<EmployeeDemo> getAllrecord(){
		
		
		Collection<EmployeeDemo> val = demo.values();
		ArrayList< EmployeeDemo> de=new ArrayList<>();
		de.addAll(val);
		return de;
		
	}
	
	
	
	
	
	

}

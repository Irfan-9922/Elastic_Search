/**
 * All rights are reserved for diss.
 */
package com.example.myapplication1.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.myapplication1.Employee;

/**
 * @author i.shaikh
 *
 * @Date  Feb 9, 2018
 * @Time  6:06:37 PM
 */
public class emp {
	
	public List<Employee>  getemp() {
		
		List<Employee> e=Arrays.asList (new Employee("irfan", "jd", "123"),
				new Employee("ali", "sjd", "736")
				
				);
		System.out.println(e);
		return e;
	
		
		
	}
	public static void main(String[] args) {
		emp e=new emp();
		e.getemp();
	}

}

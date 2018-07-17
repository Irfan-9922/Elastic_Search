/**
 * All rights are reserved for diss.
 */
package com.example.EmployeeRecord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author i.shaikh
 *
 * @Date  Feb 13, 2018
 * @Time  6:37:51 PM
 */
public class Griddemo {

	public static List<Employee> getall=new ArrayList();
	
	public static void addfield(Employee d){
		getall.add(d);
	}
	
	public static List<Employee> alldata(){
		System.out.println(getall);
		return getall;
	}
	
}

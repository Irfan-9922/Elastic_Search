/**
 * All rights are reserved for diss.
 */
package com.example.sampletask;

import java.util.Date;

/**
 * @author i.shaikh
 *
 * @Date  Feb 15, 2018
 * @Time  10:56:16 AM
 */
public class mainclass {

	
	public static void main(String[] args) {

		Employeeservice service=Employeeservice.getInstance();
		System.out.println(service.findall());
		EmployeeDemo emp=	new EmployeeDemo(2, "pune", 1235444, new Date(), "jd", "nisar", "male", "shaikh", "marrid", 12333);
		Employeeservice.addall(emp);
		System.out.println(service.findall());
	}
	

}

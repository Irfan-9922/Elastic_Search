/**
 * All rights are reserved for diss.
 */
package com.example.myapplication1;

import com.vaadin.ui.TextField;

/**
 * @author i.shaikh
 *
 * @Date  Feb 9, 2018
 * @Time  12:46:40 PM
 */
public class Employee {
	
	public String name;
	public String desig;
	public String sal;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", desig=" + desig + ", sal=" + sal + "]";
	}
	/**
	 * @param name
	 * @param desig
	 * @param sal
	 */
	public Employee(String name, String desig, String sal) {
		super();
		this.name = name;
		this.desig = desig;
		this.sal = sal;
	}
	/**
	 * @return the desig
	 */
	public String getDesig() {
		return desig;
	}
	/**
	 * @param desig the desig to set
	 */
	public void setDesig(String desig) {
		this.desig = desig;
	}
	/**
	 * @return the sal
	 */
	public String getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public void setSal(String sal) {
		this.sal = sal;
	}
	
	

}

/**
 * All rights are reserved for diss.
 */
package com.example.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author i.shaikh
 *
 * @Date  Feb 14, 2018
 * @Time  3:24:36 PM
 */
public class Employee implements Serializable{
	private int id;
	private String fName;
	private int sal;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param id
	 * @param fName
	 * @param sal
	 */
	public Employee(int id, String fName, int sal)
	{
		super();
		this.id = id;
		this.fName = fName;
		this.sal = sal;
	}
	/**
	 * 
	 */
	public Employee()
	{
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", sal=" + sal + "]";
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the sal
	 */
	public int getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public void setSal(int sal) {
		this.sal = sal;
	}
	

	
	

}

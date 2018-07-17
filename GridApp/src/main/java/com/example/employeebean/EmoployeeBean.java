/**
 * All rights are reserved for diss.
 */
package com.example.employeebean;

/**
 * @author i.shaikh
 *
 * @Date  Mar 1, 2018
 * @Time  2:31:48 PM
 */
public class EmoployeeBean {
	
	private int empId;
	private String empName;
	private double empSal;
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empSal
	 */
	public double getEmpSal() {
		return empSal;
	}
	/**
	 * @param empSal the empSal to set
	 */
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	/**
	 * @param empId
	 * @param empName
	 * @param empSal
	 */
	public EmoployeeBean(int empId, String empName, double empSal)
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	/**
	 * 
	 */
	public EmoployeeBean()
	{
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmoployeeBean [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	

}

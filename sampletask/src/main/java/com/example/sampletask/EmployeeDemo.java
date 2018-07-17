/**
 * All rights are reserved for diss.
 */
package com.example.sampletask;

import java.io.Serializable;
import java.util.Date;

/**
 * @author i.shaikh
 *
 * @Date  Feb 14, 2018
 * @Time  3:24:36 PM
 */
public class EmployeeDemo {
	private String id;
	
	private String adress;
	private int zipCode;
	private Date joinDate;
	private String designetion;
	private String fName;
	/**
	 * @param id
	 * @param adress
	 * @param zipCode
	 * @param joinDate
	 * @param designetion
	 * @param fName
	 * @param gender
	 * @param lastName
	 * @param mStatus
	 * @param sal
	 */
	public EmployeeDemo(String id, String adress, int zipCode, Date joinDate, String designetion, String fName,
			String gender, String lastName, String mStatus, int sal) {
		super();
		this.id = id;
		this.adress = adress;
		this.zipCode = zipCode;
		this.joinDate = joinDate;
		this.designetion = designetion;
		this.fName = fName;
		Gender = gender;
		this.lastName = lastName;
		this.mStatus = mStatus;
		this.sal = sal;
	}
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public EmployeeDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String Gender;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeDemo [id=" + id + ", adress=" + adress + ", zipCode=" + zipCode + ", joinDate=" + joinDate
				+ ", designetion=" + designetion + ", fName=" + fName + ", Gender=" + Gender + ", lastName=" + lastName
				+ ", mStatus=" + mStatus + ", sal=" + sal + "]";
	}
	private String lastName;
	private String mStatus;
	private int sal;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}
	/**
	 * @param adress the adress to set
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}
	/**
	 * @return the zipCode
	 */
	public int getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * @return the joinDate
	 */
	public Date getJoinDate() {
		return joinDate;
	}
	/**
	 * @param joinDate the joinDate to set
	 */
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	/**
	 * @return the designetion
	 */
	public String getDesignetion() {
		return designetion;
	}
	/**
	 * @param designetion the designetion to set
	 */
	public void setDesignetion(String designetion) {
		this.designetion = designetion;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the mStatus
	 */
	public String getmStatus() {
		return mStatus;
	}
	/**
	 * @param mStatus the mStatus to set
	 */
	public void setmStatus(String mStatus) {
		this.mStatus = mStatus;
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

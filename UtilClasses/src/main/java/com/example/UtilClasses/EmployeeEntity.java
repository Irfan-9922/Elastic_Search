
/*
 * Copyright (c) 2018 Bonprix and/or its affiliates. All rights reserved.
 * Bonprix PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */


package com.example.UtilClasses;



import java.util.Date;


/**
 * The <code>EmployeeEntity</code> class contains several useful class fields
 * and lombok Annotation 
 *
 * <p>Among the facilities provided by the <code>EmployeeEntity</code> class
 * are contains Entity Representation
 *
 * @author  I.Shaikh
 * 
 */



public class EmployeeEntity {
	
	
	
	
	
 private int id;

	
	 private String fName;
	
	private String lastName;
	
	
	private String designetion;
	
	
	private Date joinDate;
	
	
	private int sal;
	

	private String adress;
	
	
	private int zipCode;
	
	
	
	
	private String mStatus;
	
	
	private String Gender;

	
	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", fName=" + fName + ", lastName=" + lastName + ", designetion="
				+ designetion + ", joinDate=" + joinDate + ", sal=" + sal + ", adress=" + adress + ", zipCode="
				+ zipCode + ", mStatus=" + mStatus + ", Gender=" + Gender + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignetion() {
		return designetion;
	}

	public void setDesignetion(String designetion) {
		this.designetion = designetion;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getmStatus() {
		return mStatus;
	}

	public void setmStatus(String mStatus) {
		this.mStatus = mStatus;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public EmployeeEntity() {

	}

	public EmployeeEntity(int id, String adress, int zipCode, Date joinDate, String designetion, String fName,
			String gender, String lastName, String mStatus, int sal) {
		super();
		this.id = id;
		this.adress = adress;
		this.zipCode = zipCode;
		this.joinDate = joinDate;
		this.designetion = designetion;
		this.fName = fName;
		this.Gender = gender;
		this.lastName = lastName;
		this.mStatus = mStatus;
		this.sal = sal;
	}


}

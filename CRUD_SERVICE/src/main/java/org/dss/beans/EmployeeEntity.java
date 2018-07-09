
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


package org.dss.beans;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


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

@Entity

@Table(name="EMPLOYEE_REGISTRETION")


public class EmployeeEntity {
	
	
	
	
	@Id
	@Column(name = "E_ID")
  
 private int id;

	@Column(name = "E_F_NAME")
	
	 private String fName;
	
	@Column(name = "E_LAST_NAME")
	
	private String lastName;
	
	@Column(name = "E_DESIGNETION")
	
	private String designetion;
	
	@Column(name = "E_JION_DATE")
	
	private Date joinDate;
	
	@Column(name = "E_SAL")
	
	private int sal;
	
	@Column(name = "E_ADRESS")

	private String adress;
	
	@Column(name = "E_ZIPCODE")
	
	private int zipCode;
	
	
	
	@Column(name = "E_M_STATUS")
	
	private String mStatus;
	
	@Column(name = "Gender")
	
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

package com.dss.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.elasticsearch.annotations.Document;



@Entity
@Table(name="MOBILE")
@Document(indexName="employeeindex")
public class Mobile implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="mo_id")
	private Integer mo_id;
	@Column(name = "MOBILE_NO")
	private Long mobileNo;
	@Column(name="MOBILE_TYPE")
	private String motype;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
     private User user;
	
	

	/**
	 * @return the mobileNo
	 */
	public Long getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo
	 *            the mobileNo to set
	 */
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the motype
	 */
	public String getMotype() {
		return motype;
	}

	/**
	 * @param motype
	 *            the motype to set
	 */
	public void setMotype(String motype) {
		this.motype = motype;
	}

	/**
	 * @return the user
	 */
	
	
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the mo_id
	 */
	public Integer getMo_id() {
		return mo_id;
	}

	/**
	 * @param mo_id the mo_id to set
	 */
	public void setMo_id(Integer mo_id) {
		this.mo_id = mo_id;
	}


}

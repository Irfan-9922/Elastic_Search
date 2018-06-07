package com.dss.model;

import java.io.Serializable;
import java.util.Set;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "level-nested")
public class Mobile2 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer mo_id;
	@Field(type=FieldType.Long, index=FieldIndex.not_analyzed, store=true)
	private Long mobileNo;	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String motype;
	@Field(type=FieldType.Nested,index=FieldIndex.not_analyzed, store=true)
	private Set<SimType> simType;
	

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

	/**
	 * @return the simType
	 */
	public Set<SimType> getSimType() {
		return simType;
	}

	/**
	 * @param simType the simType to set
	 */
	public void setSimType(Set<SimType> simType) {
		this.simType = simType;
	}
}

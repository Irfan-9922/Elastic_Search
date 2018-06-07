package com.dss.model;

import java.io.Serializable;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "level-nested")
public class SimType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Field(type = FieldType.Integer, index = FieldIndex.not_analyzed, store = true)
	private int id;
	@Field(type = FieldType.String, index = FieldIndex.not_analyzed, store = true)
	private String simName;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the simName
	 */
	public String getSimName() {
		return simName;
	}

	/**
	 * @param simName
	 *            the simName to set
	 */
	public void setSimName(String simName) {
		this.simName = simName;
	}
}

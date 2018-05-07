package com.dss.Hibernatedemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class employee {
	public employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Id
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + "]";
	}
	

}

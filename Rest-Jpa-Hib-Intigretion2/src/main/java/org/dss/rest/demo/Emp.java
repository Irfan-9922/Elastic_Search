package org.dss.rest.demo;

import java.io.Serializable;

public class Emp {
	
	 int id;
	 String name;
	int getId() {
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
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}

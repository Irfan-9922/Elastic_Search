package com.bean;

public class Emp {
	
	private String name;
	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	public Emp() {
		// TODO Auto-generated constructor stub
	}

}

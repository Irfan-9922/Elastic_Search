package org.demo.beans;

public class Emp {
	
	private int id;
	public Emp(int i, double sal, String name) {
		super();
		this.id = i;
		this.sal = sal;
		this.name = name;
	}
	private double sal;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", sal=" + sal + ", name=" + name + "]";
	}

}

package org.demo;

public class Employee {
	
	private String name;
  private int sal;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public Employee(String name, int sal) {
	super();
	this.name = name;
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", sal=" + sal + "]";
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
  
}

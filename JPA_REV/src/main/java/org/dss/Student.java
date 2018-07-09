package org.dss;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int id;
	private String Name;
	private String cource;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String cource) {
		super();
		this.id = id;
		Name = name;
		this.cource = cource;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", cource=" + cource + "]";
	}
	

}

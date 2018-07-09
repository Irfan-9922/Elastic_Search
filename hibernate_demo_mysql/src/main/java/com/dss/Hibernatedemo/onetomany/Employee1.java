package com.dss.Hibernatedemo.onetomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE1")
public class Employee1 {
	
	@Id @GeneratedValue
	private int id;
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Meeting1> meetings=new HashSet<Meeting1>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", meetings=" + meetings + "]";
	}

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee1( String name) {
		super();
		
		this.name = name;
		
	}

	public Set<Meeting1> getMeetings() {
		return meetings;
	}

	public void setMeetings(Set<Meeting1> meetings) {
		this.meetings = meetings;
	}
	
	
}

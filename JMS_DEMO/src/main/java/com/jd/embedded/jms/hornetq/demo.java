package com.jd.embedded.jms.hornetq;

import java.io.Serializable;

public class demo implements Serializable {
	public int id;
	public demo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String name;
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
		return "demo [id=" + id + ", name=" + name + "]";
	}

}

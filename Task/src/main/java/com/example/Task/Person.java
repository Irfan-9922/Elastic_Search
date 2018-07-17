/**
 * All rights are reserved for diss.
 */
package com.example.Task;

/**
 * @author i.shaikh
 *
 * @Date  Feb 20, 2018
 * @Time  6:37:44 PM
 */
public class Person {
	String name;
	String id;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	/**
	 * @param name
	 * @param string
	 */
	public Person(String name, String string) {
		super();
		this.name = name;
		this.id = string;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

}

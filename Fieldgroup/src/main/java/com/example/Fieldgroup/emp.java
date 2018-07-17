/**
 * All rights are reserved for diss.
 */
package com.example.Fieldgroup;

/**
 * @author i.shaikh
 *
 * @Date  Feb 13, 2018
 * @Time  5:46:49 PM
 */
public class emp {
	private int id;
	private String Name;
	/**
	 * 
	 */
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "emp [id=" + id + ", Name=" + Name + "]";
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id
	 * @param name
	 */
	public emp(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

}

/**
 * All rights are reserved for diss.
 */
package com.example.LabelAndTextBox;

/**
 * @author i.shaikh
 *
 * @Date  Feb 12, 2018
 * @Time  7:11:08 PM
 */
public class Planet {
	private String name;

	/**
	 * @param name
	 */
	public Planet(String name) {
		super();
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Planet [name=" + name + "]";
	}

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
	

}

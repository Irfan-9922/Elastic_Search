/**
 * All rights are reserved for diss.
 */
package com.example.LabelAndTextBox;

/**
 * @author i.shaikh
 *
 * @Date  Feb 13, 2018
 * @Time  12:39:13 PM
 */
public class Employee {
	public String name;
	public int id;
	public String designetion;
	/**
	 * @param name
	 * @param id
	 * @param designetion
	 */
	public Employee(String name, int id, String designetion) {
		super();
		this.name = name;
		this.id = id;
		this.designetion = designetion;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", designetion=" + designetion + "]";
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
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the designetion
	 */
	public String getDesignetion() {
		return designetion;
	}
	/**
	 * @param designetion the designetion to set
	 */
	public void setDesignetion(String designetion) {
		this.designetion = designetion;
	}

}

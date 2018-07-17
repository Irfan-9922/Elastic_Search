/**
 * All rights are reserved for diss.
 */
package com.example.myapplication1;

/**
 * @author i.shaikh
 *
 * @Date  Feb 9, 2018
 * @Time  6:43:35 PM
 */
public class Person {
	public String name;
	public int born;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name
	 * @param born
	 */
	public Person(String name, int born) {
		super();
		this.name = name;
		this.born = born;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the born
	 */
	public int getBorn() {
		return born;
	}
	/**
	 * @param born the born to set
	 */
	public void setBorn(int born) {
		this.born = born;
	}

}

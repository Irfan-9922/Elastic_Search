/**
 * 
 */
package com.dss.model;

import java.io.Serializable;
import java.util.Set;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;


/**
 * @author s.parmar
 *
 */
@Document(indexName = "level-nested", type = "ujer")
public class User1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	@Field(type = FieldType.String, index = FieldIndex.analyzed, store = true)
	private String name;
	@Field(type = FieldType.Nested,index=FieldIndex.not_analyzed, store=true)
	private Set<Mobile2> mobile2;

	public User1() {

	}

	public User1(String name, Integer id, Set<Mobile2> mobile2) {
		super();
		this.name = name;
		this.id = id;
		this.mobile2 = mobile2;
	}

	/**
	 * @return the name
	 */

	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */

	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the mobile
	 */

	public Set<Mobile2> getMobile2() {
		return mobile2;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile2(Set<Mobile2> mobile2) {
		this.mobile2 = mobile2;
	}
}

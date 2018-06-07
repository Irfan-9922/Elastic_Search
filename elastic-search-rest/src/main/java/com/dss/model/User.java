/**
 * 
 */
package com.dss.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author s.parmar
 *
 */
@Entity
@Table(name="EMP_DATA")
@Document(indexName="employeeindex")
public class User implements Serializable {
        
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	private Integer id;
	 @Column(name="name")
	private String name;
	 @OneToMany(orphanRemoval = true, mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	 private Set<Mobile> mobile;
	 
	public User() {
		
	}
	
	public User(String name, Integer id,Set<Mobile> mobile) {
		super();
		this.name = name;
		this.id = id;
		this.mobile=mobile;
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
	
	public Set<Mobile> getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(Set<Mobile> mobile) {
		this.mobile = mobile;
	}
}

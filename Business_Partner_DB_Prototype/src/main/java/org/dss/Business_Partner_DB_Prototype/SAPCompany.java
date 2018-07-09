package org.dss.Business_Partner_DB_Prototype;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BP_SAP_IMPORT")
public class SAPCompany {

	@Id
	@Column(name = "BP_SAP_IMPORT_ID")
	private Long id;

	@Column(name = "BP_SAP_PARTNER_NAME")
	private String name;

	@Column(name = "STREET")
	private String street;

	@Column(name = "ZIPCODE")
	private String zipcode;

	@Column(name = "CITY")
	private String city;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "BP_WORKFLOW_ID")
	private Long workflowId;

	/**
	 * @return the id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return this.street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(final String street) {
		this.street = street;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return this.zipcode;
	}

	/**
	 * @param zipcode
	 *            the zipcode to set
	 */
	public void setZipcode(final String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return this.city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(final String city) {
		this.city = city;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return this.country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(final String country) {
		this.country = country;
	}

	/**
	 * Gets the workflow id.
	 *
	 * @return the workflow id
	 */
	public Long getWorkflowId() {
		return this.workflowId;
	}

	/**
	 * Sets the workflow id.
	 *
	 * @param workflowId
	 *            the new workflow id
	 */
	public void setWorkflowId(final Long workflowId) {
		this.workflowId = workflowId;
	}

}
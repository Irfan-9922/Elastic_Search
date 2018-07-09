package org.dss.Business_Partner_DB_Prototype;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The Class Relation.
 *
 * 
 */
@Entity
@Table(name = "BP_RELATION_TYPE")
public class Relation {

	/** The id. */
	@Id
	@Column(name = "BP_RELATION_TYPE_ID")
	private Long id;

	/** The name. */
	@Column(name = "NAME")
	private String name;

	/** The description. */
	@Column(name = "DESCRIPTION")
	@OrderBy
	private String description;

	/** The workflow id. */
	@Column(name = "BP_WORKFLOW_ID")
	private Long workFlowId; 

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description
	 *            the new description
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * Gets the workflow id.
	 *
	 * @return the workflow id
	 */
	public Long getWorkFlowId() {
		return this.workFlowId;
	}

	/**
	 * Sets the workflow id.
	 *
	 * @param workflowId
	 *            the new workflow id
	 */
	public void setWorkFlowId(final Long workFlowId) {
		this.workFlowId = workFlowId;
	}
}

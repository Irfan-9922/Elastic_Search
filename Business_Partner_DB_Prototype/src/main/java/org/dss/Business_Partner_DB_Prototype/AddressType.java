package org.dss.Business_Partner_DB_Prototype;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
        name = "BP_ADDRESS_TYPE"
       )
public class AddressType {

    @Id
    @Column(
            name = "BP_ADDRESS_TYPE_ID")
    
    private Long id;

    @Column(
            name = "DESCRIPTION")
    private String description;

    @Column(
            name = "BP_WORKFLOW_ID")
    private Long workflowId;

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Long getWorkflowId() {
        return this.workflowId;
    }

	public void setWorkflowId(Long workflowId) {
		this.workflowId = workflowId;
	}
}

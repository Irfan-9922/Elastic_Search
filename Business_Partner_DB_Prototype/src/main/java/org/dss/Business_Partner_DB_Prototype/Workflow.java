/**
 * 
 */
package org.dss.Business_Partner_DB_Prototype;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The Class Workflow.
 *
 * @author s.laddha
 */
@Entity
@Table(
        name = "BP_WORKFLOW"
       )
public class Workflow {

    /** The id. */
    @Id
    @Column(
            name = "BP_WORKFLOW_ID")
   
    private Long id;

    /** The DESCRIPTION. */
    @Column(
            name = "DESCRIPTION")
    private String description;

    /** The is default. */
    @Column(
            name = "IS_DEFAULT")
    private Integer isDefault = 0;

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
     * @param id the new id
     */
    public void setId(final Long id) {
        this.id = id;
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
     * @param description the new description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Gets the checks if is default.
     *
     * @return the checks if is default
     */
    public Integer getIsDefault() {
        return this.isDefault;
    }

    /**
     * Sets the checks if is default.
     *
     * @param isDefault the new checks if is default
     */
    public void setIsDefault(final Integer isDefault) {
        this.isDefault = isDefault;
    }

}

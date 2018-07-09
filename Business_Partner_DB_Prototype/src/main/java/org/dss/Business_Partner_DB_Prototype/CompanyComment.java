package org.dss.Business_Partner_DB_Prototype;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(
    name = "BP_COMPANY_COMMENT"
    )
public class CompanyComment {
	
	@Id
    @Column(
        name = "BP_COMPANY_COMMENT_ID")
   
    private Long id;

    @Column(
        name = "COMMENTS")
    private String comments;

    @Column(
        name = "MODIFIED_DATE")
    private ZonedDateTime lastModified;

    @Column(
        name = "CREATOR")
    private Long createdBy;
    
   @ManyToOne
    @JoinColumn(
        name = "BP_COMPANY_ID")
    private Company company;
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public ZonedDateTime getLastModified() {
		return lastModified;
	}

	public void setLastModified(ZonedDateTime lastModified) {
		this.lastModified = lastModified;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	
	

}

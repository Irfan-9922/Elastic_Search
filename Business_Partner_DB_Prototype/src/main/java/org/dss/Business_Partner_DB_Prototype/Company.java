package org.dss.Business_Partner_DB_Prototype;


import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Optimized class with reduses setters and getters
 */


@Entity
@Table(name="DS_BP_GLOBLE_COMPANY")
//@Data
public class Company {
	
	
	@Id
    @Column(
        name = "BP_COMPANY_ID")
  private Long id;
  
  @Column(
	        name = "BP_COMPANY_NAME")
	    private String name;

  @Column(
	        name = "OPTLOCK")
	    private Long optLock;
  
  @Column(
	        name = "EMAIL_ADDRESS")
	    private String emailAddress;
  
  @Column(
	        name = "HOME_PAGE")
	    private String homePage;
  @Column(
	        name = "MAIN_CONTACT_NAME")
	    private String mainContactName;
  @Column(
	        name = "MAIN_CONTACT_JOB_TITLE")
	    private String mainContactJobTitle;
  @Column(
	        name = "SUPPLIER_NO")
	    private Long supplierNo;
  @Column(
	        name = "ZLKZ")
	    private Long sapNo;

  @Column(
	        name = "BP_WORKFLOW_ID")
	    private Long workFlowId;
  /** The partner group list. is pending
   * and all mappings are pending
   * 
   */
  @OneToMany(
	        mappedBy = "company",
	        fetch = FetchType.LAZY,
	        cascade = CascadeType.ALL
	        )
	    private Set<CompanyaBankDetail> bankDetails=new HashSet<CompanyaBankDetail>();
  
  
  
  @OneToMany(
		  mappedBy ="company",
		  fetch = FetchType.LAZY,
		  cascade =CascadeType.ALL
		  )
  private Set<CompanyComment> comment=new HashSet<CompanyComment>();
  
  
  public Set<Address> getAdress() {
	return adress;
}

public void setAdress(Set<Address> adress) {
	this.adress = adress;
}

@OneToMany(
		  mappedBy="company",
		  fetch = FetchType.LAZY,
		  cascade =CascadeType.ALL
		  )
  private Set<Address> adress=new HashSet<Address>();
  
  public Set<CompanyComment> getComment() {
	return comment;
}

public void setComment(Set<CompanyComment> comment) {
	this.comment = comment;
}

@Column(
	        name = "MD_CLIENT_ID")
	    private Long clientId;

	    @Column(
	        name = "CREATION_DATE")
	    private ZonedDateTime created;

	    @Column(
	        name = "CREATOR")
	    private Long createdBy;

	   @Column(
	            name = "MODIFIED_DATE")
	        private ZonedDateTime lastModified;

	        @Column(
	            name = "MODIFIER")
	        private Long lastModifiedBy;
	
	  public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getOptLock() {
		return optLock;
	}

	public void setOptLock(Long optLock) {
		this.optLock = optLock;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getHomePage() {
		return homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}

	public String getMainContactName() {
		return mainContactName;
	}

	public void setMainContactName(String mainContactName) {
		this.mainContactName = mainContactName;
	}

	public String getMainContactJobTitle() {
		return mainContactJobTitle;
	}

	public void setMainContactJobTitle(String mainContactJobTitle) {
		this.mainContactJobTitle = mainContactJobTitle;
	}

	public Long getSupplierNo() {
		return supplierNo;
	}

	public void setSupplierNo(Long supplierNo) {
		this.supplierNo = supplierNo;
	}

	public Long getSapNo() {
		return sapNo;
	}

	public void setSapNo(Long sapNo) {
		this.sapNo = sapNo;
	}

	public Long getWorkFlowId() {
		return workFlowId;
	}

	public void setWorkFlowId(Long workFlowId) {
		this.workFlowId = workFlowId;
	}

	public Set<CompanyaBankDetail> getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(Set<CompanyaBankDetail> bankDetails) {
		this.bankDetails = bankDetails;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public ZonedDateTime getCreated() {
		return created;
	}

	public void setCreated(ZonedDateTime created) {
		this.created = created;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public ZonedDateTime getLastModified() {
		return lastModified;
	}

	public void setLastModified(ZonedDateTime lastModified) {
		this.lastModified = lastModified;
	}

	public Long getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(Long lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	
}

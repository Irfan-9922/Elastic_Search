package org.dss.Business_Partner_DB_Prototype;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="BP_COMPANY_BANK_DETAIL")
//@Data
public class CompanyaBankDetail {
	
	

	@Id
	    @Column(
	            name = "BP_COMPANY_BANK_DETAIL_ID")
	 private Long id;
  @ManyToOne(fetch=FetchType.LAZY)
     @JoinColumn(name="BP_COMPANY_ID")
	  private Company company;
	  
	  @Column(
	            name = "VAT_IDENTITY_NO")
	    private String VATIdentityNo;

	    @Column(
	            name = "COMMERCIAL_REGISTER_ENTRY")
	    private String commercialRegisterEntry;

	    @Column(
	            name = "INTERNATIONAL_BANK_ACCOUNT_NO")
	    private String internationBankAccountNo;

	    @Column(
	            name = "BANK_IDENTIFIER_CODE")
	    private String bankIdentifierCode;

	    @Column(
	            name = "BANK_NAME")
	    private String bankName;

	    @Column(
	            name = "MD_CURRENCY_ID")
	    private Long currencyId;

	 public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getVATIdentityNo() {
		return VATIdentityNo;
	}

	public void setVATIdentityNo(String vATIdentityNo) {
		VATIdentityNo = vATIdentityNo;
	}

	public String getCommercialRegisterEntry() {
		return commercialRegisterEntry;
	}

	public void setCommercialRegisterEntry(String commercialRegisterEntry) {
		this.commercialRegisterEntry = commercialRegisterEntry;
	}

	public String getInternationBankAccountNo() {
		return internationBankAccountNo;
	}

	public void setInternationBankAccountNo(String internationBankAccountNo) {
		this.internationBankAccountNo = internationBankAccountNo;
	}

	public String getBankIdentifierCode() {
		return bankIdentifierCode;
	}

	public void setBankIdentifierCode(String bankIdentifierCode) {
		this.bankIdentifierCode = bankIdentifierCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Long getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}
;

}

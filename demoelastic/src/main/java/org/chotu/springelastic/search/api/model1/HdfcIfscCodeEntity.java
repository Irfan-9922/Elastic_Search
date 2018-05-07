package org.chotu.springelastic.search.api.model1;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="ifsc4")
public class HdfcIfscCodeEntity {
	
	
	@Column(name="BANK")
	String BANK;
	
	@Id
	@Column(name="IFSC")
	String IFSC	;
	
	@Column(name="MICR")
	String  MICR	;
	
	@Column(name="BRANCH")
	String BRANCH;

	@Column(name="ADDRESS")
	String ADDRESS	;
	
	@Column(name="CONTACT")
	String CONTACT;	
	
	@Column(name="CITY")
	String CITY	;
	
	@Column(name="DISTRICT")
	String DISTRICT;
	
	@Column(name="STATE")
	String STATE;
	
	public String getBANK() {
		return BANK;
	}
	public void setBANK(String bANK) {
		BANK = bANK;
	}
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	public String getMICR() {
		return MICR;
	}
	public void setMICR(String mICR) {
		MICR = mICR;
	}
	public String getBRANCH() {
		return BRANCH;
	}
	public void setBRANCH(String bRANCH) {
		BRANCH = bRANCH;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public String getCONTACT() {
		return CONTACT;
	}
	public void setCONTACT(String cONTACT) {
		CONTACT = cONTACT;
	}
	public String getCITY() {
		return CITY;
	}
	public void setCITY(String cITY) {
		CITY = cITY;
	}
	public String getDISTRICT() {
		return DISTRICT;
	}
	public void setDISTRICT(String dISTRICT) {
		DISTRICT = dISTRICT;
	}
	@Override
	public String toString() {
		return "IFCE_CODE [BANK=" + BANK + ", IFSC=" + IFSC + ", MICR=" + MICR + ", BRANCH=" + BRANCH + ", ADDRESS="
				+ ADDRESS + ", CONTACT=" + CONTACT + ", CITY=" + CITY + ", DISTRICT=" + DISTRICT + ", STATE=" + STATE
				+ "]";
	}
	public String getSTATE() {
		return STATE;
	}
	public HdfcIfscCodeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HdfcIfscCodeEntity(String bANK, String iFSC, String mICR, String bRANCH, String aDDRESS, String cONTACT, String cITY,
			String dISTRICT, String sTATE) {
		super();
		BANK = bANK;
		IFSC = iFSC;
		MICR = mICR;
		BRANCH = bRANCH;
		ADDRESS = aDDRESS;
		CONTACT = cONTACT;
		CITY = cITY;
		DISTRICT = dISTRICT;
		STATE = sTATE;
	}
	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}



	
	
}

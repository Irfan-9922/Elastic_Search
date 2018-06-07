package com.basant.spring.data.elasticsearch.api.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
@Document(indexName = "users", type = "users", shards = 2)
public class HdfcIfscCodeEntity implements Serializable{
	
	
	String BANK;
	
	@Id
	String IFSC	;
	
	String  MICR	;
	
	String BRANCH;

	String ADDRESS	;
	
	String CONTACT;	
	
	String CITY	;
	
	String DISTRICT;
	
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
	
	public HdfcIfscCodeEntity(long l, String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
	}
	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}



	
	
}

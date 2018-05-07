package org.chotu.springelastic.search.api.model1;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
@Document(indexName = "users1", type = "users1", shards = 21)
public class HdfcIfscCodeEntity2 {
	
	
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
	public HdfcIfscCodeEntity2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HdfcIfscCodeEntity2(String bANK, String iFSC, String mICR, String bRANCH, String aDDRESS, String cONTACT, String cITY,
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

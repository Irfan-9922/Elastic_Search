package com.dss.Hibernatedemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "MT_MASTEROBJECT")
public class MasterObject {
	

	@Override
	public String toString() {
		return "MasterObject [masterObjectId=" + masterObjectId + ", masterInstances=" + masterInstances + "]";
	}

	@Id
	@Column(name =" MT_MASTEROBJECT_ID ")
	Long  masterObjectId;
	
	 @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MT_MASTERINSTANCE_ID")
	 
	 MasterInstance masterInstances;

	public Long getMasterObjectId() {
		return masterObjectId;
	}

	public void setMasterObjectId(Long masterObjectId) {
		this.masterObjectId = masterObjectId;
	}

	public MasterInstance getMasterInstances() {
		return masterInstances;
	}

	public void setMasterInstances(MasterInstance masterInstances) {
		this.masterInstances = masterInstances;
	}
	 
   
	
	

}

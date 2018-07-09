package com.dss.Hibernatedemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name ="MT_MASTERINSTANCE" )
public class MasterInstance {
	

	@Id
	@Column(name="MT_MASTERINSTANCE_ID")
	Long  ID	;
	
	@Column(name="MD_OBJECT_LEVEL_ID")
	Long   Object_ID 	;
	
	
	@Column(name=" MS_RULE_V_ID ")
	Long  MS_RULE_V_ID ;
	
	 @OneToMany(mappedBy = "masterInstances", 
			 fetch = FetchType.LAZY,
			  cascade =CascadeType.ALL
			 )
	    private List<MasterObject> items = new ArrayList<MasterObject>();

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public Long getObject_ID() {
		return Object_ID;
	}

	public void setObject_ID(Long object_ID) {
		Object_ID = object_ID;
	}

	public Long getMS_RULE_V_ID() {
		return MS_RULE_V_ID;
	}

	public void setMS_RULE_V_ID(Long mS_RULE_V_ID) {
		MS_RULE_V_ID = mS_RULE_V_ID;
	}

	public List<MasterObject> getItems() {
		return items;
	}

	public void setItems(List<MasterObject> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "MasterInstance [ID=" + ID + ", Object_ID=" + Object_ID + ", MS_RULE_V_ID=" + MS_RULE_V_ID + ", items="
				+ items + "]";
	}

	public MasterInstance() {
		super();
		// TODO Auto-generated constructor stub
	}

	 
	 
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

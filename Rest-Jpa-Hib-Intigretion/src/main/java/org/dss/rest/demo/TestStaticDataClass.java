package org.dss.rest.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestStaticDataClass {
	
	
	
	Map<Integer,Emp> allemp=new HashMap<Integer,Emp>();
	
	
	TestStaticDataClass(){
	
	Emp e1=new Emp(1,"irfan");
	Emp e2=new Emp(2,"nisar");

	Emp e3=new Emp(3,"rehan");

	Emp e4=new Emp(4,"sham");

	allemp.put(e1.getId(), e1);
	allemp.put(e2.getId(), e2);
	allemp.put(e3.getId(), e3);
	allemp.put(e4.getId(), e4);
	}
	
	
	public List<Emp> getall(){
		Collection<Emp> va = allemp.values();
		ArrayList al=new ArrayList();
		al.add(va);
		return al;
		
	}
	
	
	
	
	
	
	
	

}

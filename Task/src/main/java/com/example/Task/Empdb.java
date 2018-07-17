/**
 * All rights are reserved for diss.
 */
package com.example.Task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vaadin.ui.AbstractSelect.NewItemHandler;

/**
 * @author i.shaikh
 *
 * @Date Feb 12, 2018
 * @Time 2:38:04 PM
 */
   public class Empdb {
	public static Map<String, EmployeeEntity> allemp = new HashMap();
	public static Map<String, EmployeeEntity> fromdb = new HashMap();
	public static  List<EmployeeEntity> addallempfromweb=new ArrayList<>();
	
	
	public  Map<String, EmployeeEntity> addregistretion=new HashMap<>();
	 EmployeeEntity e;

	static {
		init();
		allpersonfromdb();
		getallempfromdb();
		
	}
	
	
	
	
	public static  List<EmployeeEntity>getallempfromdb(){
		return addallempfromweb;
		
	}
	
	/**
	 * 
	 */
	EmployeeEntity registretionform(EmployeeEntity e) {
		// TODO Auto-generated method stub
		return addregistretion.put(e.getId(), e);
		
	}

	public static List<EmployeeEntity> allpersonfromdb() {
		Collection<EmployeeEntity> dd = fromdb.values();

		ArrayList al1 = new ArrayList<>();
		al1.add(dd);
		return al1;
	}
	
	
	
	public static EmployeeEntity addempfromdb(EmployeeEntity e) {

		return fromdb.put(e.getId(), e);
	}

	
	
	
	
	
	
	
	

	public static List<EmployeeEntity> allperson() {
		Collection<EmployeeEntity> dd = allemp.values();

		ArrayList al = new ArrayList<>();
		al.add(dd);
		return al;
	}

	public static EmployeeEntity addemp(EmployeeEntity e) {

		return allemp.put(e.getId(), e);
	}

	/**
	 * 
	 */
	private static void init() {

		EmployeeEntity p1 = new EmployeeEntity("1", "latur", 1231, new Date(), "jd", "irfan", "male", "shaikh",
				"single", 1223);
		EmployeeEntity p2 = new EmployeeEntity("12", "pune", 1231, new Date(), "jd", "hhh", "mmm", "ddd", "single",
				23232);

		allemp.put(p1.getId(), p1);
		allemp.put(p2.getId(), p2);

	}


}

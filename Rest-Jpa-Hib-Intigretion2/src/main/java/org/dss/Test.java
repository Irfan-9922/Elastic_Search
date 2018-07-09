package org.dss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dss.beans.EmployeeRegistretion;
import org.dss.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/hi")
public class Test {
	
	@Autowired
	EmployeeService service;

	@Autowired
	PersistenceContext persistence;
	
	// This method is called if HTML is request
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	 
	  public List< EmployeeRegistretion> allrecord(){
		  
	System.out.println("request comes here");
	Collection ser=service.getAllRecord();
	ArrayList al=new ArrayList<EmployeeRegistretion>();
	System.out.println(al+"from al");
		return al;
		  
	  }
}

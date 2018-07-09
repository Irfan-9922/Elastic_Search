package org.dss.rest.demo;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Restservice {

	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Emp> getall(){
		Emp e1=new Emp(1,"irfan");
		Emp e2=new Emp(2,"nisar");

		Emp e3=new Emp(3,"rehan");

		Emp e4=new Emp(4,"sham");

		ArrayList< Emp> li=new ArrayList<Emp>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		
return  li;
	}
}

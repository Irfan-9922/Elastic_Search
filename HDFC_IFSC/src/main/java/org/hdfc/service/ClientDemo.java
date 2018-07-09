package org.hdfc.service;

import java.io.File;
import java.util.Date;

import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.map.ObjectMapper;
import org.hdfc.beans.EmployeeEntity;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientDemo {

	
	  public static void main(String[] args) {
		  
	        Client client=Client.create();
	        
	     /*   String allrecord="http://localhost:8888/employees";
	        String getrecordbyid="http://localhost:8888/employee/1";
	     
	      WebResource res = client.resource(allrecord);
	   
	     ClientResponse dd = res.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
	     
	     
	     */
	     ObjectMapper mapper = new ObjectMapper();

	     try {
      EmployeeEntity bean =new EmployeeEntity(111,"nnn",9999,new Date(),"pp","pp","m","kkk","s",12);
	     	// Object to JSON in file
	     	mapper.writeValue(new File("D:\\file.json"), bean);
	     	System.out.println("json data is write" + bean);

	     	String Employee = "http://localhost:8888//create/employee";
	    	WebResource res2 = client.resource(Employee);
	    	
	    	ClientResponse response = res2.accept(MediaType.APPLICATION_JSON).post(ClientResponse.class, bean);
	    	System.out.println(response.getStatus());
	    	if (response.getStatus() != 201) {
	    		throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
	    	} else {
	    		System.out.println("ok");
	    	}
	     
	    
	      
}
	     catch (Exception e) {
			// TODO: handle exception
		}
}


}
	
	

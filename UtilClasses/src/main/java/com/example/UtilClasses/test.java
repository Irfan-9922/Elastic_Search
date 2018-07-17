/**
 * All rights are reserved for diss.
 */
package com.example.UtilClasses;

import java.util.Date;

import javax.ws.rs.core.MediaType;


import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * @author i.shaikh
 *
 * @Date  Feb 23, 2018
 * @Time  11:10:32 AM
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*EmployeeEntity e1=new EmployeeEntity(1, "www", 111, new Date(), "fff", "sss", "mmm", "fff", "fff", 111);

	
		*/
		
		

        Client client=Client.create();
        
        String allrecord="http://localhost:8888/employees";
        String getrecordbyid="http://localhost:8888/employee/2";
        
       
        
      WebResource res = client.resource(allrecord);
        WebResource res2 = client.resource(getrecordbyid);
     
        
        
     ClientResponse dd = res.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
      ClientResponse dd2 = res2.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
      
      EmployeeEntity e=new EmployeeEntity(1090, "www", 111, new Date(), "fff", "sss", "mmm", "fff", "fff", 111);
  Gson g=new Gson();
		
		WebResource webResource = client
		   .resource("http://localhost:8888//create/employee");
		ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON)
		   .post(ClientResponse.class, g.toJson(e));
		System.out.println(g.toJson(e));

		if (response.getStatus() != 201) {
			throw new RuntimeException("Failed : HTTP error code : "
			     + response.getStatus());
		}

	  } 

	  


}
		
		



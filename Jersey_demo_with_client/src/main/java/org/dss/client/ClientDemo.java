package org.dss.client;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;

public class ClientDemo {

	
	  public static void main(String[] args) {
	        Client client=Client.create();
	        
	        String allrecord="http://localhost:8080/employees";
	        String getrecordbyid="http://localhost:9091/Jersey_demo/rest/employees/1";
	        
	        WebResource res = client.resource(allrecord);
	        
	      ClientResponse dd = res.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
	      
	      if(dd.getStatus() == 200){
              
              String output = dd.getEntity(String.class);
              System.out.println(output);    
              
          }else System.out.println("Somthing went wrong..!");        
  
}
}
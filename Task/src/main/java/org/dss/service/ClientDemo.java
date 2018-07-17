package org.dss.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.example.Task.Empdb;
import com.example.Task.EmployeeEntity;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

public class ClientDemo {

	
   
	
	public static void main(String args[]) throws JsonParseException, JsonMappingException, IOException {

	
	  Client client=Client.create();
	  
	  String getrecordbyid="http://localhost:8888/employees"; 
	  WebResource res2 = client.resource(getrecordbyid); 
	  
	  ClientResponse dd2 =res2.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
	  
	  String output = dd2.getEntity(String.class);
	 
	  System.out.println(output);
	 
	  ClientDemo converter = new ClientDemo();
	
	  converter.fromJson(output);

	}

	public Object fromJson(String json) throws JsonParseException, JsonMappingException, IOException {
		 ObjectMapper objectMapper = new ObjectMapper();
		
		 List<EmployeeEntity> navigation = objectMapper.readValue(json,objectMapper.getTypeFactory().constructCollectionType(
		                    List.class, EmployeeEntity.class));
		
		 Empdb.addallempfromweb.addAll(navigation);
		 System.out.println("from navigation11"+Empdb.getallempfromdb());
		           
	//	EmployeeEntity garima = new ObjectMapper().readValue(json, EmployeeEntity.class);
		 

		return navigation;
	}

	 
	  
	  
	 

	
	
}
package com.example.UtilClasses;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.map.JsonMappingException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class Jackson2Example {

	public static void main(String[] args) {
		Jackson2Example obj = new Jackson2Example();
		obj.run();
	}

	private void run() {
		ObjectMapper mapper = new ObjectMapper();

		EmployeeEntity staff = createDummyObject();

		try {
			// Convert object to JSON string and save into a file directly
			mapper.writeValue(new File("D:\\staff.json"), staff);

			// Convert object to JSON string
			String g = mapper.writeValueAsString(staff);
			System.out.println(g);

			// Convert object to JSON string and pretty print
			g = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
		//	System.out.println(g);
			
	
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private EmployeeEntity createDummyObject() {

		 EmployeeEntity e=new EmployeeEntity(1090, "www", 111, new Date(), "fff", "sss", "mmm", "fff", "fff", 111);

		

		return e;

	}

}
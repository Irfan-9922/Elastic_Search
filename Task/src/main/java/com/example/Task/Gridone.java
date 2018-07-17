/**
 * All rights are reserved for diss.
 */
package com.example.Task;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.dss.service.ClientDemo;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;

/**
 * @author i.shaikh
 *
 * @Date Feb 21, 2018
 * @Time 4:39:52 PM
 */
public class Gridone extends FormLayout {
	VerticalLayout layout = new VerticalLayout();
	
	/*
	 * this method is used for Json to java convertion
	 */
	public Object fromJson(String json) throws JsonParseException, JsonMappingException, IOException { 
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		List<EmployeeEntity> navigation = objectMapper.readValue(json,
				objectMapper.getTypeFactory().constructCollectionType(List.class, EmployeeEntity.class));
		
		
		
		
		
		BeanItemContainer<EmployeeEntity> container = new BeanItemContainer<EmployeeEntity>(EmployeeEntity.class,
				navigation);
		Grid grid = new Grid(container);
	grid.setEditorEnabled(true);
	
	grid.setEditorBuffered(true);
	grid.addSelectionListener(li ->{
	
	});
		layout.addComponent(grid);
		return navigation;
	}

	Gridone() throws JsonParseException, JsonMappingException, IOException
	{
		Client client = Client.create();
		String getrecordbyid = "http://localhost:8888/employees";
		WebResource res2 = client.resource(getrecordbyid);
		ClientResponse dd2 = res2.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		
		String output = dd2.getEntity(String.class);
		System.out.println(output);
		fromJson(output);
		layout.setMargin(true);
		layout.setSpacing(true);
		addComponent(layout);
	}

}

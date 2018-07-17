/**
 * All rights are reserved for diss.
 */
package com.example.NavigationDemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * @author i.shaikh
 *
 * @Date Feb 26, 2018
 * @Time 3:27:08 PM
 */
public class Griddemo extends VerticalLayout implements View {
	

	VerticalLayout layout = new VerticalLayout();
	HorizontalLayout hl=new HorizontalLayout();
	TextField searchBYName=new TextField();
	ObjectMapper objectMapper = new ObjectMapper();
	CheckBox ch=new CheckBox("ann sal>1000000");
	CheckBox ch1=new CheckBox("ann sal<100000");
	ComboBox co=new ComboBox();
	String des=null;
	
	List<EmployeeEntity> cash=new ArrayList<EmployeeEntity>();
	List<EmployeeEntity> cash1=new ArrayList<EmployeeEntity>();
	List<EmployeeEntity> cash2=new ArrayList<EmployeeEntity>();

	public Object fromJson(String json) throws JsonParseException, JsonMappingException, IOException {
		List<EmployeeEntity> navigation = objectMapper.readValue(json,
				objectMapper.getTypeFactory().constructCollectionType(List.class, EmployeeEntity.class));
		BeanItemContainer<EmployeeEntity> container = new BeanItemContainer<EmployeeEntity>(EmployeeEntity.class,
				navigation);
		EmployeeEntity en = new EmployeeEntity();
		Grid grid = new Grid(container);
		Button Update = new Button("Update");
		Button clear = new Button("Clear");
		Update.addClickListener(fff -> {
			EmployeeEntity ff = (EmployeeEntity) grid.getSelectedRow();
			// here i am fetching data from grid cell
			ObjectMapper objectMapper = new ObjectMapper();
			try {
				String jsonInString = objectMapper.writeValueAsString(ff);

				Client client = Client.create();
				String update = "http://localhost:8888/modify";
				System.out.println(update);
				WebResource res2 = client.resource(update);
				System.out.println(res2);

				ClientResponse dd2 = res2.type(MediaType.APPLICATION_JSON).put(ClientResponse.class, jsonInString);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
			
		grid.setEditorEnabled(true);
		 grid.setSizeFull();

		grid.setResponsive(true);
		// System.out.println(h);
		grid.setFooterVisible(true);
		grid.setHeaderVisible(true);
		grid.addItemClickListener(li -> {

		});
		
		//to Do
				clear.addClickListener(li -> {

					EmployeeEntity employeeEntity = (EmployeeEntity) grid.getSelectedRow();
					
				//here i exepectet  id
					String ii = employeeEntity.getId();
					
					System.out.println(ii+"ID");
					Client client = Client.create();
					String delete ="http://localhost:8888/emp/"+ii;
					System.out.println(delete+"hitting to service");
					WebResource res2 = client.resource(delete);
					System.out.println(res2);

					ClientResponse dd2 = res2.type(MediaType.APPLICATION_JSON).delete(ClientResponse.class);
					container.removeItem(employeeEntity);
				});
				
				int count=0;
				for(int i=0;i<navigation.size();i++) {
					//get all record
					EmployeeEntity emp1=navigation.get(i);
					//get all designetion 
					des = emp1.getDesignetion();
					//add all designetion to list
					co.addItem(des);
					int annsal=emp1.getSal()*12;
					if(annsal>1000000) {
						cash.add(emp1);
						
					}
					if(annsal<100000) {
						cash1.add(emp1);
						
						count++;
					}
				}
				System.out.println(count);
		
		ch.addValueChangeListener(ll ->{
			if(ch.getValue()==false) {
				grid.setContainerDataSource(container);
			}else {
			
			BeanItemContainer<EmployeeEntity> container1 = new BeanItemContainer<EmployeeEntity>(EmployeeEntity.class,
					cash);
             grid.setContainerDataSource(container1);
			}
			
		});
		
		ch1.addValueChangeListener(ll ->{
			if(ch1.getValue()==true) {
				BeanItemContainer<EmployeeEntity> container12 = new BeanItemContainer<EmployeeEntity>(EmployeeEntity.class,
						cash1);
	             grid.setContainerDataSource(container12);
			}else {
				 grid.setContainerDataSource(container);
			}
			
		});
		co.addValueChangeListener(ll ->{
		
			for(int i=0;i<navigation.size();i++) {
				
				EmployeeEntity dd = navigation.get(i);
				if(co.getValue().equals(dd.getDesignetion())){
					cash2.add(dd);
					BeanItemContainer<EmployeeEntity> container12 = new BeanItemContainer<EmployeeEntity>(EmployeeEntity.class,
							cash2);
		             grid.setContainerDataSource(container12);
				}
				}
			cash2.clear();
		});
		searchBYName.addTextChangeListener(ll ->{
               for(int i=0;i<navigation.size();i++) {
				
				EmployeeEntity dd = navigation.get(i);
				if(ll.getText().equals(dd.getGender())){
					cash2.add(dd);
					BeanItemContainer<EmployeeEntity> container12 = new BeanItemContainer<EmployeeEntity>(EmployeeEntity.class,
							cash2);
		             grid.setContainerDataSource(container12);
				}
				
				}
			
		});
		
		hl.addComponent(searchBYName);
		hl.setSpacing(true);
		hl.addComponent(clear);
		hl.addComponent(Update);
		hl.addComponent(ch);
		hl.addComponent(ch1);
		hl.addComponent(co);
		layout.addComponent(grid);

		return navigation;
	}



	public Griddemo() throws JsonParseException, JsonMappingException, IOException
	{
		
		co.setDescription("select any one");
		Client client = Client.create();
		String getrecord = "http://localhost:8888/allhdfcbank";
		WebResource res2 = client.resource(getrecord);
		ClientResponse dd2 = res2.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);

		String output = dd2.getEntity(String.class);
		// System.out.println(output);
		fromJson(output);
		
		// for update the grid row
		addComponent(hl);
		addComponent(layout);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		Notification.show("Showing page 3");
	}

	public void getSelectedrowfromGrid(Object o) {
		System.out.println("from method " + o);

	}

}
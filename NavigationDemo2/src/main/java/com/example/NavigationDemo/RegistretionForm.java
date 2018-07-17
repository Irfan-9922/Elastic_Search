/**
 * All rights are reserved for diss.
 */
package com.example.NavigationDemo;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup.CommitException;
import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Notification.Type;

/**
 * @author i.shaikh
 *
 * @Date  Feb 26, 2018
 * @Time  3:27:08 PM
 */
public class RegistretionForm extends VerticalLayout implements View {
	
		
		
		
		TextField Id = new TextField("ID");
		 TextField FIRST_NAME = new TextField("FIRST NAME");
		  TextField LAST_NAME = new TextField("LAST NAME");
		   TextField DESIGNETION = new TextField("DESIGNETION");
		    DateField JOINING_DATE = new DateField("JOIN DATE");
		    TextField ADRESS = new TextField("ADRESS");
		     TextField ZIPCODE = new TextField("ZIP CODE");
		      TextField SAL = new TextField("SAL");
		        ComboBox cb = new ComboBox("Gender");
		         ComboBox cb1 = new ComboBox("M Status");
		          Button save = new Button("save");
		           Button discard = new Button("discard");
	
		             BeanFieldGroup<EmployeeEntity> fieldgroup = new BeanFieldGroup<>(EmployeeEntity.class);

		             HorizontalLayout hlayout = null;
		              VerticalLayout main = null;

		
		RegistretionForm() throws JsonProcessingException
		{
			
			fieldgroup.setItemDataSource(new EmployeeEntity());
			  fieldgroup.bind(Id, "id");
			  fieldgroup.bind(FIRST_NAME, "fName");
			   fieldgroup.bind(LAST_NAME, "lastName");
			 
			  fieldgroup.bind(DESIGNETION, "designetion");
			  fieldgroup.bind(JOINING_DATE, "joinDate");
			  fieldgroup.bind(ADRESS, "adress");
			  fieldgroup.bind(ZIPCODE, "zipCode");
			 
			    fieldgroup.bind(cb, "Gender");
			   
			      
			    
			        fieldgroup.bind(cb1, "mStatus");
			         fieldgroup.bind(SAL, "sal");
			        
			           cb.addItems("Male");
			            cb.addItems("FeMale");
			             cb.addItems("Other");
			              cb1.addItems("Single");
			               cb1.addItems("Married");
			               ADRESS.setNullSettingAllowed(false);
			                
		 	save.addClickListener(e -> {
				try {
					fieldgroup.commit();
				    } catch (CommitException e1) {
					     e1.printStackTrace();
				}
				
				EmployeeEntity bean = fieldgroup.getItemDataSource().getBean();
				 Notification.show(bean.getAdress() + " - " + bean.getId(), Type.WARNING_MESSAGE);
				  ObjectMapper mapper = new ObjectMapper();
				  
				try {
					String jsonInString = mapper.writeValueAsString(bean);
					 Client client = Client.create();
					  String Employee = "http://localhost:8888//create/employee";
					   WebResource res2 = client.resource(Employee);
					    //here i need to do RND
					       ClientResponse response = res2.type("application/json").post(ClientResponse.class,jsonInString);
					         // still i am getting 415  in below line of code
				              //	ClientResponse response = res2.accept(MediaType.APPLICATION_JSON).post(ClientResponse.class,g);
				                 	System.out.println(response.getStatus());
				                  	if (response.getStatus() != 201) {
					              	throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
				                	}  else {
						                       System.out.println("ok");
					                          }
				                  	
				  } catch (Exception e1) {
					// TODO: handle exception
				}

			});
			
			discard.addClickListener(li ->{
				fieldgroup.discard();
				Notification.show("remove all");
			});

			HorizontalLayout l = new HorizontalLayout();
			hlayout = new HorizontalLayout(save, discard);
			main = new VerticalLayout(hlayout, l);
			l.setSizeFull();
			
			main.setSpacing(true);
			addComponents(ADRESS, ZIPCODE, JOINING_DATE, DESIGNETION, FIRST_NAME, Id, LAST_NAME, SAL, cb, cb1, main);
		}
		@Override
		public void enter(ViewChangeEvent event) {
			// TODO Auto-generated method stub
		}
	}

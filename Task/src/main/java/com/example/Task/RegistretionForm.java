/**
 * All rights are reserved for diss.
 */
package com.example.Task;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.vaadin.data.Container.Indexed;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup.CommitException;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.validator.RegexpValidator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Notification.Type;

/**
 * @author i.shaikh
 *
 * @Date Feb 20, 2018
 * @Time 5:02:18 PM
 */
public class RegistretionForm extends FormLayout {

	public static int count = 0;
	TextField adress = new TextField("ADRESS");
	TextField ZipCode = new TextField("ZIP CODE");
	DateField joinigaDate = new DateField("JOIN DATE");
	TextField Designetion = new TextField("DESIGNETION");
	TextField firstName = new TextField("FIRST NAME");
	TextField Id = new TextField("ID");
	TextField LastName = new TextField("LAST NAME");
	TextField sal = new TextField("SAL");
	ComboBox cb = new ComboBox("Gender");
	ComboBox cb1 = new ComboBox("M Status");
	Button save = new Button("save");
	Button discard = new Button("discard");
	Button Grid1 = new Button("Show_Grid");
	BeanFieldGroup<EmployeeEntity> fieldgroup = new BeanFieldGroup<>(EmployeeEntity.class);

	HorizontalLayout hlayout = null;
	VerticalLayout main = null;

	RegistretionForm() throws JsonProcessingException
	{

		fieldgroup.setItemDataSource(new EmployeeEntity());
		fieldgroup.bind(adress, "adress");
		fieldgroup.bind(Designetion, "designetion");
		fieldgroup.bind(firstName, "fName");
		fieldgroup.bind(cb, "Gender");
		fieldgroup.bind(Id, "id");
		fieldgroup.bind(joinigaDate, "joinDate");
		fieldgroup.bind(LastName, "lastName");
		fieldgroup.bind(cb1, "mStatus");
		fieldgroup.bind(sal, "sal");
		fieldgroup.bind(ZipCode, "zipCode");
		cb.addItems("Male");
		cb.addItems("FeMale");
		cb.addItems("Other");

		cb1.addItems("Single");
		cb1.addItems("Married");

		save.addClickListener(e -> {
			try {
				fieldgroup.commit();

			} catch (CommitException e1) {
				// TODO Auto-generated catch block
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
				} else {
					System.out.println("ok");
				}
			} catch (Exception e1) {
				// TODO: handle exception
			}
			fieldgroup.discard();

		});

		Grid1.addClickListener(li -> {

			FormLayout f = new FormLayout();
			Gridone r = null;
			try {
				r = new Gridone();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			f.addComponent(r);

			addComponent(f);
		});

		HorizontalLayout l = new HorizontalLayout();

		hlayout = new HorizontalLayout(save, discard, Grid1);
		main = new VerticalLayout(hlayout, l);
		l.setSizeFull();
		main.setSpacing(true);
		addComponents(adress, ZipCode, joinigaDate, Designetion, firstName, Id, LastName, sal, cb, cb1, main);
	}

}

/**
 * All rights are reserved for diss.
 */
package com.example.EmployeeRecord;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup.CommitException;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;

/**
 * @author i.shaikh
 *
 * @Date  Feb 14, 2018
 * @Time  12:10:44 PM
 */
public class Registretion extends CustomComponent implements View {

	
	 TextField adress=new TextField("ADRESS");
	 TextField ZipCode=new TextField("ZIP CODE");  
	 DateField joinigaDate=new DateField("JOIN DATE");
	  TextField Designetion=new TextField("DESIGNETION");
	  TextField firstName=new TextField("FIRST NAME");
	  TextField Id=new TextField("ID");
	  TextField LastName=new TextField("LAST NAME");
	  TextField sal=new TextField("SAL");
	  ComboBox cb=new ComboBox("Gender");
	  ComboBox cb1=new ComboBox("M Status");
	  Button b=new Button("save");
	  Button b2=new Button("discard");
      Button b3= new Button("grid");
	  
	Registretion(){
		 Panel panel = new Panel("Registration Form");
	        panel.setSizeUndefined();
	       FormLayout content = new FormLayout();
	      
	        //adding all textfield to list
	       
	       BeanFieldGroup<Employee> fieldGroup = new BeanFieldGroup<>(Employee.class);
	       fieldGroup.setItemDataSource(new Employee());
	       
	       
	        adress.setDescription("enter adress");
	        fieldGroup.bind(adress, "adress");
	        
	       
	        ZipCode.setDescription("zio code");
	        fieldGroup.bind(ZipCode,"zipCode");
	        
	       
	        joinigaDate.setDescription("joining date");
	        fieldGroup.bind(joinigaDate,"joinDate");
	      
	      
	        Designetion.setDescription("Designetion");
	        fieldGroup.bind(Designetion, "designetion");
	      
	       
	        firstName.setDescription("first name");
	        fieldGroup.bind(firstName, "fName");
	       
	       
	        Id.setDescription("Id");
	        fieldGroup.bind(Id, "id");
	        
	      
	        LastName.setDescription("Last Name");
	        fieldGroup.bind(LastName, "lastName");
	       
	        sal.setDescription("sal");
	        fieldGroup.bind(sal, "sal");
	      
	      
	       cb.addItems("Male");
	       cb.addItems("FeMale");
	       cb.addItems("Other");
	       fieldGroup.bind(cb, "Gender");
	       
	      
	       cb1.addItems("Single");
	       cb1.addItems("Married");
	       fieldGroup.bind(cb1, "mStatus");
	      
	       
	      
	        b.addClickListener(e -> {
	        	try {
					
					Employee bean = fieldGroup.getItemDataSource().getBean();
		        	Notification.show(bean.getAdress()+" - "+bean.getmStatus(), Type.WARNING_MESSAGE);
		        	Griddemo g=new Griddemo();
		        
		        	fieldGroup.commit();
		        	Empdb.addemp(bean);
		        	
				} catch (CommitException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	
	       
	        	//System.out.println(getall);
	        });
	        
	      
	        b3.addClickListener( d ->{
	        	Panel p2=new Panel();
	        	Button b4=new Button("add more");
	        	FormLayout l=new FormLayout();
	        	Gridone g=new Gridone();
	        	b4.addClickListener(v ->{
	        		
	        		 FormLayout f=new FormLayout();
	            	 Registretion r=new Registretion();
	            	 


	                 f.addComponent(r);
	                 setCompositionRoot(panel);
	        	});
	        	
	        	
	        	l.addComponent(g);
	        	l.addComponent(b4);
	        	p2.setContent(l);
	        	 setCompositionRoot(p2);

	        	
	        	 
	        	
	        	
	        	
	        });
	        
	        
	        content.addComponent(firstName);
	        content.addComponent(LastName);
	        content.addComponent(Id);
	        content.addComponent(Designetion);
	        content.addComponent(joinigaDate);
	        content.addComponent(adress);
	        content.addComponent(ZipCode);
	        content.addComponent(cb);
	        content.addComponent(cb1);
	        content.addComponents(b,b2,b3);
	      
	        content.setSizeUndefined(); // Shrink to fit
	        content.setMargin(true);
	        panel.setContent(content);
	        setCompositionRoot(panel);


	       
	       

	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}

}

/**
 * All rights are reserved for diss.
 */
package com.example.sampletask;

import java.util.ArrayList;
import java.util.HashMap;

import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup.CommitException;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.TextField;

/**
 * @author i.shaikh
 *
 * @Date  Feb 15, 2018
 * @Time  10:10:48 AM
 */
public class RegistretionForm extends FormLayout {
	
	
	static HashMap<String,EmployeeDemo> getmap=new HashMap();
	
	
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
     
      BeanFieldGroup<EmployeeDemo> fieldgroup=new BeanFieldGroup<>(EmployeeDemo.class);
	
	
	public MyUI ui;
	
	public RegistretionForm(MyUI ui) {
		final HorizontalLayout hlayout;
		Employeeservice service=new Employeeservice();
	
		this.ui = ui;
		//if we miss below line it will show nullpointer exception\
	   
		fieldgroup.setItemDataSource(new EmployeeDemo());
		fieldgroup.bind(adress, "adress");
		fieldgroup.bind(Designetion,"designetion");
		fieldgroup.bind(firstName,"fName");
		fieldgroup.bind(cb,"Gender");
		fieldgroup.bind(Id,"id");
		fieldgroup.bind(joinigaDate,"joinDate");
		fieldgroup.bind(LastName,"lastName");
		fieldgroup.bind(cb,"mStatus");
		fieldgroup.bind(sal,"sal");
		fieldgroup.bind(ZipCode,"zipCode");
		cb.addItems("Male");
	       cb.addItems("FeMale");
	       cb.addItems("Other");
	       
	       cb1.addItems("Single");
	       cb1.addItems("Married");
		
		  b.addClickListener(e -> {
			  try {
				fieldgroup.commit();
			} catch (CommitException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        	EmployeeDemo bean = fieldgroup.getItemDataSource().getBean();
				Notification.show(bean.getAdress()+" - "+bean.getId(), Type.WARNING_MESSAGE);
	        	
	     /*  ArrayList al=new ArrayList<>();
	       al.add(bean);
	       getmap.put(bean.getId(), bean);*/
	       
	       service.eadd(bean);
	       
	   
	       System.out.println("after adding the record service"+service.getAllrecord());
	       
	      /* System.out.println("from new array "+al);
				service.addall(bean);
				System.out.println(service.findall());*/
				
	        	//System.out.println(getall);
	        });
	        
		b3.addClickListener(g ->{
			/*FormLayout f=new FormLayout();
			   BeanItemContainer<EmployeeDemo> container =
			    	    new BeanItemContainer<EmployeeDemo>(EmployeeDemo.class, getmap.values());
			Grid g1=new Grid(container);
			   f.addComponent(g1);
			   */
			
		
		      
		     
		});
		
		
		 hlayout=new HorizontalLayout(b,b2,b3);
		addComponents(adress,ZipCode,joinigaDate,Designetion,firstName,Id,LastName,sal,cb,cb1,hlayout);
	}

}

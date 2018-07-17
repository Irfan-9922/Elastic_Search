/**
 * All rights are reserved for diss.
 */
package com.example.LogInApp;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * @author i.shaikh
 *
 * @Date  Feb 14, 2018
 * @Time  12:10:44 PM
 */
public class Registretion extends CustomComponent implements View {

	
	Registretion(){
		 Panel panel = new Panel("Registration Form");
	        panel.setSizeUndefined();
	       FormLayout content = new FormLayout();
	      
	        //adding all textfield to list
	       
	        TextField employeeAdress=new TextField("ADRESS");
	        employeeAdress.setDescription("enter adress");
	        
	        TextField ZipCode=new TextField("ZIP CODE");
	        ZipCode.setDescription("enter employee_Adress_Zip_Code");
	       
	        DateField joinigaDate=new DateField("JOIN DATE");
	        joinigaDate.setDescription("enter employee_Date_Of_Join");
	      
	        TextField Designetion=new TextField("DESIGNETION");
	        Designetion.setDescription("enter employee_Designetion");
	      
	        TextField FirstName=new TextField("FIRST NAME");
	        FirstName.setDescription("enter employee_First_Name");
	       
	        TextField Id=new TextField("ID");
	        Id.setDescription("enter employee_Id");
	        
	        TextField LastName=new TextField("LAST NAME");
	        LastName.setDescription("enter employee_Last_Name");
	        TextField sal=new TextField("SAL");
	        sal.setDescription("enter employee_sal");
	      
	        ComboBox cb=new ComboBox("Gender");
	       cb.addItems("Male");
	       cb.addItems("FeMale");
	       cb.addItems("Other");
	       
	       ComboBox cb1=new ComboBox("M Status");
	       cb1.addItems("Single");
	       cb1.addItems("Married");
	      
	       
	        Button b=new Button("save");
	        
	        Button b2=new Button("discard");
	        
	        
	        content.addComponent(FirstName);
	        content.addComponent(LastName);
	        content.addComponent(Id);
	        content.addComponent(Designetion);
	        content.addComponent(joinigaDate);
	        content.addComponent(employeeAdress);
	        content.addComponent(ZipCode);
	        content.addComponent(cb);
	        content.addComponent(cb1);
	        content.addComponents(b,b2);
	      
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

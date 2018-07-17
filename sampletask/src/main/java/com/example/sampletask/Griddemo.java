/**
 * All rights are reserved for diss.
 */
package com.example.sampletask;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Grid;

/**
 * @author i.shaikh
 *
 * @Date  Feb 15, 2018
 * @Time  11:52:13 AM
 */
public class Griddemo extends FormLayout {
	RegistretionForm ui;
	Griddemo(RegistretionForm registretionForm){
		this.ui=registretionForm;
		Employeeservice service=Employeeservice.getInstance();
	 FormLayout content = new FormLayout();
     BeanItemContainer<EmployeeDemo> container =
	    	    new BeanItemContainer<EmployeeDemo>(EmployeeDemo.class, service.findall());
		
     Grid g2=new Grid(container);
     content.addComponent(g2);
    addComponent(content);
    
    
    
    
    
    
    
	}
}

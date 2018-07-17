/**
 * All rights are reserved for diss.
 */
package com.example.CrudGrid;

import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup.CommitException;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Notification.Type;

import employee.Employee;
import employee.service.EmployeeService;

/**
 * @author i.shaikh
 *
 * @Date  Mar 12, 2018
 * @Time  11:12:07 AM
 */
public class Registertionform extends VerticalLayout implements View {

	
	

	/* (non-Javadoc)
	 * @see com.vaadin.navigator.View#enter(com.vaadin.navigator.ViewChangeListener.ViewChangeEvent)
	 */
	
	Registertionform() throws CommitException{
		
		Button b=new Button("save");
		FormLayout l=new FormLayout();
		TextField t1=new TextField("id");
		
		TextField t2=new TextField("name");
		TextField t3=new TextField("sal");
		BeanFieldGroup<Employee> fieldgroup = new BeanFieldGroup<Employee>(Employee.class);
		 fieldgroup.bind(t1, "id");
		 fieldgroup.bind(t2, "name");
		 fieldgroup.bind(t3, "sal");
		 fieldgroup.setItemDataSource(new Employee());
		b.addClickListener(ll ->{
					try {
						fieldgroup.commit();
					} catch (CommitException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					Employee bean = fieldgroup.getItemDataSource().getBean();
					 Notification.show(bean.getName() + " - " + bean.getId(), Type.WARNING_MESSAGE);
					 EmployeeService ser=new EmployeeService();
			ser.addemp(bean);
			
			fieldgroup.clear();
		
		});
		
		l.addComponent(t1);
		l.addComponent(t2);
		l.addComponent(t3);
		l.addComponent(b);
		addComponent(l);
		
	}
	
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}

}

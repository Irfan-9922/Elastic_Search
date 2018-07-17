/**
 * All rights are reserved for diss.
 */
package com.example.CrudGrid;

import java.util.ArrayList;
import java.util.Collection;

import com.vaadin.data.fieldgroup.FieldGroup.CommitException;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

import employee.Employee;
import employee.service.EmployeeService;

/**
 * @author i.shaikh
 *
 * @Date  Mar 12, 2018
 * @Time  10:48:27 AM
 */
public class Griddemo extends VerticalLayout implements View {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	HorizontalLayout layout = new HorizontalLayout();
	HorizontalLayout layout1 = new HorizontalLayout();
	
		

	 Griddemo() throws CommitException 
	{
		
		 EmployeeService ser=new EmployeeService();
		 ArrayList al=new ArrayList<>();
			al=(ArrayList) ser.getallemp();
			System.out.println(al);
			BeanItemContainer<Employee> container = new BeanItemContainer<Employee>(Employee.class,
				(Collection<? extends Employee>) al.iterator().next());
			Grid grid = new Grid(container);
			// g.setSelectionMode(SelectionMode.MULTI);
			grid.setEditorEnabled(true);
			// grid.setSizeFull();
			grid.setResponsive(true);
			// System.out.println(h);
			grid.setFooterVisible(true);
			
			grid.setHeaderVisible(true);
			
			grid.setEditorBuffered(true);
			grid.refreshAllRows();
			Button remove = new Button("Remove");
			remove.setIcon	(new ThemeResource("../runo/icons/16/ok.png"));
			Button update=new Button("update");
			
			remove.addClickListener(ll ->{
				Employee ff = (Employee) grid.getSelectedRow();
				ser.deleteid(ff.getId());
				container.removeItem(ff);
			});
			
			update.addClickListener(ll ->{
				Employee ff = (Employee) grid.getSelectedRow();
				
				ser.update(ff);
				Notification.show(ser.update(ff)+"done");
				
				
			});
			layout1.addComponent(remove);
			layout1.addComponent(update);
			layout.addComponent(grid);
			addComponent(layout1);
		addComponent(layout);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}

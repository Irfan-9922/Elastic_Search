/**
 * All rights are reserved for diss.
 */
package com.example.grid;

import java.util.Collection;
import java.util.List;

import com.example.bean.Employee;
import com.example.db.Empdb;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.Grid.SelectionModel;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TabSheet.Tab;

/**
 * @author i.shaikh
 *
 * @Date  Feb 14, 2018
 * @Time  4:22:05 PM
 */
public class Gridone extends CustomComponent implements View{
	 Empdb b=new Empdb();
	public Gridone(){
		 Panel panel = new Panel("grid Form");
		 List<Employee> gg = b.allperson();
		  panel.setSizeUndefined();
	       FormLayout content = new FormLayout();
	       BeanItemContainer<Employee> container =
		    	    new BeanItemContainer<Employee>(Employee.class, (Collection<? extends Employee>) gg.iterator().next());
	       Grid g=new Grid(container);
	       g.setEditorEnabled(true);
	       g.select(g.getData());
	       Button bb=new Button("get Selected item from grid");
	     //  g.setSelectionMode(SelectionMode.MULTI);
	       bb.addClickListener(fff ->{
	    	  Object ff = g.getSelectedRow();
	  	     b.addemp((Employee) ff);
	  	     System.out.println(ff);
	       });
	       content.addComponent(g);
	       content.addComponent(bb);
	      panel. setContent(content);
	      setCompositionRoot(panel);
	}
	@Override
	public void enter(ViewChangeEvent event) {
		
		
	}

}

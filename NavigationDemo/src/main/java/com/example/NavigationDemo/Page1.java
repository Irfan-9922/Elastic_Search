/**
 * All rights are reserved for diss.
 */
package com.example.NavigationDemo;

import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * @author i.shaikh
 *
 * @Date  Feb 26, 2018
 * @Time  3:27:08 PM
 */
public class Page1 extends VerticalLayout implements View {

	  public Page1() {
	    addComponent(new Label("Page 1"));
	 
	  }
	    
	    
	  

	  @Override
	  public void enter(ViewChangeEvent event) {
	    Notification.show("Showing page 1");
	  }

	}
/**
 * All rights are reserved for diss.
 */
package com.example.nav;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

/**
 * @author i.shaikh
 *
 * @Date  Feb 26, 2018
 * @Time  3:41:52 PM
 */
public class Page2 extends VerticalLayout implements View {

	  public Page2() {
	    addComponent(new Label("Page 2"));
	  }

	  @Override
	  public void enter(ViewChangeEvent event) {
	    Notification.show("Showing page 2");
	  }

	}
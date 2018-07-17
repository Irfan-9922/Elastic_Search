/**
 * All rights are reserved for diss.
 */
package com.example.nav;

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
	    addComponent(mainButton());
	    
	  }
	    
	    private Button mainButton(){
			  Button button = new Button("page 1", new Button.ClickListener() {
			   public void buttonClick(ClickEvent event) {
			    getUI().getNavigator().navigateTo(MyUI.HELPVIEW);
			    
			   }

			@Override
			public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
				// TODO Auto-generated method stub
				
			}
			  });
			  return button;
	  }

	  @Override
	  public void enter(ViewChangeEvent event) {
	    Notification.show("Showing page 1");
	  }

	}
/**
 * All rights are reserved for diss.
 */
package com.example.nav;


import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

/**
 * @author i.shaikh
 *
 * @Date  Feb 26, 2018
 * @Time  3:29:22 PM
 */
public class Welcome extends VerticalLayout implements View {
	 Navigator navigator;
	 
	 
	  public Welcome() {
		  
		  addComponent(mainButton());
	    addComponent(new Label("Welcome your are in welcome page"));
	        	}
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
			}
			private Button mainButton(){
				  Button button = new Button("about", new Button.ClickListener() {
				   @Override
				   public void buttonClick(ClickEvent event) {
				    getUI().getNavigator().navigateTo(MyUI.ABOUT);
				    
				   }
				  });
				  return button;
	  }

	  @Override
	  public void enter(ViewChangeEvent event) {
	    Notification.show("Showing Welcome page");
	    
	  }

	}

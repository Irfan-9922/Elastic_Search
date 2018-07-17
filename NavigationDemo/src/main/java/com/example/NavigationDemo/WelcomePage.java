/**
 * All rights are reserved for diss.
 */
package com.example.NavigationDemo;

import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

/**
 * @author i.shaikh
 *
 * @Date  Feb 26, 2018
 * @Time  5:00:28 PM
 */
public class WelcomePage  extends VerticalLayout implements View{

	public WelcomePage()
	{
		 Panel panel = new Panel("Registration Form");
	        panel.setSizeUndefined();
		   
		    HorizontalLayout l=new HorizontalLayout();
		    l.addComponent(button());
		    l.addComponent(button2());
		    l.addComponent(button3());
		    l.setSpacing(true);
		    panel.setContent(l);
		    
	       
		    addComponent(panel);
		    
	
}
	
	/**
	 * @return
	 */
	private Component button3() {
	
		 Button button = new Button("About", new Button.ClickListener() {
				@Override
				public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
					// TODO Auto-generated method stub
					 getUI().getNavigator().navigateTo(MyUI.ABOUT);
				}
				  });
			 return button;
	}

	/**
	 * @return
	 */
	private Component button2() {
		 Button button = new Button("Registretion form", new Button.ClickListener() {
				@Override
				public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
					// TODO Auto-generated method stub
					 getUI().getNavigator().navigateTo(MyUI.CONTACTUS);
				}
				  });
			 return button;
	}

	private Component button() {
			 Button button = new Button("Grid", new Button.ClickListener() {
				@Override
				public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
					// TODO Auto-generated method stub
					 getUI().getNavigator().navigateTo(MyUI.HELP);
				}
				  });
			 return button;
		}
		
	@Override
	public void enter(ViewChangeEvent event) {
		  
	}

}

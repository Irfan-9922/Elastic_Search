/**
 * All rights are reserved for diss.
 */
package com.example.NavigationDemo;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * @author i.shaikh
 *
 * @Date  Feb 26, 2018
 * @Time  6:21:25 PM
 */
public class Login extends VerticalLayout implements View {
	
	Login(){
		
		 HorizontalLayout l=new HorizontalLayout();
		  
		String User=new String("irfan");
		String Pass=new String("9922");
		VerticalLayout vr=new VerticalLayout();
		
		 FormLayout content = new FormLayout();
		 
        TextField username = new TextField("Username");
        username.setWidth("20%");
        username.setNullRepresentation("");


        content.addComponent(username);

        PasswordField password = new PasswordField("Password");
        password.setWidth("20%");
        password.setNullRepresentation("");
        content.addComponent(password);
        
        Button button=new Button("LOGIN");
        button.addClickListener(g ->{
       	
       	 String s=username.getValue();
       	 String p=password.getValue();
       /*	 if(s.equals(User) && p.equals(Pass) ) {
       	
       		 
       	  l.addComponent(button());
       		 Notification.show("clicked");
 		
       		 
       	 }
       	 else {
       		 System.out.println("come");
       		 FormLayout ff=new FormLayout(new Label("wrong"));
       		addComponent(ff);
       		 
       	 }*/

       		
       	 
        });

       
      
        HorizontalLayout hr=new HorizontalLayout(vr,button);
       
        content.addComponent(hr);
      
        addComponent(content);

	}
	/**
	 * @return
	 */
	  /* private Component button() {
 				 Button button = new Button("Help", new Button.ClickListener() {
 					@Override
 					public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
 						// TODO Auto-generated method stub
 						 getUI().getNavigator().navigateTo(MyUI.HELP);
 					}
 					  });
 				 return button;
 			}*/
	@Override
	public void enter(ViewChangeEvent event) {
		
		
	}

}

/**
 * All rights are reserved for diss.
 */
package com.example.ui;

import javax.servlet.annotation.WebServlet;

import com.example.grid.Gridone;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

/**
 * @author i.shaikh
 *
 * @Date  Feb 14, 2018
 * @Time  10:11:58 AM
 */
@Theme("mytheme")
public class Login extends UI{

	
	String User=new String("irfan");
	String Pass=new String("9922");
	protected void init(VaadinRequest request) {
		
		/* FormLayout content = new FormLayout();
		 
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
        	 if(s.equals(User) && p.equals(Pass) ) {*/
        		 //showing the Registretion form
        	 FormLayout f=new FormLayout();
        	 Gridone r=new Gridone();
        	 


             f.addComponent(r);
             setContent(f);
        	/* }
        	 else {
        		 System.out.println("come");
        		 FormLayout ff=new FormLayout(new Label("wrong"));
        		 setContent(ff);
        		 
        	 }

        		
        	 
         });
 */
        
        // content.addComponent(button);
       
         //setContent(content);
 
        
	}
	
	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = Login.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
	}
	
	
	

}

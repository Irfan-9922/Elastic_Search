package com.example.Task;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

	
	String User=new String("irfan");
	String Pass=new String("9922");
	protected void init(VaadinRequest request) {
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
        	// if(s.equals(User) && p.equals(Pass) ) {
        		
        		 FormLayout f=new FormLayout();
        		 WelcomePage r=new WelcomePage();
            	 
            

                 f.addComponent(r);
                 setContent(f);
        		 
        	// }
        	/* else {
        		 System.out.println("come");
        		 FormLayout ff=new FormLayout(new Label("wrong"));
        		 setContent(ff);*/
        		 
        	// }

        		
        	 
         });
 
        
       
         HorizontalLayout hr=new HorizontalLayout(vr,button);
        
         content.addComponent(hr);
       
         setContent(content);
 
        
	}
    
    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}

package com.example.NavigationDemo;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
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
	
	
	public static final String ABOUT = "about";
	public static final String CONTACTUS = "conatact";
	public static final String Grid = "grid";
    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	VerticalLayout l=new VerticalLayout();
    	Button b=new Button("hello");
    	Navigator navigator =new Navigator(this, this);
  	    navigator.addView("", new WelcomePage());
  	   navigator.addView(ABOUT, new Page1());
 	
		try {
			navigator.addView(CONTACTUS, new RegistretionForm());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
 	    
  	
		try {
			navigator.addView(Grid, new Griddemo());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
 
  	 l.addComponent(b);
  	 setContent(l);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}

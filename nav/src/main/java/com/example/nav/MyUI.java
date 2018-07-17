package com.example.nav;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
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
	public static final String HELPVIEW = "help";
	public static final String ABOUT = "about";


    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	
    	
    	
    	    	    Navigator navigator = new Navigator(this, this);
    	    	    
    	    	    navigator.addView("", new Welcome());
    	    	   navigator.addView(ABOUT, new Page2());
    	    	    navigator.addView(HELPVIEW, new Page1());
    	    	    
    	    	    
    	    	    
    	    	    
    	    	    final VerticalLayout layout = new VerticalLayout();
    	    	    layout.setMargin(true);
    	    	    setContent(layout);
    	    	  
    	    	  
    	    	   
    	    	    
    	    	    
    	    	    
    	    	  }
    	    	
    	
    	
       
    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }

}
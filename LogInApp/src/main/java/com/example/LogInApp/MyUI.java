package com.example.LogInApp;

import java.util.Date;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.Property;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser
 * window (or tab) or some part of a html page where a Vaadin application is
 * embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is
 * intended to be overridden to add component to the user interface and
 * initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		Registretion r=new Registretion();
		
		
		 final VerticalLayout layout = new VerticalLayout();
		/*
		
		 
		        
		 
		         TextField username = new TextField("Username");
		 
		         content.addComponent(username);
		 
		         PasswordField password = new PasswordField("Password");
		 
		         content.addComponent(password);
		 
		  
		 
		         Button send = new Button("Enter");
		
		
      

	

		
		Button b = new Button("Click Me again");
		b.addClickListener(e -> {
			layout.addComponent(new Label("Thanks " + username.getValue() + "\t" + password.getValue() + ", it works!"));
		});
		
*/
		layout.addComponents(r);
		/* content.setMargin(true);
		 content.setSpacing(true);*/

		setContent(layout);
	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
	}
}

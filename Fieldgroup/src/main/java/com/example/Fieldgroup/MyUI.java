package com.example.Fieldgroup;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup.CommitException;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
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

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	
    
        final VerticalLayout layout = new VerticalLayout();
        
        final TextField name = new TextField();
        final TextField Id = new TextField();
        
        emp e=new emp();
     
        BeanFieldGroup<emp> fieldGroupOne = new BeanFieldGroup<emp>(emp.class);
        fieldGroupOne.bind(name, "Name");
        fieldGroupOne.bind(Id, "id");
        fieldGroupOne.setItemDataSource(e);

        
        name.setCaption("Type your name here:");

        Button button = new Button("Click Me");
        button.addClickListener( ew -> {
        	try {
				fieldGroupOne.commit();
			} catch (CommitException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	emp bean=fieldGroupOne.getItemDataSource().getBean();
            Notification.show(""+bean.getName());
        });
        
        layout.addComponents(name,Id, button);
    
        layout.setMargin(true);
        layout.setSpacing(true);
        
        setContent(layout);
    }

  

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}

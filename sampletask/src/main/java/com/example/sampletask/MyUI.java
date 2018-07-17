package com.example.sampletask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
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
	
	
	
	
	   RegistretionForm form = new RegistretionForm(this);
	  
	
	  Button show=new Button("show in grid");
	  Backend ba=new Backend();
	  Employeeservice ser=new Employeeservice();
	  List<EmployeeDemo> de=new ArrayList();
	  
    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	
    	de=ser.getAllrecord();
    	 BeanItemContainer<EmployeeDemo> container =
 	    	    new BeanItemContainer<EmployeeDemo>(EmployeeDemo.class,(Collection<? extends EmployeeDemo>) de.iterator().next());
    	 Grid g=new Grid(container);
     	
 	   
    	System.out.println("from demo"+de);
    	
    	show.addClickListener(li ->{
   
    		
    	g.refreshRows(vaadinRequest);
    		
    		
    		
    	});
    	System.out.println();
    	VerticalLayout l=new VerticalLayout();
    	l.addComponent(show);
    	
    	
    	
    	 HorizontalLayout main = new HorizontalLayout(form,g);

         main.setSizeFull();

        


         l.addComponents( main);
    	
    	
        
      
        setContent(l);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}

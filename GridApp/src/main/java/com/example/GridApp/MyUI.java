package com.example.GridApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import com.example.employeebean.EmoployeeBean;
import com.example.employeeservcie.EmployeeService;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.Property;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.renderers.ButtonRenderer;

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
        
       
       
        
     
        EmployeeService ser=new EmployeeService();
        List<EmoployeeBean> l=new ArrayList<>();
       
       
        BeanItemContainer<EmoployeeBean> container =
	    	    new BeanItemContainer<EmoployeeBean>(EmoployeeBean.class,   l=ser.getallfromservice());
        System.out.println(ser.getallfromservice());
        
        
        Grid grid = new Grid(container);
        
   

        
        grid.setEditorEnabled(true);
        grid.setEditorBuffered(true);
        	
        	
        
     
        layout.addComponent(grid);
        layout.setMargin(true);
        layout.setSpacing(true);
        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false, widgetset = "com.example.GridApp.GridappWidgetset")
    public static class MyUIServlet extends VaadinServlet {
    }
}

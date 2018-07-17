package com.example.myapplication1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import com.example.myapplication1.service.emp;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
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
public class ButtonsAndGrid extends UI {
	
   
  
    
	  protected void init(VaadinRequest vaadinRequest) {
   /* VerticalLayout vlayout=new VerticalLayout();
    	Collection<Person> people1 = new ArrayList();
    	
    	Collection<Person> people = Arrays.asList(new Person("Nicolaus Copernicus", 9543),
    			new Person("Galileo Galilei", 6564),
    			 new Person("Johannes Kepler", 3571)
    			 , new Person("Alphonso themas", 8372),
    			 new Person("Zindal Bhatiya", 1033)
    			);
    	// Have a container of some type to contain the data
    	BeanItemContainer<Person> container =
    	    new BeanItemContainer<Person>(Person.class, people);
    	// Create a grid bound to the container
    	Grid grid = new Grid(container);
    	grid.setColumnOrder("name", "born");
    	grid.setEditorEnabled(true);
    	
    	vlayout.addComponent(grid);
        setContent(vlayout);*/
		  VerticalLayout lout=new VerticalLayout();
			
			TextField name=new TextField("name");
			
			Button b=new Button("Test");
			
			Collection<Person> people = Arrays.asList(new Person("Nicolaus Copernicus", 9543),
	    			new Person("Galileo Galilei", 6564),
	    			 new Person("Johannes Kepler", 3571)
	    			 , new Person("Alphonso themas", 8372),
	    			 new Person("Zindal Bhatiya", 1033)
	    			);
			BeanItemContainer<Person> container=new BeanItemContainer<Person>(Person.class,people);
			Grid g=new Grid(container);
			b.addClickListener(e ->{
			
				
				g.setColumnOrder("name", "born");
				
				
			});
			//add grid component to see the list
			lout.addComponent(name);
			lout.addComponent(b);
			lout.addComponent(g);
			
			setContent(lout);
			
    }

  /*  @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = ButtonsAndGrid.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }*/
}

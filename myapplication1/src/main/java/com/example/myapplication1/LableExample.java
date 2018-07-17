/**
 * All rights are reserved for diss.
 */
package com.example.myapplication1;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * @author i.shaikh
 *
 * @Date  Feb 12, 2018
 * @Time  4:32:54 PM
 */
public class LableExample extends UI{

	
	@Override
	protected void init(VaadinRequest request) {

		//1 create a layout
		VerticalLayout la=new VerticalLayout();
		
		TextField t=new TextField("enter the name");
		
		Button b=new Button("Click for test!!!!");
		
		
		
	}
	 @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	    @VaadinServletConfiguration(ui = ButtonsAndGrid.class, productionMode = false)
	    public static class MyUIServlet extends VaadinServlet {
	    }

}

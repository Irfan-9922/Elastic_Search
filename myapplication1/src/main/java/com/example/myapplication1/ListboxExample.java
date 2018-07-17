/**
 * All rights are reserved for diss.
 */
package com.example.myapplication1;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

/**
 * @author i.shaikh
 *
 * @Date  Feb 12, 2018
 * @Time  11:29:59 AM
 */
public class ListboxExample extends UI{


	@Override
	protected void init(VaadinRequest request) {
		
		HorizontalLayout hl=new HorizontalLayout();
		TextField readwrite = new TextField("Read-Write");
		readwrite.setValue("You can change this");
		readwrite.setReadOnly(false);
		// The default
		TextField readonly = new TextField("Read-Only");
		readonly.setValue("You can't touch this!");
		readonly.setReadOnly(true);

		Button b=new Button("Test!!!");
		Button b1=new Button("disable");
		b1.setEnabled(false);
		b1.setDescription("disabled button");
		
		
		b.setDescription("<h2><img src=\"../VAADIN/themes/sampler/"+ 
		"icons/comment_yellow.gif\"/>"+ 
		"A richtext tooltip</h2>"+ "<ul>"+ " "
				+ " <li>Use rich formatting with HTML</li>"+ " "
				+ " <li>Include images from themes</li>"+ " "
						+ " <li>etc.</li>"+ "</ul>");
		
		hl.addComponent(b);
		hl.addComponent(b1);
		hl.addComponent(readwrite);
		hl.addComponent(readonly);
	
		setContent(hl);
		
		
		
		
		
	}
	 /* @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	    @VaadinServletConfiguration(ui = ListboxExample.class, productionMode = false)
	    public static class MyUIServlet extends VaadinServlet {
	    }*/

}

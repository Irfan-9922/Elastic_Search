/**
 * All rights are reserved for diss.
 */
package com.example.LabelAndTextBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.ui.BorderStyle;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.TwinColSelect;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * @author i.shaikh
 *
 * @Date  Feb 12, 2018
 * @Time  4:54:44 PM
 */
@Theme("mytheme")
public class LabelandTextBoxDemo extends UI{

	
	@Override
	protected void init(VaadinRequest request) {
		// TODO Auto-generated method stub
		
		//create the layout
		VerticalLayout layout=new VerticalLayout();
		HorizontalLayout hlayout=new HorizontalLayout();
		TextField t=new TextField("enter name ");
		t.setMaxLength(5);
		//this line is for tool tip text
		t.setDescription("this is tool tip for textField");
		
		Button b=new Button("Click For enable  Test!!");
		b.setEnabled(true);
		Button b1=new Button("Click For disable Test!!");
		b1.setEnabled(false);
		Label l=new Label("this is a Label Demo");
		
		b.addClickListener(bf ->{

              if(t.getValue().length() >=5) {
            	  layout.addComponent(new Label("value is exeeded"));
            	 
            	  b1.setEnabled(false);
              }else {

                     b1.setEnabled(true);
                     b1.addClickListener(ff ->{ 
                    	 layout.addComponent(new Label("your task is done"));
                     });
              }
		      
			
			
		});
		//combo box example
		
		List<Planet> planet=new ArrayList();
		planet.add(new Planet("marse"));
		planet.add(new Planet("vinus"));
		planet.add(new Planet("earth"));
		
		//create a combobox
		 
		ComboBox cmm=new ComboBox("my List");
		TwinColSelect select = new TwinColSelect("Select Targets");
		
		for(Planet p:planet) {
			cmm.addItems(p.getName());
		
		}
		cmm.addFocusListener(foo ->{
			String s=(String) cmm.getValue();
			Notification.show(""+s);
			select.addItem(s);
			System.out.println(s);
		});
		
	  
		// Textual link 
		Link link = new Link("Click Me!", new ExternalResource("http://vaadin.com/"));
		link.setTargetName("_blank"); 
		link.setTargetBorder(BorderStyle.NONE); 
		link.setTargetHeight(300); 
		link.setTargetWidth(400);
	  
		
		
		
		//text Area
		TextArea tarea=new TextArea("text area");
		// Create a rich text area
		final RichTextArea rtarea = new RichTextArea(); 
		rtarea.setCaption("My Rich Text Area");
		// Set initial content as HTML 
		rtarea.setValue("<h1>Hello</h1>\n" + "<p>This rich text area contains some text.</p>");
 //Date field
		DateField date=new DateField("calender");
		date.setDateFormat("dd/mm/yy");
		Button v=new Button("Click");
		v.addClickListener(g ->{

                 Notification.show("date"+date.getValue());
		});
		
		//Cheack boxes
		CheckBox ch =new CheckBox("non check value");
		CheckBox ch1 =new CheckBox(" check value");
		ch1.setValue(true);
		
		
           
		for(Planet p:planet) {
			select.addItems(p.getName());
		}
		//grid layout
		
		List<Employee> emplist=Arrays.asList(
				new Employee("irfan", 1, "programmer"),
				new Employee("ramesh", 2, "Admin"),
				new Employee("sameer", 3, "Hr"),
				new Employee("pooja", 4, "Manager"),
				new Employee("shilpa", 5, "Project manager"),
				new Employee("mark", 6, "HOD")
				
				);
		
		//Grid g=new Grid("employee List");
		
		BeanItemContainer<Employee> container =
	    	    new BeanItemContainer<Employee>(Employee.class, emplist);
		
		Grid grid = new Grid(container); 
		grid.addSelectionListener(bj ->{
			for(Employee emp:emplist) {
				cmm.addItem(emp.getName());
			}
			
			
		});
		

		hlayout.addComponent(grid);
		hlayout.addComponent(v);
		hlayout.addComponent(ch);
		hlayout.addComponent(ch1);
		hlayout.addComponent(cmm);
		hlayout.addComponent(select);
		//hlayout.addComponent(rtarea);
		/*layout.setMargin(true);
		layout.addComponent(b);
		layout.setMargin(true);
		layout.addComponent(cmm);
		layout.setMargin(true);*/
		//layout.addComponent(link);
		
		/*layout.addComponent(b);
		layout.addComponent(b);
		layout.setMargin(true);
		layout.addComponent(l);
		layout.setMargin(true);
		layout.addComponent(t);*/
		//layout.addComponent(name);
	//	
		setContent(hlayout);
		//setContent(layout);
		
	}
	 @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = LabelandTextBoxDemo.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }

}

/**
 * All rights are reserved for diss.
 */
package com.example.Task;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;

/**
 * @author i.shaikh
 *
 * @Date  Feb 21, 2018
 * @Time  4:41:17 PM
 */
public class WelcomePage  extends FormLayout{
	Button registretion=new Button("Registretion Form");
	Button grid=new Button("show in grid");
	
	 
	WelcomePage(){
		final HorizontalLayout hlayout=new HorizontalLayout();
		
		
		registretion.setDisableOnClick(true);
		grid.setDisableOnClick(true);
		registretion.addClickListener(s ->{
			
			FormLayout f=new FormLayout();
       	 RegistretionForm r = null;
		try {
			r = new RegistretionForm();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       	 
            grid.setVisible(false);

            f.addComponent(r);
          addComponent(f);
			
		});
		
		grid.addClickListener(g ->{
			Button b=new Button("add more!!!");
			FormLayout f=new FormLayout();
			Gridone r = null;
			try {
				r = new Gridone();
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			registretion.setVisible(false);
			
			b.addClickListener(ff ->{
			//	r.setVisible(false);
				FormLayout fff=new FormLayout();
		       	 WelcomePage rr=new WelcomePage();
		       	 b.setVisible(false);
		            grid.setVisible(false);
		           
                  fff.setHeightUndefined();
                 
		            fff.addComponent(rr);
		          addComponent(fff);
				
			});
	       

	            f.addComponent(r);
	            f.addComponent(b);
	          addComponent(f);
		});
		 HorizontalLayout l=new HorizontalLayout(registretion,grid);
		 addComponent(l);
		
		
	}

}

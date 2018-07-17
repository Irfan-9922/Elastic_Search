/**
 * All rights are reserved for diss.
 */
package com.example.CrudGrid;

import java.awt.Label;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.VerticalLayout;

/**
 * @author i.shaikh
 *
 * @Date  Mar 12, 2018
 * @Time  3:12:46 PM
 */
public class AboutUs implements View {

	
	
/**
 * 
 */
public AboutUs()
{
VerticalLayout l=new VerticalLayout();

Label ll=new Label();
ll.setText("about us page");


}
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}

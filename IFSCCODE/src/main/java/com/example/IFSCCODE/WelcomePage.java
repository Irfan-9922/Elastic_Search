/**
 * All rights are reserved for diss.
 */
package com.example.IFSCCODE;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

/**
 * @author i.shaikh
 *
 * @Date  Feb 26, 2018
 * @Time  5:00:28 PM
 */
public class WelcomePage  extends VerticalLayout implements View{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WelcomePage()
	{
		    HorizontalLayout l=new HorizontalLayout();
		    l.addComponent(button());
		    l.setSpacing(true);
		    addComponent(l);
      }
	private Component button() {
			 Button button = new Button("Grid", new Button.ClickListener() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
					// TODO Auto-generated method stub
					 getUI().getNavigator().navigateTo(MyUI.Grid);
				}
				  });
			 return button;
		}
		
	@Override
	public void enter(ViewChangeEvent event) {
		  
	}

}

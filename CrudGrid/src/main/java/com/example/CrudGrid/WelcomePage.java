/**
 * All rights are reserved for diss.
 */
package com.example.CrudGrid;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

/**
 * @author i.shaikh
 *
 * @Date Feb 26, 2018
 * @Time 5:00:28 PM
 */
public class WelcomePage extends VerticalLayout implements View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WelcomePage()
	{
		Panel panel = new Panel("Registration Form");
		panel.setSizeUndefined();

		HorizontalLayout l = new HorizontalLayout();
		l.addComponent(button());
		l.addComponent(button2());

		l.setSpacing(true);
		panel.setContent(l);

		addComponent(panel);

	}

	private Component button2() {
		Button button = new Button("Registretion form", new Button.ClickListener() {
			/**
			* 
			*/
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
				// TODO Auto-generated method stub
				getUI().getNavigator().navigateTo(MyUI.Registretion);
			}
		});
		return button;
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

package com.example.IFSCCODE;

/**
 * All rights are reserved for diss.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * @author i.shaikh
 *
 * @Date Feb 26, 2018
 * @Time 3:27:08 PM
 */
public class Griddemo extends VerticalLayout implements View {

	private static final long serialVersionUID = 1L;

	VerticalLayout Vlayout = new VerticalLayout();
	HorizontalLayout hlayout = new HorizontalLayout();
	TextField searchBYName = new TextField();
	ObjectMapper objectMapper = new ObjectMapper();
	CheckBox hdfcCheackBox = new CheckBox("HDFC BANK");
	CheckBox mahBankCheackBox = new CheckBox("MAHARASTRA BANK");
	CheckBox americanBankCheckBox = new CheckBox("BANK OF AMERICA");
	CheckBox Ingwaysay = new CheckBox();
	ComboBox CommanCBB = new ComboBox("Comman");
	
	ComboBox HDFCCmbb = new ComboBox("hdfc bank");
	ComboBox Ingwaysaycmb = new ComboBox("ingwys");
	ComboBox mahBankCMbb = new ComboBox("mh bank");
	ComboBox americanBKOM = new ComboBox("american bank");
	String des = null;
	
	List<HdfcIfscCodeEntity> cash = new ArrayList<HdfcIfscCodeEntity>();
	List<HdfcIfscCodeEntity> mahrastraBank = new ArrayList<HdfcIfscCodeEntity>();
	List<HdfcIfscCodeEntity> hdfcBank = new ArrayList<HdfcIfscCodeEntity>();
	List<HdfcIfscCodeEntity> bankofamerica = new ArrayList<HdfcIfscCodeEntity>();
	List<HdfcIfscCodeEntity> ingwysaya = new ArrayList<HdfcIfscCodeEntity>();
	List<HdfcIfscCodeEntity> MHCondition = new ArrayList<HdfcIfscCodeEntity>();
	List<HdfcIfscCodeEntity> hdfcCondition = new ArrayList<HdfcIfscCodeEntity>();
	List<HdfcIfscCodeEntity> ingwyasacondition = new ArrayList<HdfcIfscCodeEntity>();
	List<HdfcIfscCodeEntity> cash2 = new ArrayList<HdfcIfscCodeEntity>();
	List<HdfcIfscCodeEntity> bankofamericacondition = new ArrayList<HdfcIfscCodeEntity>();
	@SuppressWarnings("unused")
	
	public Object fromJson(String json) throws JsonParseException, JsonMappingException, IOException {
		List<HdfcIfscCodeEntity> navigation = objectMapper.readValue(json,
				objectMapper.getTypeFactory().constructCollectionType(List.class, HdfcIfscCodeEntity.class));
		BeanItemContainer<HdfcIfscCodeEntity> container = new BeanItemContainer<HdfcIfscCodeEntity>(
				HdfcIfscCodeEntity.class, navigation);
		HdfcIfscCodeEntity en = new HdfcIfscCodeEntity();
		Grid grid = new Grid(container);
		grid.setSizeFull();
		Button clear = new Button("Clear");
		int count=0;
		int mhb=0;
		int hdfc=0;
		int american=0;
		int ing=0;
		for (int i = 0; i < navigation.size(); i++) {
			count++;
			// get all record
			HdfcIfscCodeEntity allrecord = navigation.get(i);
			String comman =allrecord.getCITY();
			CommanCBB.addItem(comman);
			if (allrecord.getBANK().equals("BANK OF MAHARASHTRA")) {
				mhb++;
				mahrastraBank.add(allrecord);
				String Bankmh=allrecord.getCITY();
				mahBankCMbb.addItem(Bankmh);
			}
			if (allrecord.getBANK().equals("HDFC BANK")) {
				hdfc++;
				hdfcBank.add(allrecord);
				String HdfcBank=allrecord.getCITY();
				HDFCCmbb.addItem(HdfcBank);
			}
			if (allrecord.getBANK().equals("BANK OF AMERICA")) {
				american++;
				bankofamerica.add(allrecord);
				String americanBank=allrecord.getCITY();
				americanBKOM.addItem(americanBank);
			}
			if (allrecord.getBANK().equals("ING VYSYA BANK")) {
				ing++;
				ingwysaya.add(allrecord);
				String americanBank=allrecord.getCITY();
				Ingwaysaycmb.addItem(americanBank);
			}
		}
		System.out.println(count+"all");
		System.out.println(mhb+"Maharastar abnk");
		System.out.println(hdfc+"hdfc bank");
		System.out.println(american+"american bank");
		CommanCBB.setNullSelectionAllowed(false);
		CommanCBB.addValueChangeListener(ll -> {
			CommanCBB.setInputPrompt("Select city....!");
			for (int i = 0; i < navigation.size(); i++) {
				HdfcIfscCodeEntity dd = navigation.get(i);
				if (CommanCBB.getValue().equals(dd.getCITY())) {
					cash.add(dd);
					BeanItemContainer<HdfcIfscCodeEntity> container12 = new BeanItemContainer<HdfcIfscCodeEntity>(
							HdfcIfscCodeEntity.class, cash);
					grid.setContainerDataSource(container12);
				}
			}
			cash.clear();

		});
		searchBYName.addTextChangeListener(ll -> {
			for (int i = 0; i < navigation.size(); i++) {
				HdfcIfscCodeEntity dd = navigation.get(i);
				if (ll.getText().equals(dd.getCITY())) {
					cash2.add(dd);
					BeanItemContainer<HdfcIfscCodeEntity> container12 = new BeanItemContainer<HdfcIfscCodeEntity>(
							HdfcIfscCodeEntity.class, cash2);
					grid.setContainerDataSource(container12);
				}

			}

		});
		mahBankCheackBox.addValueChangeListener(ll -> {
			if (mahBankCheackBox.getValue() == true) {
				CommanCBB.setVisible(false);
				mahBankCMbb.setVisible(true);
				BeanItemContainer<HdfcIfscCodeEntity> maharastara = new BeanItemContainer<HdfcIfscCodeEntity>(
						HdfcIfscCodeEntity.class, mahrastraBank);
				grid.setContainerDataSource(maharastara);
				mahBankCMbb.addValueChangeListener(ll1 -> {
					for (int i = 0; i < mahrastraBank.size(); i++) {

						HdfcIfscCodeEntity ff = (HdfcIfscCodeEntity) mahrastraBank.get(i);
						if (mahBankCMbb.getValue().equals(ff.getCITY())) {
							MHCondition.add(ff);
							BeanItemContainer<HdfcIfscCodeEntity> container12 = new BeanItemContainer<HdfcIfscCodeEntity>(
									HdfcIfscCodeEntity.class, MHCondition);
							grid.setContainerDataSource(container12);
						}
					}
					MHCondition.clear();
					
				});

			} else {
				mahBankCMbb.setVisible(false);
				CommanCBB.setVisible(true);
				System.out.println("else in ch1");
				grid.setContainerDataSource(container);
			}

		});
		americanBankCheckBox.addValueChangeListener(lld -> {
			 if (americanBankCheckBox.getValue() == true) {
					CommanCBB.setVisible(false);
					americanBKOM.setVisible(true);
				BeanItemContainer<HdfcIfscCodeEntity> axisB = new BeanItemContainer<HdfcIfscCodeEntity>(
						HdfcIfscCodeEntity.class, bankofamerica);
				grid.setContainerDataSource(axisB);
				americanBKOM.addValueChangeListener(ll1 -> {
					for (int i = 0; i < bankofamerica.size(); i++) {

						HdfcIfscCodeEntity ff = (HdfcIfscCodeEntity) bankofamerica.get(i);
						if (americanBKOM.getValue().equals(ff.getCITY())) {
							bankofamericacondition.add(ff);
							BeanItemContainer<HdfcIfscCodeEntity> container12 = new BeanItemContainer<HdfcIfscCodeEntity>(
									HdfcIfscCodeEntity.class, bankofamericacondition);
							grid.setContainerDataSource(container12);
						}
					}
					bankofamericacondition.clear();
				});

			} else {
				americanBKOM.setVisible(false);
				CommanCBB.setVisible(true);
				System.out.println("else in american");
				
				grid.setContainerDataSource(container);
			}

		});
		hdfcCheackBox.addValueChangeListener(ll -> {
			if (hdfcCheackBox.getValue() == true) {
				CommanCBB.setVisible(false);
				HDFCCmbb.setVisible(true);
				BeanItemContainer<HdfcIfscCodeEntity> Hdfc = new BeanItemContainer<HdfcIfscCodeEntity>(
						HdfcIfscCodeEntity.class, hdfcBank);
				grid.setContainerDataSource(Hdfc);
				HDFCCmbb.addValueChangeListener(ll1 -> {

					for (int i = 0; i < hdfcBank.size(); i++) {

						HdfcIfscCodeEntity ff = (HdfcIfscCodeEntity) hdfcBank.get(i);
						if (HDFCCmbb.getValue().equals(ff.getCITY())) {
							hdfcCondition.add(ff);
							BeanItemContainer<HdfcIfscCodeEntity> container12 = new BeanItemContainer<HdfcIfscCodeEntity>(
									HdfcIfscCodeEntity.class, hdfcCondition);
							grid.setContainerDataSource(container12);
						}
					}
					hdfcCondition.clear();
				});
			} else {
				System.out.println("else in ch");
				HDFCCmbb.setVisible(false);
				CommanCBB.setVisible(true);
				grid.setContainerDataSource(container);
			}

		});
		
	
		/*
		 * 
		 * INGWAYSYA
		 * 
		 */
		Ingwaysay.addValueChangeListener(ll -> {
			if (Ingwaysay.getValue() == true) {
				CommanCBB.setVisible(false);
				Ingwaysaycmb.setVisible(true);
				BeanItemContainer<HdfcIfscCodeEntity> ingwysa = new BeanItemContainer<HdfcIfscCodeEntity>(
						HdfcIfscCodeEntity.class, ingwysaya);
				grid.setContainerDataSource(ingwysa);
				Ingwaysaycmb.addValueChangeListener(ll1 -> {

					for (int i = 0; i < ingwysaya.size(); i++) {

						HdfcIfscCodeEntity ff = (HdfcIfscCodeEntity) ingwysaya.get(i);
						if (Ingwaysaycmb.getValue().equals(ff.getCITY())) {
							ingwyasacondition.add(ff);
							BeanItemContainer<HdfcIfscCodeEntity> container12 = new BeanItemContainer<HdfcIfscCodeEntity>(
									HdfcIfscCodeEntity.class, ingwyasacondition);
							grid.setContainerDataSource(container12);
						}
					}
					ingwyasacondition.clear();
				});
			} else {
				System.out.println("else in ch");
				Ingwaysaycmb.setVisible(false);
				CommanCBB.setVisible(true);
				grid.setContainerDataSource(container);
			}

		});
		
		/*
		 * 
		 * INGWAYSYA
		 * 
		 */
		Ingwaysay.addValueChangeListener(ll -> {
			if (Ingwaysay.getValue() == true) {
				CommanCBB.setVisible(false);
				Ingwaysaycmb.setVisible(true);
				BeanItemContainer<HdfcIfscCodeEntity> ingwysa = new BeanItemContainer<HdfcIfscCodeEntity>(
						HdfcIfscCodeEntity.class, ingwysaya);
				grid.setContainerDataSource(ingwysa);
				Ingwaysaycmb.addValueChangeListener(ll1 -> {

					for (int i = 0; i < ingwysaya.size(); i++) {

						HdfcIfscCodeEntity ff = (HdfcIfscCodeEntity) ingwysaya.get(i);
						if (Ingwaysaycmb.getValue().equals(ff.getCITY())) {
							ingwyasacondition.add(ff);
							BeanItemContainer<HdfcIfscCodeEntity> container12 = new BeanItemContainer<HdfcIfscCodeEntity>(
									HdfcIfscCodeEntity.class, ingwyasacondition);
							grid.setContainerDataSource(container12);
						}
					}
					ingwyasacondition.clear();
				});
			} else {
				System.out.println("else in ch");
				Ingwaysaycmb.setVisible(false);
				CommanCBB.setVisible(true);
				grid.setContainerDataSource(container);
			}

		});
	
		clear.addClickListener(cleartxt -> {
			searchBYName.setValue("");
			grid.setContainerDataSource(container);
		});
		hlayout.addComponent(searchBYName);
		hlayout.setSpacing(true);
		hlayout.addComponent(clear);
		hlayout.addComponent(hdfcCheackBox);
		hlayout.addComponent(mahBankCheackBox);
		hlayout.addComponent(americanBankCheckBox);
		hlayout.setSpacing(true);
		hlayout.addComponent(Ingwaysay);
		hlayout.addComponent(CommanCBB);
		hlayout.addComponent(mahBankCMbb);
		hlayout.addComponent(americanBKOM);
		hlayout.addComponent(HDFCCmbb);
		
		hlayout.addComponent(Ingwaysaycmb);
		
		Vlayout.addComponent(grid);
		return navigation;
	}

	public Griddemo() throws JsonParseException, JsonMappingException, IOException
	{
		System.out.println("hello");
		
		searchBYName.setInputPrompt("ALL CAPITAL....!");
		mahBankCMbb.setVisible(false);
		americanBKOM.setVisible(false);
		HDFCCmbb.setVisible(false);
		CommanCBB.setVisible(true);
		Ingwaysaycmb.setVisible(false);
		Client client = Client.create();
		String getrecord = "http://localhost:8888/allhdfcbank";
		WebResource res2 = client.resource(getrecord);
		ClientResponse dd2 = res2.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);

		String output = dd2.getEntity(String.class);
		// System.out.println(output);
		fromJson(output);

		// for update the grid row
		addComponent(hlayout);
		addComponent(Vlayout);
		Notification.show("control in grid");

	}

	@Override
	public void enter(ViewChangeEvent event) {
		Notification.show("Showing page 3");
	}

	

}
package com.example.IFSCCODE;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class demo {
	
	
	
	Client client;
	String getrecord;
	WebResource res2;
	ClientResponse dd2;
	String output;
	
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getGetrecord() {
		return getrecord;
	}

	public void setGetrecord(String getrecord) {
		this.getrecord = getrecord;
	}

	public WebResource getRes2() {
		return res2;
	}

	public void setRes2(WebResource res2) {
		this.res2 = res2;
	}

	public ClientResponse getDd2() {
		return dd2;
	}

	public void setDd2(ClientResponse dd2) {
		this.dd2 = dd2;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
	
	public demo(){
		
		
		 client = Client.create();
	 getrecord = "http://localhost:8888/allhdfcbank";
		 res2 = client.resource(getrecord);
		 dd2 = res2.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);

		 output = dd2.getEntity(String.class);
		
	}

	

	
}

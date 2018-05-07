package com.basant.spring.data.elasticsearch.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(indexName = "users", type = "users", shards = 2)
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Customer {
	@Id
	private long id;
	private String name;
	private String contactno;
	private String cardNo;
	private String expDate;
	private String bank;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}

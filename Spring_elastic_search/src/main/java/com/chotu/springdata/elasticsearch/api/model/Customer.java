package com.chotu.springdata.elasticsearch.api.model;

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
	private Long accNo;
	private String userName;
	private String contactno;
	private String cardNo;
	private String expDate;
	private String bank;
	
	
	

}

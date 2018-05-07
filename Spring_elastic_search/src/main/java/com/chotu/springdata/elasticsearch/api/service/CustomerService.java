package com.chotu.springdata.elasticsearch.api.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import com.chotu.springdata.elasticsearch.api.model.Customer;
import com.chotu.springdata.elasticsearch.api.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository repository;
	
	@Autowired
	ElasticsearchOperations operations;
	
	
	
	@PostConstruct
	public void loadALL() {
		List<Customer> users = new ArrayList<>();
		users.add(new Customer(123l, "irfan", "1234", "343", "4545", "ICICI"));
		users.add(new Customer(234234l, "xxxx", "444", "2323", "3423", "xcxc"));
		users.add(new Customer(5656l, "tttt", "555", "2323", "2323", "ghgh"));
		users.add(new Customer(7878l, "bbbbb", "6666", "3453", "45456", "qawq"));
		users.add(new Customer(5656l, "hhh", "777", "5656", "211", "dfg"));
		users.add(new Customer(4545l, "eeee", "7799", "5656", "656", "dffd"));
		
		operations.putMapping(Customer.class);
		repository.saveAll(users);
	}
	
	public List<Customer> findall1(String name){
		
		return (List<Customer>) repository.findByName(name);
	}

	
}

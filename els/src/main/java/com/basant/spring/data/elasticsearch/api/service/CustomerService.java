package com.basant.spring.data.elasticsearch.api.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

import com.basant.spring.data.elasticsearch.api.model.Customer;
import com.basant.spring.data.elasticsearch.api.model.HdfcIfscCodeEntity;
import com.basant.spring.data.elasticsearch.api.repository.CustomerRepository;


@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository repository;
	
	@Autowired
	ElasticsearchOperations operations;
	
	
	
	@PostConstruct
	public void loadALL() {
		List<HdfcIfscCodeEntity> users = new ArrayList<>();
		users.add(new HdfcIfscCodeEntity(123l, "irfan", "1234", "343", "4545", "ICICI"));
		users.add(new HdfcIfscCodeEntity(234234l, "xxxx", "444", "2323", "3423", "xcxc"));
		users.add(new HdfcIfscCodeEntity(5656l, "tttt", "555", "2323", "2323", "ghgh"));
		users.add(new HdfcIfscCodeEntity(7878l, "bbbbb", "6666", "3453", "45456", "qawq"));
		users.add(new HdfcIfscCodeEntity(5656l, "hhh", "777", "5656", "211", "dfg"));
		users.add(new HdfcIfscCodeEntity(4545l, "eeee", "7799", "5656", "656", "dffd"));
		repository.save(users);
		operations.putMapping(HdfcIfscCodeEntity.class);
		
	}
	
	public Iterable<HdfcIfscCodeEntity> findall1(){
		return  repository.findAll();
	}

	
}

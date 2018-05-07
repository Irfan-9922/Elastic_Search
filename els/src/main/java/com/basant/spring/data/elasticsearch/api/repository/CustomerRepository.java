package com.basant.spring.data.elasticsearch.api.repository;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.basant.spring.data.elasticsearch.api.model.Customer;


public interface CustomerRepository extends ElasticsearchRepository<Customer, Long>{
	
}

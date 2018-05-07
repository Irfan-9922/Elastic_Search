package com.chotu.springdata.elasticsearch.api.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.chotu.springdata.elasticsearch.api.model.Customer;

public interface CustomerRepository extends ElasticsearchRepository<Customer, Long>{
	List<Customer> findByName(String name);
}

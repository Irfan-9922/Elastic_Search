package com.basant.spring.data.elasticsearch.api.repository;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.CrudRepository;

import com.basant.spring.data.elasticsearch.api.model.Customer;
import com.basant.spring.data.elasticsearch.api.model.HdfcIfscCodeEntity;


public interface CustomerRepository extends ElasticsearchRepository<HdfcIfscCodeEntity, Long>,CrudRepository<HdfcIfscCodeEntity, Long>{
	
}

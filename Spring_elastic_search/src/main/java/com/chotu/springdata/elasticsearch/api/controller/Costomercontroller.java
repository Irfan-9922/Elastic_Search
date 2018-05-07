package com.chotu.springdata.elasticsearch.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chotu.springdata.elasticsearch.api.model.Customer;
import com.chotu.springdata.elasticsearch.api.service.CustomerService;

@RestController
@RequestMapping("/elastic-search")
public class Costomercontroller {

	
	
		@Autowired
		private CustomerService service;

	
}

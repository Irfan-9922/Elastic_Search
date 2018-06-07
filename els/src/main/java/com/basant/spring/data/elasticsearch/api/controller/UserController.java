package com.basant.spring.data.elasticsearch.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basant.spring.data.elasticsearch.api.model.Customer;
import com.basant.spring.data.elasticsearch.api.model.HdfcIfscCodeEntity;
import com.basant.spring.data.elasticsearch.api.service.CustomerService;

@RestController
@RequestMapping("/elastic-search")
public class UserController {
	/*@Autowired
	private UserService service;*/
	@Autowired
	private CustomerService service;

/*@GetMapping("/getAll")
	public List<Customer> getAll() {
		List<Customer> users = new ArrayList<>();
		service.findall1().forEach(user -> users.add(user));
		return users;
	}*/
	
	
	
	
	@GetMapping("/getAll")
	public List<HdfcIfscCodeEntity> getAll() {
		List<HdfcIfscCodeEntity> users = new ArrayList<>();
	 service.findall1().forEach(use -> users.add(use));
	 System.out.println(users);
		return users;
	}
	
	
/*
	@GetMapping("/findByName/{name}")
	public List<User> findUserByName(@PathVariable String name) {
		return service.findByName(name);
	}

	@GetMapping("/findByProfession")
	public List<User> findUserByProfession(@RequestParam("profession") String profession) {
		return service.findByProfession(profession);
	}

	@GetMapping("/filter/{input}")
	public List<User> filterRecord(@PathVariable String input) {
		return service.getAllWihFilter(input);
	}

	@GetMapping("/pagination/{salary}")
	public List<User> getUserBySalarywithPagination(@PathVariable long salary) {
		return service.getPaginationData(salary);
	}

	@GetMapping("/customSearch/{address}")
	public List<User> getUserBySalaryWithSearchQuery(@PathVariable String address) {
		return service.getCustomSearchdata(address);
	}*/
}

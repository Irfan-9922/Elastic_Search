package org.chotu.springelastic.search.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.chotu.springelastic.search.api.model.Student;
import org.chotu.springelastic.search.api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class StudentController {

	@Autowired
	private StudentService service;
	@GetMapping("/all")
	public List<Student> allrecord(){
		
		List<Student> st=new ArrayList<>();
		
		service.getall().forEach(s -> st.add(s));
		return st;
	}
}

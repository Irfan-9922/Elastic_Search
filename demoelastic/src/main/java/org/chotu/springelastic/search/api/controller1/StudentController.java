package org.chotu.springelastic.search.api.controller1;


import java.util.ArrayList;
import java.util.List;

import org.chotu.springelastic.search.api.model1.HdfcIfscCodeEntity;
import org.chotu.springelastic.search.api.model1.Student;
import org.chotu.springelastic.search.api.service1.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/search")
public class StudentController {

	@Autowired
	private StudentService service;

	
	
	
	@GetMapping("/allstudent")
	public List<Student> all (){
		List<Student> s=new ArrayList<>();
		service.all().forEach(ss -> s.add(ss) );
		return s;
		
	}
	
	@GetMapping("/allbank")
	public List<HdfcIfscCodeEntity> allbank(){
		return (List<HdfcIfscCodeEntity>) service.allbank();
	}
}

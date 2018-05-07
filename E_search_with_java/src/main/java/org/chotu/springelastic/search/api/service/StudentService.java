package org.chotu.springelastic.search.api.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.chotu.springelastic.search.api.model.Student;
import org.chotu.springelastic.search.api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;
	@Autowired
	private ElasticsearchOperations opretions;
	
	@PostConstruct
	public void loadData() {
		List<Student> student=new ArrayList<>();
		student.add(new Student(1, "irfan"));
		
		
		opretions.putMapping(Student.class);
		repository.save(student);
		
	}
	
	public Iterable<Student> getall(){
		return repository.findAll();
	}
}

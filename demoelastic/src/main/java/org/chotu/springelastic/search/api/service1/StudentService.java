package org.chotu.springelastic.search.api.service1;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.chotu.springelastic.search.api.model1.HdfcIfscCodeEntity;
import org.chotu.springelastic.search.api.model1.HdfcIfscCodeEntity2;
import org.chotu.springelastic.search.api.model1.Student;
import org.chotu.springelastic.search.api.repository1.RegistretionRepository;
import org.chotu.springelastic.search.api.repository1.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;



@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;
	@Autowired
	private ElasticsearchOperations opretions;
	
	@Autowired
	private RegistretionRepository repo;
	
	
	@PostConstruct
	public void loadData() {
		
		List<Student> student=new ArrayList<>();
		List<HdfcIfscCodeEntity2> bank=new ArrayList<>();
		
		bank.add(new HdfcIfscCodeEntity2("HDFC","76767","I238","Ltur","pune,tilak nagar","127362","pune","pune","MH"));
		bank.add(new HdfcIfscCodeEntity2("BOI","000","df445","mumbai","pune,tilak nagar","127362","pune","pune","MH"));
		
		
		student.add(new Student("4545", "Irfan"));
		
		opretions.putMapping(Student.class);
		opretions.putMapping(HdfcIfscCodeEntity2.class);
		
          repository.save(student);
 
	}
	
	
	  public Iterable<Student> all(){
		  return repository.findAll();
		  
	  }
	
	  public Iterable<HdfcIfscCodeEntity> allbank(){
		  return  repo.findAll();
	  }
	
	 
	

	
}

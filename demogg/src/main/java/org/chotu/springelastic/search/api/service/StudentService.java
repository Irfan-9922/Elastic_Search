package org.chotu.springelastic.search.api.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.chotu.springelastic.search.api.model.HdfcIfscCodeEntity;
import org.chotu.springelastic.search.api.model.Student;
import org.chotu.springelastic.search.api.repository.RegistretionRepositoryfor;
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
	
	@Autowired
	private RegistretionRepositoryfor reg;
	
	@PostConstruct
	public void loadData() {
		
		List<Student> student=new ArrayList<>();
		/*student.add(new HdfcIfscCodeEntity("HDFC",76767,"I238","Ltur","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("BOI",000,"df445","mumbai","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("ICC",0000,"fgb454","pune","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("HDFC",0000,"df45","pune","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("ICC",4545,"df43","pune","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("HDFC",4546,"sds43","pune","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("ICC",57567,"htgh43","pune","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("HDFC",6767,"dfd23","pune","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("BOI",6767,"h54","pune","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("HDFC",343,"bgf67","pune","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("ICC",23434,"cvbyt567","pune","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("HDFC",454,"dfvd675","pune","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("ICC",5656,"dtg56","pune","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("HDFC",343,"vbn676","pune","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("BOI",2343,"fgb565","pune","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("HDFC",454,"cvb n565","pune","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("HDFC",3434,"xc454","pune","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("ICC",56745,"cvb45","pune","pune,tilak nagar","127362","pune","pune","MH"));
		student.add(new HdfcIfscCodeEntity("HDFC",2334,"232dgf","pune","pune,tilak nagar","127362","pune","pune","MH"));
		*/
		
		student.add(new Student(1222, "Irfan"));
		
		opretions.putMapping(Student.class);
		repository.save(student);
	}
	
	public Iterable<Student> getall(){
		return repository.findAll();
	}
	     
	
	
	
	/*public List<HdfcIfscCodeEntity> getPaginationData(Integer salary) {
		return repository.findByIFSC(salary, new PageRequest(0, 2)).getContent();
	}*/
	
}

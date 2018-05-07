package org.chotu.springelastic.search.api.repository1;


import org.chotu.springelastic.search.api.model1.HdfcIfscCodeEntity;
import org.chotu.springelastic.search.api.model1.Student;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface StudentRepository extends  ElasticsearchRepository<Student, String>{
}

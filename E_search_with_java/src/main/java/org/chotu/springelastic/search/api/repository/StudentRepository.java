package org.chotu.springelastic.search.api.repository;

import org.chotu.springelastic.search.api.model.Student;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface StudentRepository extends  ElasticsearchRepository<Student, Integer>{

}

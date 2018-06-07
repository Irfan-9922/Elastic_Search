/**
 * 
 */
package com.dss.repositories;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.dss.model.Mobile2;
import com.dss.model.User1;

/**
 * @author s.parmar
 *
 */
public interface ElasticRepositories extends ElasticsearchRepository<User1,Integer> {

	/*User findByName(String name);
	
	List<User> findByNameContaining(String name);

	User findById(int id);*/
	
     User1 findByName(String name);
	
	List<User1> findByNameContaining(String name);

	User1 findById(int id);

	User1 findByMobile2(int id);
	
	
	User1 findByMobile2(String motype);
  }

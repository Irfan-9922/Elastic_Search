/**
 * 
 */
package com.dss.resources;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dss.model.User1;
import com.dss.service.CurdService;

/**
 * @author s.parmar
 *
 */
@RestController()
@RequestMapping(value= "/curd")
public class ElasticCurdResource {

	@Resource
	private CurdService service;

	/*@GetMapping("name/{name}")
	public User register(@PathVariable String name) {
		return service.getByName(name);
	}*/
	
	@GetMapping("name/{name}")
	public User1 register(@PathVariable String name) {
		return service.getByName(name);
	}
	
	/*@GetMapping("/")
	public List<User> getList(){
		  return service.getAllUser();
	}
	*/
	@GetMapping("/")
	public List<User1> getList(){
		  return service.getAllUser();
	}
	
	/*@GetMapping("nameLike/{name}")
	public List<User> getNameLike(@PathVariable String name) {
		return service.getByNameLike(name);
	}*/
	@GetMapping("nameLike/{name}")
	public List<User1> getNameLike(@PathVariable String name) {
		return service.getByNameLike(name);
	}
	
	
	@GetMapping("update/{name}")
	public void update(@PathVariable String name){
		  service.updateIfExist(name);
	}
	
	/*@GetMapping("find/{id}")
	public User findByIdValue(@PathVariable int id){
		  return service.findById(id);
	}*/
	
	@GetMapping("find/{id}")
	public User1 findByIdValue(@PathVariable int id){
		  return service.findById(id);
	}
	
	@GetMapping("u/{name}")
	public List<User1> findByQuery(@PathVariable String name){
		  return service.findByName(name);
	}
	
	@GetMapping("mobile/{motype}")
	public List<User1> find(@PathVariable String motype){
		  return service.findByMobile(motype);
	}
	
	@GetMapping("mobileid/{id}")
	public User1 findByMoId(@PathVariable int mo_id){
		  return service.findByMobileId(mo_id);
	}
	
	@GetMapping("simtype/{type}")
	public User1 findBySimType(@PathVariable String type){
		  return service.findBySimType(type);
	}
	

	@GetMapping("multtype/")
	public User1 findMultipleUser(){
		  return service.getMultipleUserByName();
	}
}

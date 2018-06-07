/**
 * 
 */
package com.dss.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.elasticsearch.index.query.MatchQueryBuilder.Operator;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import com.dss.model.Mobile2;
import com.dss.model.SimType;
import com.dss.model.User1;
import com.dss.repositories.ElasticRepositories;
import com.dss.repository.EmpRepository;

/**
 * @author s.parmar
 *
 */
@Service
@JsonIgnoreProperties( ignoreUnknown = true )
public class CurdServiceImpl implements CurdService {

	/*
	 * private List<User> userList; private Iterable<User> userIterable;
	 */

	private List<User1> userList;
	private Iterable<User1> userIterable;
	@Resource
	private ElasticRepositories repo;
	@Resource
	private EmpRepository jpaRepo;
	@Resource
	private ElasticsearchTemplate template;

	@Override
	@PostConstruct
	
	public void loadData() {
		int start1 = (int) System.currentTimeMillis();
		deleteAllData();
		int end1 = (int) System.currentTimeMillis();
		System.out.println("repo.delete===== " + (end1 - start1) + "millis seconds");
		int start = (int) System.currentTimeMillis();
		repo.save(getData());
		int end = (int) System.currentTimeMillis();
		System.out.println("repo.save ===== " + (end - start) + "millis seconds");
	}

	private List<User1> getData() {
		/*
		 * userList=new ArrayList<User>(); for(int i=0;i<1000;i++) { Mobile
		 * mobile=new Mobile(); mobile.setMo_id(i);
		 * mobile.setMobileNo(9999900l); mobile.setMotype("home");
		 * HashSet<Mobile> mobileSet=new HashSet<>(); mobileSet.add(mobile);
		 * userList.add(new User("xyz"+i,i,mobileSet)); }
		 * jpaRepo.save(userList); List<User> userListData=jpaRepo.findAll();
		 * return userListData;
		 */
		userList = new ArrayList<User1>();

		for (int i = 0; i < 100000; i++) {
			Mobile2 mobile = new Mobile2();
			mobile.setMo_id(i);
			mobile.setMobileNo((9l) + i);
			mobile.setMotype("home"+ i);
			SimType simType = new SimType();
			simType.setId(i);
			simType.setSimName("jio" + i);
			HashSet<Mobile2> mobileSet = new HashSet<>();
			HashSet<SimType> types = new HashSet<>();
			mobileSet.add(mobile);
			types.add(simType);
			mobile.setSimType(types);
			userList.add(new User1("xyz"+" "+ i, i, mobileSet));
		}
		return userList;
	}

	/*
	 * @Override public List<User> getAllUser(){ userIterable= repo.findAll();
	 * List<User> userList=new ArrayList<>();
	 * userIterable.forEach(userList::add); return userList; }
	 */

	@Override
	public List<User1> getAllUser() {
		userIterable = repo.findAll();
		List<User1> userList = new ArrayList<>();
		userIterable.forEach(userList::add);
		return userList;
	}

	/*
	 * @Override public User getByName(String name) { return
	 * repo.findByName(name); }
	 */

	@Override
	public User1 getByName(String name) {
		return repo.findByName(name);
	}

	/*
	 * @Override public List<User> getByNameLike(String name) { return
	 * repo.findByNameContaining(name); }
	 */
	@Override
	public List<User1> getByNameLike(String name) {
		return repo.findByNameContaining(name);
	}

	@Override
	public void deleteAllData() {
		repo.deleteAll();
	}

	@Override
	public void updateIfExist(String name) {
		repo.deleteAll();
		userList.forEach(e -> {
			e.setName(name);
		});
		repo.save(userList);
	}

	/*
	 * @Override public User findById(int id) { return repo.findById(id); }
	 */

	@Override
	public User1 findById(int id) {
		return repo.findById(id);
	}

	@PreDestroy
	public void destroy() {
		System.out.println("abcd");

	}

	@Override
	public List<User1> findByName(String name) {
		QueryBuilder query = QueryBuilders.boolQuery()
				.should(QueryBuilders.queryStringQuery(name).lenient(true).field("name"))
				.should(QueryBuilders.queryStringQuery("*" + name + "*").lenient(true).field("name"));
		NativeSearchQuery builder = new NativeSearchQueryBuilder().withQuery(query).build();
		// Map m=template.getMapping("employeeindex","emp");//index data
		// information
		System.out.println(query);
		List<User1> user = template.queryForList(builder, User1.class);
		return user;
	}

	@Override
	public List<User1> findByMobile(String motype) {
		QueryBuilder builder = QueryBuilders.nestedQuery("mobile2",
				QueryBuilders.boolQuery().must(QueryBuilders.termQuery("mobile2.motype", motype)));
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(builder).build();
		List<User1> user = template.queryForList(searchQuery, User1.class);
		System.out.println(builder + "===execute");
		return user;
	}

	@Override
	public User1 findByMobileId(int mo_id) {
		QueryBuilder builder = QueryBuilders.nestedQuery("mobile2",
				QueryBuilders.boolQuery().must(QueryBuilders.termQuery("mobile2.mo_id", mo_id)));
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(builder).build();
		List<User1> user = template.queryForList(searchQuery, User1.class);
		System.out.println(builder);
		return user.get(0);
	}

	@Override
	public User1 findBySimType(String simName) {
		
		QueryBuilder builder = QueryBuilders.nestedQuery("mobile2.simType",
				QueryBuilders.boolQuery().must(QueryBuilders.termQuery("mobile2.simType.simName", simName)));
		SearchQuery query = new NativeSearchQueryBuilder().withQuery(builder).build();
		List<User1> mobile2s = template.queryForList(query, User1.class);
		System.out.println(builder+"===");
		return mobile2s.get(0);
	}
	
	@Override
	public User1 getMultipleUserByName() {
		     QueryBuilder builder=QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("name", "xyz 111"));
		     QueryBuilder builder2=QueryBuilders.matchQuery("name","xyz xyz").operator(Operator.OR);
		     SearchQuery searchQuery = new NativeSearchQueryBuilder()
		    	.withQuery(builder2)
		    		  .build();
		     SearchQuery query=new NativeSearchQueryBuilder().withQuery(builder).build();
		     List<User1> users= template.queryForList(searchQuery, User1.class);
		     System.out.println(builder2);
		     return users.get(0);
	}
	
}

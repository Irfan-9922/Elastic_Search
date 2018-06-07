package com.dss.service;

import java.util.List;

import com.dss.model.User1;

public interface CurdService {
      public void loadData();
      /*public User getByName(String name);
	  public List<User> getAllUser();
	  public List<User> getByNameLike(String name);
	  public void deleteAllData();
	  public void updateIfExist(String name);
	  public User findById(int id);*/
      
      public User1 getByName(String name);
	  public List<User1> getAllUser();
	  public List<User1> getByNameLike(String name);
	  public void deleteAllData();
	  public void updateIfExist(String name);
	  public User1 findById(int id);
	  List<User1> findByName(String name);
      List<User1>  findByMobile(String motype);
      User1  findByMobileId(int mo_id);
      User1 findBySimType(String type);

	User1 getMultipleUserByName();
}


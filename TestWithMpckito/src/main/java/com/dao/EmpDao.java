package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bean.Emp;

public interface EmpDao {
	
	public List<Emp> getallemployee();
	

}

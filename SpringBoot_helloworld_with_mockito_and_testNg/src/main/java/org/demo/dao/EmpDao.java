package org.demo.dao;

import java.util.List;

import org.demo.beans.Emp;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface EmpDao {
	
	public List<Emp> getAllemp();

}

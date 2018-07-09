package org.demo.dao;

import java.util.List;

import org.demo.beans.Emp;
import org.springframework.stereotype.Repository;
@Repository
public interface EmpOnsite {

	public List<Emp> getallonsiteEmp();
}

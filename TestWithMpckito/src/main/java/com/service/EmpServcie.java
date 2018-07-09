package com.service;

import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bean.Emp;
import com.dao.EmpDao;

@Component
public class EmpServcie {

	@Autowired
	EmpDao dao;

	public EmpDao getDao() {
		return dao;
	}

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}
	
	
	public List<com.bean.Emp> allemp(){
		
		ArrayList al=new ArrayList();
		
		
al=	(ArrayList) dao.getallemployee();
		
	
		return al;
		
	}

	
	
}

package com.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bean.Emp;
import com.dao.EmpDao;

import junit.framework.TestCase;

public class EmpServcieTest extends TestCase {

	@Mock
	EmpDao dao;

	@InjectMocks
	EmpServcie servcie;

	@BeforeClass
	public void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);
	}

	@Override
	public String toString() {
		return "EmpServcieTest [dao=" + dao + ", servcie=" + servcie + "]";
	}

	@Test
	public void testgetallemp() {
		ArrayList<Emp> e=new ArrayList<Emp>();
	
		
		e.add(new Emp("irfan", 12));
		
    
 //   System.out.println(servcie.getDao()+"from servcie.setdao");
		when(dao.getallemployee()).thenReturn(e);
		servcie.setDao(dao);
	
		assertEquals(dao.getallemployee(),servcie.allemp());
		System.out.println(servcie.allemp()+"from service");
		System.out.println(e+"from dao");
	}
}

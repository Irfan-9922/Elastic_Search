package org.demo.service;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.testng.Assert.assertEquals;

import org.demo.beans.Emp;
import org.demo.dao.EmpOnsite;
import org.demo.dao.Empdaoimpl;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.OngoingStubbing;
import org.testng.annotations.Test;

@Test
public class EmpServiceTest {

	@Mock
	Empdaoimpl onsite;
	
	@Mock
	List list;

	@InjectMocks
	EmpService service;
	
	@Captor
	ArgumentCaptor  captor;

	@BeforeClass
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
/*	@Test
	public void testcaptor() {
		
		list.add("one");
	
		
		  Mockito.verify(list).add(captor.capture());
		  
		
		  Object dd = captor.getValue();
		 System.out.println(dd);
		
		  //  assertEquals("one", captor.getValue());
		
	}
	*/
	@Test
	public void testgetallemp() {
		//dummy data
		ArrayList<Emp> e = new ArrayList<Emp>();
		e.add(new Emp(1, 12, "irfan"));
		
		
		
       //stubbing
		when(onsite.getallonsiteEmp()).thenReturn(e);
		System.out.println(e + "onsite data");
		service.setDao(onsite);
		assertEquals(onsite.getallonsiteEmp(), service.getallonsite());
		
	}
	@Override
	public String toString() {
		return "EmpServiceTest [onsite=" + onsite + ", service=" + service + "]";
	}
	public EmpOnsite getOnsite() {
		return onsite;
	}

}

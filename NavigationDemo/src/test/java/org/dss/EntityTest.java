/**
 * All rights are reserved for diss.
 */
package org.dss;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.NavigationDemo.EmployeeEntity;
import com.example.NavigationDemo.Sample;

import junit.framework.TestCase;

/**
 * @author i.shaikh
 *
 * @Date  Feb 27, 2018
 * @Time  11:23:15 AM
 */
public class EntityTest extends TestCase {

	
	
	Sample s;
	static int lenth=4;
	EmployeeEntity	e;
	
	@Before
	protected void setUp() throws Exception {
		e=new EmployeeEntity("2123", "latur", 1213, new Date(), "jd", "irfan", "male", "shaikh", "single", 12334);
	
	s=new Sample();
	
	}

	
	@After
	protected void tearDown() throws Exception {
		
	}

	@Test
	public void test_EmployeeIDDuplicate() {
		s.dss(e);
		assertEquals(lenth, e.getId().length());
	}
	

}

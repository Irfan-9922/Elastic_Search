package org.demo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotation {

Employee e=new Employee("irfan",100);
employeeService ser=new employeeService();

	
	
	   @Test
	   public void testCase1() {
	      System.out.println("in test case 1");
	      assertEquals(1200, ser.annualSal(e));
	   }

	   @Test
	   public void testApprisel() {
		   
		   assertEquals(1100, ser.apprisel(e));
		   
	   }
	   
	   
}
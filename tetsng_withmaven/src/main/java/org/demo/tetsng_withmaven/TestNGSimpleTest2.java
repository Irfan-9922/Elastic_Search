package org.demo.tetsng_withmaven;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestNGSimpleTest2 {
	   @Test
	   public void testAdd() {
	      String str = "TestNG is working fine2";
	     assertEquals("TestNG is working fine2", str);
	   }
	}

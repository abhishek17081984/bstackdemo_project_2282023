package com.mvm.Maven_Demo;

import org.testng.annotations.Test;

public class TestNG_Priority {
	
	@Test(priority=0 )
	public void testA() {
		System.out.println("testing  A");
		
	}

	@Test(priority=2 )
	public void testB() {
		System.out.println("testing  c");
		
	}

	@Test(priority=4)
	public void testC() {
		System.out.println("testing  e");
		
	}
@Test(priority=3 )
	public void testD() {
		System.out.println("testing  D");
		
	}
	

@Test(priority=1)
	public void testE() {
		System.out.println("testing  b");
		
	}

}

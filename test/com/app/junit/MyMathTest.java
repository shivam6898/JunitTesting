package com.app.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
//Absence if failure is success.
class MyMathTest {

	@Test
	public void sum_With3Number() {
		MyMath myMath= new MyMath();
		assertEquals(6, myMath.sum(new int[] {1,2,3}));   //alt+shift+i to inline 

	}

	//some of the anotations are 
	@Before
	public void before() {
		System.out.println("before...");
	}
	@After
	public void after() {
		System.out.println("after");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("after class");
	}

}

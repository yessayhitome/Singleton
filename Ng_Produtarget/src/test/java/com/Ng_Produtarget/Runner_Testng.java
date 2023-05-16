package com.Ng_Produtarget;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Runner_Testng {
	
	@BeforeSuite
	public void ground() {
		
		System.out.println("Ground");

	}
	
	@BeforeTest
	public void stadium() {
		
		System.out.println("Stadium");
       
	}
	
	@BeforeClass
	public void team() {
		System.out.println("Team");

	}
	
	@BeforeMethod
	public void player() {
		
		System.out.println("Player");
	}
	
	@Test
	public void india() {
		System.out.println("India");
	}
	
	@Test
	public void australia() {
		System.out.println("Australia");

	}
	
	@AfterMethod
	public void captain() {
		System.out.println("Captain");
	}
	
	@AfterClass
	public void toss() {
		System.out.println("Toss");
	}
	
	@AfterTest
	public void head() {
		System.out.println("Head");
	}
	
	@AfterSuite
	public void tail() {
		System.out.println("Tail");
	}
}

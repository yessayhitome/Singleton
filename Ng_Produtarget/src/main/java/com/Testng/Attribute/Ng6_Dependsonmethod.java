package com.Testng.Attribute;

import org.testng.annotations.Test;

public class Ng6_Dependsonmethod {
	


	@Test(priority = -1,dependsOnMethods = "kkr")
	public void rcb() {
		
		System.out.println("Rcb Bowling");

	}
	
	@Test(priority = 3)
	public void kkr() {
		System.out.println("Kkr Batting");

	}
	
	
	@Test(priority = -4)
	public void toss() {
		System.out.println("Toss");

	}
	
	@Test(priority = 4)
	public void teamwin() {
		System.out.println("Team Win KKR");

	}
	
	@Test(priority = 2)
	public void teamloss() {
		System.out.println("Team Loss RCB");

	}
	
	@Test(priority = 1)
	public void bowling() {
		System.out.println("KKR Bowling");

	}
	
	@Test
	public void batting() {
		System.out.println("RCB Batting");

	}
	
	}

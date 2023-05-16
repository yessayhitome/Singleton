package com.Testng.Attribute;

import org.testng.annotations.Test;

public class Ng9_Grouping {
	

	@Test(groups = {"smoke"})
	public void rcb() {
		
		System.out.println("Rcb Bowling");

	}
	
	@Test(groups = {"sanity"})
	public void toss() {
		System.out.println("Toss");

	}
	
	@Test(groups = {"smoke"})
	public void teamloss() {
		System.out.println("Team Loss RCB");

	}
	
	@Test(priority = 1)
	public void bowling() {
		System.out.println("KKR Bowling");

	}
	
	@Test(groups = {"sanity"})
	public void batting() {
		System.out.println("RCB Batting");

	}

}

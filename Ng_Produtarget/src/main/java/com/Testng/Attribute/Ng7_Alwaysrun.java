package com.Testng.Attribute;

import org.testng.annotations.Test;

public class Ng7_Alwaysrun {
	
	@Test(groups = {"regression"})
	public void kkr() {
		System.out.println("Kkr Batting");

	}
	
	
	@Test(groups = {"unit testing"})
	public void toss() {
		System.out.println("Toss");

	}
	
	@Test(groups = {"regression"})
	public void teamwin() {
		System.out.println("Team Win KKR");
		int a = 10/0;
		System.out.println(a);

	}
	@Test(groups = {"smoke"})
	public void teamloss() {
		System.out.println("Team Loss");

	}
	

}

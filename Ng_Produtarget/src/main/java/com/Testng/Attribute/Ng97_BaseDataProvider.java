package com.Testng.Attribute;

import org.testng.annotations.DataProvider;

public class Ng97_BaseDataProvider {
	
	@DataProvider(name="myTestCaseData")
	private Object[][] testCase() {
		
		Object[][] objName = new Object[][] {
			
			{"sam@gmail.com","Welcome@99","Male"},
			{"ram@gmail.com","Ram@123","male"},
			{"ana@greens.com","Greens","female"}
			
		};
		return objName;
	}


}

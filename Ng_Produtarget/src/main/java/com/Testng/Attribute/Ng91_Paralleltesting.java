package com.Testng.Attribute;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Base.Class.Base_Cls;

public class Ng91_Paralleltesting extends Base_Cls{
	
	public static WebDriver driver = Base_Cls.get_Browser("chrome");
	
	@Test
	public void facebook() {
		
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void amazon() {
		
		driver.get("https://www.amazon.in/");

	}
	
	
	
	   
	   
	   
}


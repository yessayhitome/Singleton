package com.Testng.Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ng93_AssertSoft {
	
	
	@Test
	private void test() {
				
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathi\\eclipse-workspace\\Ng_Produtarget\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(title, "Facebook – log in or sign up56");
		//sa.assertAll();
		
		driver.quit();
	}
	
	
	
	
	
}

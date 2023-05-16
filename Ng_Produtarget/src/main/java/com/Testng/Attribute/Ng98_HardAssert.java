package com.Testng.Attribute;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ng98_HardAssert {
	
	@Test
	private void test() {
				
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathi\\eclipse-workspace\\Ng_Produtarget\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//assertEquals(title, "Facebook – log in or sign up");
		
		//assertNotEquals(title, "Facebook – log in or sign up");
		
		//assertSame(title, "Facebook – log in or sign up");
		
		//assertNull(title);
		
		//assertNotNull(title);
		
		assertTrue(true);
		
		driver.quit();
	


}
	
}

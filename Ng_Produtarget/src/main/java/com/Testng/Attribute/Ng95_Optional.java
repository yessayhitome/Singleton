package com.Testng.Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ng95_Optional {
	
	@Parameters({"mail","password","gender"})
	@Test
	private void test(@Optional("dhonicsk08@gmail.com")String name,String password,String gender) {
		
		System.out.println("Gender = "+gender);
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathi\\eclipse-workspace\\Ng_Produtarget\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
		mail.sendKeys(name);
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
		pwd.sendKeys(password);
		
		WebElement log = driver.findElement(By.xpath("//button[@name='login']"));
		log.click();

}

}

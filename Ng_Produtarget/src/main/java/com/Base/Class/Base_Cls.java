package com.Base.Class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Cls {
	
    public static WebDriver driver;
    
    public static WebDriver get_Browser(String type) {
    	
    	if (type.equalsIgnoreCase("chrome")) {
			
    		System.setProperty("webdriver.chrome.driver", 
    				"C:\\Users\\sathi\\eclipse-workspace\\Ng_Produtarget\\Driver\\chromedriver.exe");
    		
    		driver = new ChromeDriver();
    		
    		driver.manage().window().maximize();
    		
		} else if(type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", 
    				"C:\\Users\\sathi\\eclipse-workspace\\Blac_Frid\\Driver\\chromedriver.exe");
    		
    		driver = new FirefoxDriver();
    		
    		driver.manage().window().maximize();

		}
		return driver;

	}
    
    public static void get_Url(String url) {
    	
    	driver.get(url);

	}
    
    public static String get_Title() {
    	
    	String title = driver.getTitle();
    	
    	return title;

	}
    
    public static void close() {
    	
    	driver.close();

	}
    
    public static void quit() {
    	
    	driver.quit();

	}
    
    public static String get_CurrentUrl() {
    	
    	String currentUrl = driver.getCurrentUrl();
    	
    	return currentUrl;

	}
    
    public static String get_PageSource() {
    	
    	String pageSource = driver.getPageSource();
    	
    	return pageSource;

	}
    
    public static void get_To(String url) {
    	
    	driver.navigate().to(url);

	}
    
    public static void get_Back() {
    	
    	driver.navigate().back();

	}
    
    public static void get_Forward() {
    	
    	driver.navigate().forward();

	}
    
    public static void get_Refresh() {
    	
    	driver.navigate().refresh();

	}
    
    public static void click_Button(WebElement element) {
    	
    	element.click();

	}
    
    public static void send_Keys(WebElement element,String value) {
    	
    	element.sendKeys(value);

	}
    
    public static String get_Text(WebElement element) {
    	
    	String text = element.getText();
    	   	
    	return text;

	}
    
    public static  void to_Clear(WebElement element) {
    	
    	element.clear();

	}
    
    public static boolean is_Displayed(WebElement element) {
    	
    	boolean displayed = element.isDisplayed();
    	
    	return displayed;

	}
    
    public static boolean is_Selected(WebElement element) {
    	
    	boolean selected = element.isSelected();
    	
    	return selected;

	}
    
    public static boolean is_Enabled(WebElement element) {
	
	boolean enabled = element.isEnabled();
	
	return enabled;

    }
    
    public static void drop_Down(WebElement element,String value,String type) {
    	
    	Select s = new Select(element);
    	
        if (type.equalsIgnoreCase("ByVisibleText")) {
			
        	s.selectByVisibleText(value);
		}
        
        else if (type.equalsIgnoreCase("ByValue")) {
        	
        	s.selectByValue(value);
			
		}
        
        else if (type.equalsIgnoreCase("ByIndex")) {
        	
        	int byIndex_Value = Integer.parseInt(value);
        	s.selectByIndex(byIndex_Value);
			
		}
        
        else if (type.equalsIgnoreCase("DeselectByvalue")) {
        	
        	s.deselectByValue(value);
			
		}
        
        else if(type.equalsIgnoreCase("DeselectedByVisibleText")) {
        	
        	s.deselectByVisibleText(value);
        }
          
	}
    
    public static void sleep(int value) throws InterruptedException {
    	
    	Thread.sleep(value);

	}
    
    public static void implicit_Wait(int value) {
    	
    	driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);

	}
    
    public static void explicit_Wait(WebElement element, int value) {
    	
    	WebDriverWait wait = new WebDriverWait(driver,value);
    	wait.until(ExpectedConditions.visibilityOf(element));

	}
    
    
	
}

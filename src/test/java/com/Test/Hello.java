package com.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hello {
	WebDriver driver;
	
	
	@BeforeMethod
	public void webSiteSetup() {
		
    System.setProperty("webdriver.chrome.driver", "/Users/waqaskhan/Documents/JAR Files/chromedriver");
    driver = new ChromeDriver();
//    driver.manage().window().fullscreen();

}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void testCase() {
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	




}

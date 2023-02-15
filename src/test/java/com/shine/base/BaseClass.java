package com.shine.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseURL="https://www.shine.com/";
	public String username="dinesh";
	public String email="dinesh@gmail.com";
	public String password="dinesh1";
	public String number="8309131066";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	

}

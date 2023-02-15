package com.shine.testcases;

import org.testng.annotations.Test;

import com.shine.base.BaseClass;
import com.shine.pageobject.IndexPage;
import com.shine.pageobject.LoginPage;
import com.shine.pageobject.RegisterPage;

public class TC_RegisterPageTest_002 extends BaseClass{
	IndexPage indexPage;
	RegisterPage registerPage;
	LoginPage loginPage;
	@Test
	public void RegisterPageTest() {
		driver.get(baseURL);
		RegisterPage registerPage=new RegisterPage();
		indexPage.clickOnRegister();
	}
	
	
	
	
	

}

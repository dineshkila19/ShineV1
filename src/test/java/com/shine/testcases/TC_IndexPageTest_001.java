package com.shine.testcases;

import org.testng.annotations.Test;

import com.shine.base.BaseClass;
import com.shine.pageobject.IndexPage;

public class TC_IndexPageTest_001 extends BaseClass{
	
	@Test
	public void IndexPageTest() {
		driver.get(baseURL);
		IndexPage indexPage=new IndexPage(driver);
		indexPage.validateShineLogo();
		indexPage.validateHelpLine();
		indexPage.clickOnRegister();
	}

}

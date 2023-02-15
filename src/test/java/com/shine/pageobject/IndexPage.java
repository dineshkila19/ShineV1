package com.shine.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.shine.action.Action;
import com.shine.base.BaseClass;

public class IndexPage extends BaseClass {
	
	public static WebDriver ldriver;
	
	public IndexPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="/html/body/div/header[2]/div[1]/span[1]/a/img")
	WebElement shineLogo;
	
	@FindBy(xpath="/html/body/div/header[1]/div[2]/div/ul/li[3]/div")
	WebElement helpLine;
	
	@FindBy(xpath="//a[@title='Register']")
	WebElement registerBtn;
	
	
	
	public boolean validateShineLogo() {
		return Action.isSelected(ldriver, shineLogo);
	
		}
	
	public boolean validateHelpLine() {
		return Action.isSelected(ldriver, helpLine);
	}
	public RegisterPage clickOnRegister() {
		Action.click(ldriver, registerBtn);
		return new RegisterPage();
	}
	
	
	

}

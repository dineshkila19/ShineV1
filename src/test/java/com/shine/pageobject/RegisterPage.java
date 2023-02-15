package com.shine.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shine.action.Action;
import com.shine.base.BaseClass;

public class RegisterPage extends BaseClass {
	
	public static WebDriver ldriver;
	
	public RegisterPage() {
		ldriver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	

	@FindBy(xpath="//input[@id='id_name']")
	WebElement txtName;
	
	@FindBy(xpath="//input[@id='id_email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='id_cell_phone']")
	WebElement txtMobileNumber;
	
	@FindBy(xpath="//input[@id='id_password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='id_privacy']")
	WebElement checkBox;
	
	@FindBy(xpath="//button[@id='registerButton']")
	WebElement btnContinue;
	
	public LoginPage register(String name, String email, String number, String password) {
		Action.type(txtName, name);
		Action.type(txtEmail, email);
		Action.type(txtMobileNumber, number);
		Action.type(txtPassword, password);
		Action.click(ldriver, checkBox);
		Action.click(ldriver, btnContinue);
		return new LoginPage();
	}
	
	
	
	
	
}

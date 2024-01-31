package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.utils.LoginDataprovider;

public class Loginpage extends LoginDataprovider {

	@FindBy(id="user_name")
	WebElement username;
	
	@FindBy(id="user_password")
	WebElement password;
	
	@FindBy(xpath ="//*[@id=\"login_button\"]")
	WebElement loginBtn;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	public void loginToApplication(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
	}
	public Salespage validLogin() {
		username.sendKeys("admin");
		password.sendKeys("pass");
		loginBtn.click();
		return new Salespage(driver);
	}
}
package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Salespage {

public WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"companyLogo\"]/a/img")
	WebElement header;
	
	public Salespage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public String getHeader() {
		
		return header.getText();
	}
}

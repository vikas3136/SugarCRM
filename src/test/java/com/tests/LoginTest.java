package com.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.Loginpage;

public class LoginTest extends BaseClass {

	Loginpage lp= null;
	@BeforeMethod
	public void setup()throws Exception {
		initialization();
		lp= new Loginpage(driver);
}
	@Test
	public void test01() {
		lp.loginToApplication("admin", "pass");
		Assert.assertEquals(driver.getTitle(), "WebStocker");
	}
//	@Test
//	public void test02() {
//		throw new SkipException("skipping testcase");
//}
}
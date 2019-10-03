package com.prestaonlineshop.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.prestaonlineshop.qa.base.*;
import com.prestaonlineshop.qa.pages.HomePage;
import com.prestaonlineshop.qa.pages.SignInPage;

public class LoginPageTest extends TestBase{
	
	SignInPage objSignInPage;
	HomePage objHomePage;
	
	public LoginPageTest(){
		super();
	}
		
	@BeforeMethod
	public void setUp(){
		initialization();
		objHomePage = new HomePage();
		objSignInPage = objHomePage.clickSignInLink();
		
	}
	
	@Test(priority=1)
	public void SignInPageTest(){
		String pageTitle = objSignInPage.validateSignInPageTitle();
		System.out.println("Home Page title is : "+pageTitle);
		Assert.assertEquals(pageTitle, "My Store");
	}
	
	@Test(priority=2)
	public void newRegistration_CreateAccount(){
		objSignInPage.createNewAccount(prop.getProperty("emailId"));		
	}
	
	@Test(priority=3)
	public void existingUserLogin(){
		objSignInPage.registeredUserLogin(prop.getProperty("emailId"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

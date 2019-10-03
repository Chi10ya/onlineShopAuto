package com.prestaonlineshop.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.prestaonlineshop.qa.base.*;
import com.prestaonlineshop.qa.pages.HomePage;

public class HomePageTest extends TestBase{
	
	HomePage objHomePage;
	
	public HomePageTest(){
		super();
	}
		
	@BeforeMethod
	public void setUp(){
		initialization();
		objHomePage = new HomePage();
	}
	
	@Test
	public void homePageTitle(){
		String pageTitle = objHomePage.validateHomePageTitle();
		System.out.println("Home Page title is : "+pageTitle);
		Assert.assertEquals(pageTitle, "My Store");
		objHomePage.clickSignInLink();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}

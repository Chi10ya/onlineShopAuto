package com.prestaonlineshop.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.prestaonlineshop.qa.base.*;
import com.prestaonlineshop.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase{
	
	SignUpPage objSignUpPage;
	
	public SignUpPageTest(){
		super();
	}
		
	@BeforeMethod
	public void setUp(){
		initialization();
		objSignUpPage = new SignUpPage();
	}
	
	@Test(priority=1)
	public void SignUpPage_CreateNewAccountTest(){
		String SignUpPageTitle = objSignUpPage.validateSignUpPageTitle();
		System.out.println("Home Page title is : "+SignUpPageTitle);
	}
	
	@Test(priority=2)
	public void selectTitleMrMrs(){
		objSignUpPage.selectTitle();
	}
	
	@Test(priority=3)
	public void enter_firstName(){
		objSignUpPage.enterFirstName("Shajeer");
	}
	
	@Test(priority=4)
	public void enter_lastName(){
		objSignUpPage.enterLastName("Mundoleentavita");
	}
	
	@Test(priority=5)
	public void enter_Password(){
		objSignUpPage.enterPassword("test@123");
	}
	
	@Test(priority=6)
	public void select_DOBdd(){
		objSignUpPage.clickDOBdd();
		objSignUpPage.selectDOBdd("10");
	}
	
	@Test(priority=7)
	public void select_DOBmm(){
		objSignUpPage.clickDOBmm();
		objSignUpPage.selectDOBmm("04");
	}
	
	@Test(priority=8)
	public void select_DOByy(){
		objSignUpPage.clickDOByy();
		objSignUpPage.selectDOByy("1982");
	}
	
	@Test(priority=9)
	public void selectCheckBoxSignUpLetter(){
		objSignUpPage.selectSignUpLetter();
	}
	
	@Test(priority=10)
	public void enter_addFirstName(){
		objSignUpPage.enterAddFirstName("Shajeer");
	}
	
	@Test(priority=11)
	public void enter_addLastName(){
		objSignUpPage.enterAddLastName("Mundoleentavita");
	}
	
	@Test(priority=12)
	public void enter_addCompany(){
		objSignUpPage.enterCompany("Google");
	}
	
	@Test(priority=13)
	public void enter_addAddress(){
		objSignUpPage.enterAddress("JLT, Dubai");
	}
	
	@Test
	public void enter_addCity(){
		objSignUpPage.enterCity("Dubai");
	}
	
	@Test(priority=14)
	public void select_State(){
		objSignUpPage.clickDrpState();
		objSignUpPage.selectDrpState("California");
	}
	
	@Test(priority=15)
	public void enter_ZipCode(){
		objSignUpPage.enterZipCode("50022");
	}
	
	@Test(priority=16)
	public void select_Country(){
		objSignUpPage.clickDrpCountry();
		objSignUpPage.selectDrpCountry("United States");
	}
	
	@Test(priority=17)
	public void enter_addInfo(){
		objSignUpPage.enterAddInfo("Adding test information");
	}
	
	@Test(priority=18)
	public void enter_HomePhoneNumber(){
		objSignUpPage.enterHomePhone("+971526498890");
	}
	
	@Test(priority=19)
	public void enter_MobilePhoneNumber(){
		objSignUpPage.enterMobilePhone("+971526498890");
	}
	
	@Test(priority=20)
	public void enter_MyAddress(){
		objSignUpPage.enterMyAddress("my address test");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

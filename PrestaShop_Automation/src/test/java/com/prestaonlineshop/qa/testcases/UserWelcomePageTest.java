package com.prestaonlineshop.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.prestaonlineshop.qa.base.TestBase;
import com.prestaonlineshop.qa.pages.UserWelcomePage;

public class UserWelcomePageTest extends TestBase{
			
	UserWelcomePage objUserWelcomePage;
		
		public UserWelcomePageTest(){
			super();
		}
			
		@BeforeMethod
		public void setUp(){
			initialization();
			objUserWelcomePage = new UserWelcomePage();
		}
		
		@Test
		public void checkOrderHistoryDetailsButtonExists(){
			String result = objUserWelcomePage.verifyOrderHistoryDetailsButtonExists();
			System.out.println("Result = "+result);
		}

}

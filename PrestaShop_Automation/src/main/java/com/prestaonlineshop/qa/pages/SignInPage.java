package com.prestaonlineshop.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prestaonlineshop.qa.base.*;

public class SignInPage extends TestBase {
	
	// For Create an Account
	
	@FindBy(id="email_create")
	WebElement txtbx_NewAcc_EmailId;
	
	@FindBy(id="SubmitCreate")
	WebElement btn_NewAcc_CreateAnAccount;
	
	// For Already Registered User
	
	@FindBy(id="email")
	WebElement txtbx_Reg_EmailId;

	@FindBy(id="passwd")
	WebElement txtbx_Reg_Password;
	
	@FindBy(id="SubmitLogin")
	WebElement btn_Reg_SignIn;
	

		public SignInPage(){
			PageFactory.initElements(driver, this);
		}
		
		// Sign Page actions
		
		public String validateSignInPageTitle(){
			return driver.getTitle();
		}
						
		public SignUpPage createNewAccount(String emailAddress){
			txtbx_NewAcc_EmailId.sendKeys(emailAddress);
			btn_NewAcc_CreateAnAccount.click();
			return new SignUpPage();
		}
		
		public UserWelcomePage registeredUserLogin(String regEmailId, String regPassword){
			txtbx_Reg_EmailId.sendKeys(regEmailId);
			txtbx_Reg_Password.sendKeys(regPassword);
			btn_Reg_SignIn.click();
			return new UserWelcomePage();
		}
		
	
	
}

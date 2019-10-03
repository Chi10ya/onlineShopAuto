package com.prestaonlineshop.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prestaonlineshop.qa.base.*;

public class HomePage extends TestBase{
	
	
	@FindBy(xpath="//ul[@id='homefeatured']/li[1]/div[@class='product-container']//a[@title='Add to cart']/span[.='Add to cart']")
	WebElement addToCart;
	
	@FindBy(xpath="/html//header[@id='header']//nav//a[@title='Log in to your customer account']")
	WebElement lnkSignIn;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle(){
		return driver.getTitle();
	}
			
	public SignInPage clickSignInLink(){
		lnkSignIn.click();
		return new SignInPage();
	}
	
}

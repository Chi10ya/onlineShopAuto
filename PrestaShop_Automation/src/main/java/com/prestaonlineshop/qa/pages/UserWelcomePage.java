package com.prestaonlineshop.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prestaonlineshop.qa.base.*;

public class UserWelcomePage extends TestBase {

	//btnOrderHistoryAndDetails = "//div[@id='center_column']/div/div[1]/ul[@class='myaccount-link-list']//a[@title='Orders']/span[.='Order history and details']"
	
	@FindBy(xpath="//div[@id='center_column']/div/div[1]/ul[@class='myaccount-link-list']//a[@title='Orders']/span[.='Order history and details']")
	WebElement btnOrderHistoryAndDetails;
	
	public UserWelcomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyOrderHistoryDetailsButtonExists(){
		String message;
		if(!driver.findElements(By.xpath("//div[@id='center_column']/div/div[1]/ul[@class='myaccount-link-list']//a[@title='Orders']/span[.='Order history and details']")).isEmpty()){
	        message = "Order history details button exist";
			return message;
	    }else{
	    	message = "Order history details button doesn't exist";
			return message;
	    }
	}
	
}

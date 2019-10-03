package com.prestaonlineshop.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.prestaonlineshop.qa.base.*;

public class SignUpPage extends TestBase{
	
	// rdbtnTitle = /html//form[@id='account-creation_form']/div[1]/div[1]/div[1]/label[@class='top']/div//input[@name='id_gender']
	// txtbxFirstName = /html//input[@id='customer_firstname']
	// txtbxLastName = /html//input[@id='customer_lastname']
	// txtbxPassword = /html//input[@id='passwd']
	// drpdwnDOB_dd = /html//select[@id='days']
	// drpdwnDOB_mm = /html//select[@id='months']
	// drpdwnDOB_yy = /html//select[@id='years']
	// chkbxNewsLetter = /html//input[@id='newsletter']
	
	// txtbxAddFirstName = /html//input[@id='firstname']
	// txtbxAddLastName = /html//input[@id='lastname']
	// txtbxCompany = /html//input[@id='company']
	// txtbxAddress = /html//form[@id='account-creation_form']//input[@name='address1']
	// txtbxCity = /html//input[@id='city']
	// drpdwnState = /html//select[@id='id_state']
	// txtbxPostCode = /html//input[@id='postcode']
	// drpdwnCountry = /html//select[@id='id_country']
	// txtbxOther = /html//textarea[@id='other']
	// txtbxHomePhone = /html//input[@id='phone']
	// txtbxMobilePhone = /html//input[@id='phone_mobile']
	// txtbxMyAddress = /html//input[@id='alias']
	// btnRegister = //button[@id='submitAccount']/span
	
	
	@FindBy(xpath="/html//form[@id='account-creation_form']/div[1]/div[1]/div[1]/label[@class='top']/div//input[@name='id_gender']")
	WebElement rdbtnTitle;
	
	@FindBy(xpath="/html//input[@id='customer_firstname']")
	WebElement txtbxFirstName;
	
	@FindBy(xpath="/html//input[@id='customer_lastname']")
	WebElement txtbxLastName;
	
	@FindBy(xpath="/html//input[@id='passwd']")
	WebElement txtbxPassword;
	
	@FindBy(xpath="/html//select[@id='days']")
	WebElement drpdwnDOB_dd;
		
	@FindBy(xpath="/html//select[@id='months']")
	WebElement drpdwnDOB_mm;
	
	@FindBy(xpath="/html//select[@id='years']")
	WebElement drpdwnDOB_yy;
	
	@FindBy(xpath="/html//input[@id='newsletter']")
	WebElement chkbxNewsLetter;
	
	@FindBy(xpath="/html//input[@id='firstname']")
	WebElement txtbxAddFirstName;
	
	@FindBy(xpath="/html//input[@id='lastname']")
	WebElement txtbxAddLastName;
	
	@FindBy(xpath="/html//input[@id='company']")
	WebElement txtbxCompany;
	
	@FindBy(xpath="/html//form[@id='account-creation_form']//input[@name='address1']")
	WebElement txtbxAddress;
	
	@FindBy(xpath="/html//input[@id='city']")
	WebElement txtbxCity;
	
	@FindBy(xpath="/html//select[@id='id_state']")
	WebElement drpdwnState;
	
	@FindBy(xpath="/html//input[@id='postcode']")
	WebElement txtbxPostCode;
	
	@FindBy(xpath="/html//select[@id='id_country']")
	WebElement drpdwnCountry;
	
	@FindBy(xpath="/html//textarea[@id='other']")
	WebElement txtbxOther;
	
	@FindBy(xpath="/html//input[@id='phone']")
	WebElement txtbxHomePhone;
	
	@FindBy(xpath="/html//input[@id='phone_mobile']")
	WebElement txtbxMobilePhone;
	
	@FindBy(xpath="/html//input[@id='alias']")
	WebElement txtbxMyAddress;
	
	@FindBy(xpath="//button[@id='submitAccount']/span")
	WebElement btnRegister;
	
	public SignUpPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateSignUpPageTitle(){
		return driver.getTitle();
	}
	
	
// Your Personal Information section
			
			public void selectTitle(){
				rdbtnTitle.click();
			}
			
			public void enterFirstName(String fName){
				txtbxFirstName.sendKeys(fName);	
			}
			
			public void enterLastName(String lName){
				txtbxLastName.sendKeys(lName);	
			}
			
			public void enterPassword(String pwd){
				txtbxPassword.sendKeys(pwd);	
			}
			
			public void clickDOBdd(){
				drpdwnDOB_dd.click();
			}
						
			public void selectDOBdd(String dobDD){
				Select dropDD = new Select(drpdwnDOB_dd);
				dropDD.selectByVisibleText(dobDD);
			}	
			
			public void clickDOBmm(){
				drpdwnDOB_mm.click();
			}
						
			public void selectDOBmm(String dobmm){
				Select dropMM = new Select(drpdwnDOB_mm);
				dropMM.selectByVisibleText(dobmm);
			}
			
			public void clickDOByy(){
				drpdwnDOB_yy.click();
			}
						
			public void selectDOByy(String dobyy){
				Select dropYY = new Select(drpdwnDOB_yy);
				dropYY.selectByVisibleText(dobyy);
			}
			
			public void selectSignUpLetter(){
				chkbxNewsLetter.click();
			}
			 
			
	// Your Address section	
			
			public void enterAddFirstName(String addfName){
				txtbxAddFirstName.sendKeys(addfName);	
			}
			
			public void enterAddLastName(String addLName){
				txtbxAddLastName.sendKeys(addLName);	
			}
	
			public void enterCompany(String addComp){
				txtbxCompany.sendKeys(addComp);	
			}
			
			public void enterAddress(String addAddr){
				txtbxAddress.sendKeys(addAddr);	
			}
			
			public void enterCity(String addCity){
				txtbxCity.sendKeys(addCity);	
			}
			
			public void clickDrpState(){
				drpdwnState.click();
			}
						
			public void selectDrpState(String cityName){
				Select dropCity = new Select(drpdwnState);
				dropCity.selectByVisibleText(cityName);
			}
			
			public void enterZipCode(String zipcode){
				txtbxPostCode.sendKeys(zipcode);	
			} 
			
			public void clickDrpCountry(){
				drpdwnCountry.click();
			}
						
			public void selectDrpCountry(String countryName){
				Select dropCountry = new Select(drpdwnCountry);
				dropCountry.selectByVisibleText(countryName);
			}
						
			public void enterAddInfo(String addInfo){
				txtbxOther.sendKeys(addInfo);	
			} 
			
			public void enterHomePhone(String homePhone){
				txtbxHomePhone.sendKeys(homePhone);	
			} 
			
			public void enterMobilePhone(String mobilePhone){
				txtbxMobilePhone.sendKeys(mobilePhone);	
			} 
			
			public void enterMyAddress(String address){
				txtbxMyAddress.sendKeys(address);	
			}
			
// Register button
			
		public RegisteredPage createAnAccount(){
			btnRegister.click(); 
			return new RegisteredPage();
		}
	

}

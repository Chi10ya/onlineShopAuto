package com.prestaonlineshop.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.prestaonlineshop.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	static String filesPath=System.getProperty("user.dir");
	
		public TestBase(){
			
						
			try{
				prop = new Properties();
				FileInputStream ips = new FileInputStream(filesPath + "/src/main/java/com/prestaonlineshop/qa/config/config.properties"); 
				prop.load(ips);		
			} catch (FileNotFoundException e){
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

		public static void initialization(){
			String browserName = prop.getProperty("browser");
			
			if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", filesPath + "\\BrowserDrivers\\chromedriver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equals("FireFox")){
				System.setProperty("webdriver.chrome.driver", filesPath + "\\BrowserDrivers\\geckodriver\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,  TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,  TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
			
		}
		
}

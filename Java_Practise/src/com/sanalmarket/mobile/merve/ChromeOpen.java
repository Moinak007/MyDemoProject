package com.sanalmarket.mobile.merve;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeOpen {
	
	public static String baseurl="https://www.facebook.com";
	public static RemoteWebDriver driver;
	//public static AndroidDriver driver;
	public static String device="Android";
	public static String deviceName="5203fd9cf44db469";
	public static String platformVersion="7.0";
	public static String platformName="Android";
	
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		DesiredCapabilities capabilites = new DesiredCapabilities();
		capabilites.setCapability("device", device);
		capabilites.setCapability("deviceName", deviceName);
		capabilites.setCapability("platformVersion", platformVersion);
		capabilites.setCapability("platformName", platformName);
		//capabilites.setCapability("browserName", "browser");
		capabilites.setCapability("browserName", "Chrome");
		
	
		
		
	
		capabilites.setCapability("appPackage", "com.sec.android.app.popupcalculator");

		 
		capabilites.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

		  
		  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilites);
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		  
		  driver.get(baseurl);
		  Thread.sleep(5000);
		  
		  //WebElement b=driver.findElement(By.id("m_login_email"));	  
		  Thread.sleep(2000);
		  WebElement emailET= driver.findElement(By.id("m_login_email"));
		  emailET.sendKeys("ABCD");
		  
		  
		  //driver.quit();
	    }
	    
	    public static boolean isAlertPresent(RemoteWebDriver wd) {
	        try {
	        	wd.switchTo().alert();
	            return true;
	        } catch (NoAlertPresentException e) {
	            return false;
	        }
	    }
}

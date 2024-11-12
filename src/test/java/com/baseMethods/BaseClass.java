package com.baseMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseClass 
{
	public static WebDriver driver;
	
	
	public void initApplication(String URL)
	{
		driver.get(URL);
	}  
	public void driverSetup(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			driver = DriverManager.getChromeDriver();	
		}
		else if(browserName.equals("FireFox"))
		{
			driver = DriverManager.getFirefoxDriver();
		}
		
		else 
		{
			driver = DriverManager.getedgedriver();
		}
		
	}
	
	public void clickTheElement(By Locator)
	{
		 try 
		 {
			 WebElement element = driver.findElement(Locator);
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			 wait.until(ExpectedConditions.visibilityOf(element)).click();
			
		} catch (NoSuchElementException e)
		 {
			System.out.println("Error while sending keys: " + e.getMessage());
	        
			e.printStackTrace();
		}
	}
	public void navigateBack()
	{
		driver.navigate().back();
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	public void sendKeys(By Locator , String Input)
	{
		try {
		

			 WebElement element = driver.findElement(Locator);
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			 wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(Input);
	} catch (Exception e) {
		System.out.println("Error while sending keys: " + e.getMessage());
        e.printStackTrace();
	}
		
	}
	
	public void isDisplayed(By Locator)
	{
		try {
			WebElement element = driver.findElement(Locator);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
			
		
			
		} catch (Exception e) {
			System.out.println("Error while sending keys: " + e.getMessage());
	        e.printStackTrace();
		}
	}
	
	 public WebDriver getDriver() {
	        return driver;
	    }
	
	 
	 @AfterTest
	 public void tearDown() {
	     DriverManager.quitDriver(); // Ensures proper WebDriver cleanup for each test thread
	 }
	
}
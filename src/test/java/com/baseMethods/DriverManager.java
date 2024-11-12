package com.baseMethods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverManager {
   
	 private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	/**
	 * @return 
	 * @return WebDriver
	 * 
	 *         This method return ChromeDriver object
	 */
	 public static WebDriver getChromeDriver() {
	        driver.set(new ChromeDriver());
	        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        maximizeBrowser();
	        driver.get().manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
	        VerifyBrowserOS();
	        return driver.get();
	    }

	    public static WebDriver getFirefoxDriver() {
	        driver.set(new FirefoxDriver());
	        maximizeBrowser();
	        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get().manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
	        VerifyBrowserOS();
	        return driver.get();
	    }

	    public static WebDriver getedgedriver() {
	        driver.set(new EdgeDriver());
	        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get().manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
	        maximizeBrowser();
	        VerifyBrowserOS();
	        return driver.get();
	    }
	    
	    public static void maximizeBrowser() {
	        driver.get().manage().window().maximize();
	    }
	    
	    public static void VerifyBrowserOS() {
	        org.openqa.selenium.Capabilities caps = ((RemoteWebDriver) driver.get()).getCapabilities();
	        String browserName = caps.getBrowserName();
	        String browserVersion = caps.getBrowserVersion();
	        String os = System.getProperty("os.name").toLowerCase();
	        System.out.println("OS = " + os + ", Browser = " + browserName + " " + browserVersion);
	    }

	    public static WebDriver getDriver() {
	        return driver.get();
	    }

	    public static void quitDriver() {
	        if (driver.get() != null) {
	            driver.get().quit();
	            driver.remove();  // Ensures cleanup of the thread-local WebDriver
	        }
	    }}
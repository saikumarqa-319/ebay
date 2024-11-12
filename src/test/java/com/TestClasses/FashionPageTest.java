package com.TestClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseMethods.BaseClass;
import com.test.ApplicationLaunchTest;
import com.test.HomePageTest;



public class FashionPageTest  extends BaseClass
{
	
	ApplicationLaunchTest at = new ApplicationLaunchTest();
	HomePageTest hm = new HomePageTest();
	
	@BeforeTest
	@Parameters({"BrowserName"})
	public void driversetupe(String BrowserName)
	{
		driverSetup(BrowserName);
	}
	
	
	@Test
	public void launchapp()
	{
		at.launchApplication();
		hm.SelectFashionLink();
		
	}

}

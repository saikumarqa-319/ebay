package com.TestClasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseMethods.BaseClass;
import com.test.ApplicationLaunchTest;
import com.test.HomePageTest;
import com.test.SportspageTestableItems;

public class SportsPageTest extends BaseClass
{

	
	
	

	ApplicationLaunchTest at = new ApplicationLaunchTest();
	SportspageTestableItems sm = new SportspageTestableItems();
	
	
	@BeforeTest
	@Parameters({"BrowserName"})
	public void driversetup(String BrowserName)
	{
		driverSetup(BrowserName);
	}
	
	
	@Test
	public void launchapp()
	{
		
		at.launchApplication();
		sm.clickSportsLink();
		sm.selectcycling();
		
	}
}

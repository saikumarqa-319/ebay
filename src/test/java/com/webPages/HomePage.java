package com.webPages;

import org.openqa.selenium.By;

import com.baseMethods.BaseClass;

public class HomePage extends BaseClass
{
	
	private By sportsLink   = By.xpath("(.//*[text()='Sports'])[1]");
	private By FashionLink = By.xpath("(.//*[text()='Fashion'])[2]");
	
	
	public void selectSports()
	{
		clickTheElement(sportsLink);
	}
	public void selectFashion()
	{
		clickTheElement(FashionLink);
	}

}

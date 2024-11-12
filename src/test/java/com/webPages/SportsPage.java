package com.webPages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.baseMethods.BaseClass;

public class SportsPage  extends BaseClass
{
	
	private By cycling = By.xpath("//a[@class='textual-display brw-category-nav__link'][normalize-space()='Cycling']");
	private By golf   = By.xpath("//a[contains(text(),'Golf')]");
	
	
	public void selectGolf()
	{
		clickTheElement(golf);
		String title = getTitle();
		
		String expectedtitle = "YYUUJUJS";
		
		Assert.assertEquals(title, expectedtitle);
	}
	
	public void selectCycling()
	{
		clickTheElement(cycling);
		String title = getTitle();
		
		String expectedtitle = "YYUUJUJS";
		
		Assert.assertEquals(title, expectedtitle);
	}

}

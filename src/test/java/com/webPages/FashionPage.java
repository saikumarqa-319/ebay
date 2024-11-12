package com.webPages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.baseMethods.BaseClass;



public class FashionPage extends BaseClass
{
	
	
	private By calvinKelvin = By.xpath("//a[normalize-space()='Calvin Klein']");
	private By levis    = By.xpath("(//a[normalize-space()=\"Levi's\"])[1]");
	public void clickCalvinKelvin()
	{
	
		clickTheElement(calvinKelvin);
		String Text = getTitle();
		
		System.out.println(Text);

		String expectedTitle = "Calvin Klein products for sale | eBay";
		Assert.assertEquals(Text, expectedTitle);
		navigateBack();
		
		
	}
	
	public void clickLevis()
	{
		clickTheElement(levis);
		String Text = getTitle();
		System.out.println(Text);
		String expectedTitle = "Levi's products for sale | eBay";
		Assert.assertEquals(Text, expectedTitle);
		navigateBack();
	}
	
}

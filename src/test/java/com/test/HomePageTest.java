package com.test;

import org.testng.annotations.Test;

import com.baseMethods.BaseClass;
import com.webPages.FashionPage;
import com.webPages.HomePage;

public class HomePageTest  extends BaseClass
{
	HomePage hmp = new HomePage();
	FashionPage fp = new FashionPage();
	
	
	public void SelectFashionLink()
	{
		hmp.selectFashion();
		fp.clickCalvinKelvin();
		fp.clickLevis();
	}
	
	
	
	
	
}

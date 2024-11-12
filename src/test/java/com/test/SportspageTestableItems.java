package com.test;

import com.webPages.HomePage;
import com.webPages.SportsPage;

public class SportspageTestableItems 
{
	HomePage hm = new HomePage();
	SportsPage sp = new SportsPage();
	
	
	
	public void clickSportsLink()
	{
		hm.selectSports();
	}
	
	public void selectcycling()
	{
		sp.selectCycling();
		sp.selectGolf();
	}

}

package com.test;

import com.baseMethods.BaseClass;

import resources.PropertyFile;



public class ApplicationLaunchTest extends BaseClass
{
	
	
	
	public void launchApplication()
	{
	 initApplication(PropertyFile.getproperty("URL"));
	}
	
	
	

}

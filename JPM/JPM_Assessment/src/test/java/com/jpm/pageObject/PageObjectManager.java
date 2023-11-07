package com.jpm.pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	WebDriver driver;
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	HomePage hp;
	Google_Page gp;
	
	public HomePage getHomePageObject()
	{
	hp= new HomePage(driver);
	return hp;
	}
	
	public Google_Page getGooglePageObject()
	{
	gp= new Google_Page(driver);
	return gp;
	}
	
	
}

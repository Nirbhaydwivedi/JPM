package com.jpm.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage{
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public static String article="";
	@FindBy(xpath = "//button[@title='Yes, I’m happy']")
	private WebElement acceptbtn;
	@FindBy (xpath = "//a[@data-link-name='article']/span/span")
	private WebElement newsArticle;

	
	
	public void clickAcceptbtn()
	{
		driver.switchTo().frame("sp_message_iframe_882219");
		acceptbtn.click();
	}
public void getNewsText()
{
	  article= newsArticle.getText();
}

public String validateLandingPage()
{
	return driver.getTitle();
}
	
public void closebrowser()
{
	driver.close();
}
}

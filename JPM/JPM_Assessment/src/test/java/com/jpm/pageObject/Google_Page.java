package com.jpm.pageObject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_Page {

	WebDriver driver;
	public Google_Page(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	@FindBy (xpath = "//div[@data-attrid='wa:/description' and @role='heading']")
	private WebElement searchResultPageHeader;
	@FindBy(id="APjFqb")
	private WebElement googleSearch;
	@FindBy(xpath = "//DIV[@class='FPdoLc lJ9FBc']/center/input[@value='Google Search']")
	private WebElement searchBtn;
	@FindBy(xpath="//div[@class='MjjYud']")
	private List<WebElement> resultPage;
	JavascriptExecutor js;
	
	
	public void searchonGoogle()
	{
		driver.navigate().to("https://www.google.com/");
		System.out.println("Article for google is: "+HomePage.article);
		googleSearch.click();
		googleSearch.sendKeys(HomePage.article);
		 js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", searchBtn);
	}
public void validateTheContent()
{
	int eleSize=resultPage.size();
	if(eleSize>=2)
	{
		System.out.println(" We have "+eleSize+", links for this news on Google. This news is valid");
		
	}
	else
	{
		System.out.println(" We do not have "+eleSize+", links for this news on Google. This news is not valid");
	}
}
	
}

package com.jpm.stepDefination;


import com.jpm.utils.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefination {
	TestContext tc;
	public HomePageStepDefination(TestContext tc)
	{
		this.tc=tc;
	}
	
	@Given("User is on Landing Page")
	public void user_is_on_landing_page() throws Throwable {
	   String title=tc.pom.getHomePageObject().validateLandingPage();
	   System.out.println(title);
	}
	@When("Get the news article")
	public void get_the_news_article() {
	    tc.pom.getHomePageObject().clickAcceptbtn();
	    tc.pom.getHomePageObject().getNewsText();
	}
	@Then("search that news article on Google")
	public void search_that_news_article_on_google() {
		tc.pom.getGooglePageObject().searchonGoogle();
	}
	@Then("Validate the news")
	public void validate_the_news() {
	    tc.pom.getGooglePageObject().validateTheContent();
	}
	@Then("Close the browser")
	public void close_the_browser() {
	   tc.pom.getHomePageObject().closebrowser();
	}
}

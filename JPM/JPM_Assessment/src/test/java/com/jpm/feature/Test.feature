Feature: News Validation

Scenario: Search the news Article on Google
Given User is on Landing Page
When Get the news article
Then search that news article on Google
And Close the browser

Scenario: Validate the news status on Google
Given User is on Landing Page
When Get the news article
Then search that news article on Google
And Validate the news 
And Close the browser
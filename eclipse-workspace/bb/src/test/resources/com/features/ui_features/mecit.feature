Feature: UI test

Scenario: HOMEPAGE FUNCTIONALITY

Given User goes to homepage
When he enter valid credentials
Then clicks login
And welcome user should be seen
Feature: Amazon Page Functionalities


@smoke
Scenario: Search Functionality

Given User is on homepage
When User types "Wooden Spoons" in search box
And Clicks search button
Then User should see "wooden spoons" in new page title
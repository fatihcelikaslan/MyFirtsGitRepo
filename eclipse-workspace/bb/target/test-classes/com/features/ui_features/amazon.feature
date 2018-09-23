Feature: Amazon practice

@amazon
Scenario: Searching an item on Amazon homepage

Given User is Amazon homepage
When clicks on search button 
And types "Wooden spoon"
Then he should see the search results
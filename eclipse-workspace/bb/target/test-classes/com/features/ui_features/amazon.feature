Feature: Amazon practice

@temp
Scenario: Searching an item on Amazon homepage

Given User is Amazon homepage
When clicks on search button 
And types "Wooden spoon"
Then he should see the search results

@abc
Scenario: aSearching an item on Amazon homepage

Given wwUser is Amazon homepage
When ssclicks on search button 
And sstypes "Wooden spoon"
Then sshe should see the search results
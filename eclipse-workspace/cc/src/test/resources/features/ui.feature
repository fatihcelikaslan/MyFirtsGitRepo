Feature: Amazon Tests

@ui @smoke
Scenario: Search functionality
Given user is on homepage
Given User enters "wooden spoons" in searchbox
Then User should see search results in results page



@db @smoke
Scenario: Writing some queries and getting results

Given User enters query "select * from AGENT1"
Then The result should be "select salary from employees where first_name like 'A%'"










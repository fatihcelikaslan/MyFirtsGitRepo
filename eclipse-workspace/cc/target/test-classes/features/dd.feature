Feature: Data Driven Testing

Scenario Outline: Username and Password examples

Given User is on homepage
When enters <username> and <password>
Then Welcome page should be visible

Examples:
	|	username	|	password	|
	

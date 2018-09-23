Feature: Database testing

@db
Scenario: Testing with simple query
Given I go to db
When Sending query "select first_name from employees where department_id = 90"
Then Sending another query "Select * from jobs"
And Get column data "Select * from departments"




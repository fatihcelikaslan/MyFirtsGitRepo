Feature: Some examples

@cb
Scenario: Checkboxes example on practice web page
Given User navigates to heroku homepage
And clicks to Checkboxes
Then check the first box
And uncheck the second box

@dl
Scenario: Download example on practice web page
Given User navigates to heroku homepage
And clicks to File Download
Then Clicks Selena.txt to download

@drag
Scenario: 
Drag and drop example on practice web page
Given User navigates to heroku homepage
And clicks to Drag and Drop link
Then Moves A onto B


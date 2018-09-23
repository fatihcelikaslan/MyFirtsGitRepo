$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/features/ui_features/amazon.feature");
formatter.feature({
  "name": "Amazon practice",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Searching an item on Amazon homepage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@amazon"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User is Amazon homepage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clicks on search button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "types \"Wooden spoon\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "he should see the search results",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.uri("src/test/resources/com/features/ui_features/herokutests.feature");
formatter.feature({
  "name": "Some examples",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Checkboxes example on practice web page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@cb"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User navigates to heroku homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CheckBoxStepDefs.user_navigates_to_heroku_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicks to Checkboxes",
  "keyword": "And "
});
formatter.match({
  "location": "CheckBoxStepDefs.clicks_to_Checkboxes()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "check the first box",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckBoxStepDefs.check_the_first_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "uncheck the second box",
  "keyword": "And "
});
formatter.match({
  "location": "CheckBoxStepDefs.uncheck_the_second_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Download example on practice web page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dl"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User navigates to heroku homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CheckBoxStepDefs.user_navigates_to_heroku_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicks to File Download",
  "keyword": "And "
});
formatter.match({
  "location": "CheckBoxStepDefs.clicks_to_File_Download()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Clicks Selena.txt to download",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckBoxStepDefs.clicks_Selena_txt_to_download()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "",
  "description": "Drag and drop example on practice web page",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@drag"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User navigates to heroku homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CheckBoxStepDefs.user_navigates_to_heroku_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicks to Drag and Drop link",
  "keyword": "And "
});
formatter.match({
  "location": "CheckBoxStepDefs.clicks_to_Drag_and_Drop_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Moves A onto B",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckBoxStepDefs.moves_A_onto_B()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.uri("src/test/resources/com/features/ui_features/mecit.feature");
formatter.feature({
  "name": "UI test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "HOMEPAGE FUNCTIONALITY",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User goes to homepage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "he enter valid credentials",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clicks login",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "welcome user should be seen",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});
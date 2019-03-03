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
      "name": "@temp"
    }
  ]
});
formatter.before({
  "status": "passed"
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
  "status": "passed"
});
formatter.uri("src/test/resources/com/features/ui_features/herokutests.feature");
formatter.feature({
  "name": "Some examples",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Download example on practice web page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dl"
    },
    {
      "name": "@temp"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to heroku homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CheckBoxStepDefs.user_navigates_to_heroku_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks to File Download",
  "keyword": "And "
});
formatter.match({
  "location": "CheckBoxStepDefs.clicks_to_File_Download()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks Selena.txt to download",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckBoxStepDefs.clicks_Selena_txt_to_download()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
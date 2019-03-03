$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ui.feature");
formatter.feature({
  "name": "Amazon Tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ui"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters \"wooden spoons\" in searchbox",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefs.user_enters_in_searchbox(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see search results in results page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefs.user_should_see_search_results_in_results_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("fe.feature");
formatter.feature({
  "line": 2,
  "name": "Training feature",
  "description": "\nSome scenarios to understand better how protractor and cucumber work",
  "id": "training-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@training"
    }
  ]
});
formatter.before({
  "duration": 6163538600,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Test angular features button",
  "description": "",
  "id": "training-feature;test-angular-features-button",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I navigate to angular website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click the FEATURES button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the text FEATURES \u0026 BENEFITS is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iNavigateToAngularWebsite()"
});
formatter.result({
  "duration": 125061600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickTheFEATURESButton()"
});
formatter.result({
  "duration": 191234900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.theTextFEATURESBENEFITSIsDisplayed()"
});
formatter.result({
  "duration": 326882300,
  "status": "passed"
});
formatter.after({
  "duration": 765260300,
  "status": "passed"
});
formatter.before({
  "duration": 2732560000,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Test angular features button 2",
  "description": "",
  "id": "training-feature;test-angular-features-button-2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I navigate to angular website",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I click the FEATURES button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "the text FEATURES \u0026 BENEFITS is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iNavigateToAngularWebsite()"
});
formatter.result({
  "duration": 19700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickTheFEATURESButton()"
});
formatter.result({
  "duration": 128966500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.theTextFEATURESBENEFITSIsDisplayed()"
});
formatter.result({
  "duration": 434129600,
  "status": "passed"
});
formatter.after({
  "duration": 762304000,
  "status": "passed"
});
});
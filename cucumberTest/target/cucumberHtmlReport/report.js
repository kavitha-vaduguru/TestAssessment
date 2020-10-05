$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/GoogleSearchTest.feature");
formatter.feature({
  "line": 2,
  "name": "Google Search example of how to test web pages with cucumber",
  "description": "",
  "id": "google-search-example-of-how-to-test-web-pages-with-cucumber",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@sanity"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "finding logo on JP Morgan homepage",
  "description": "",
  "id": "google-search-example-of-how-to-test-web-pages-with-cucumber;finding-logo-on-jp-morgan-homepage",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@verifyWebPageLogo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigated to the google search webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I am on the Google search homepage using \"\u003cwebsite\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I have entered the text into google search bar \"\u003ckeyword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the result should display in a new page with searchresults",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify JP Mogan logo is dispalyed on search result page",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "google-search-example-of-how-to-test-web-pages-with-cucumber;finding-logo-on-jp-morgan-homepage;",
  "rows": [
    {
      "cells": [
        "website",
        "keyword"
      ],
      "line": 13,
      "id": "google-search-example-of-how-to-test-web-pages-with-cucumber;finding-logo-on-jp-morgan-homepage;;1"
    },
    {
      "cells": [
        "Google",
        "J.P. Morgan"
      ],
      "line": 14,
      "id": "google-search-example-of-how-to-test-web-pages-with-cucumber;finding-logo-on-jp-morgan-homepage;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "finding logo on JP Morgan homepage",
  "description": "",
  "id": "google-search-example-of-how-to-test-web-pages-with-cucumber;finding-logo-on-jp-morgan-homepage;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 4,
      "name": "@verifyWebPageLogo"
    },
    {
      "line": 1,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigated to the google search webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I am on the Google search homepage using \"Google\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I have entered the text into google search bar \"J.P. Morgan\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the result should display in a new page with searchresults",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify JP Mogan logo is dispalyed on search result page",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchTestStepDef.launchURL()"
});
formatter.result({
  "duration": 9857476100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Google",
      "offset": 42
    }
  ],
  "location": "GoogleSearchTestStepDef.I_am_on_the_Google_search_homepage_using(String)"
});
formatter.result({
  "duration": 68580400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "J.P. Morgan",
      "offset": 48
    }
  ],
  "location": "GoogleSearchTestStepDef.i_have_entered_the_text_into_google_search_bar(String)"
});
formatter.result({
  "duration": 2419844000,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchTestStepDef.the_result_should_in_a_new_page_with_searchresults()"
});
formatter.result({
  "duration": 9998361800,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchTestStepDef.i_verify_JP_Mogan_logo_is_dispalyed_on_search_result_page()"
});
formatter.result({
  "duration": 112613200,
  "status": "passed"
});
});
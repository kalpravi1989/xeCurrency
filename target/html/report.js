$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("xeCurrency_pro/features.feature");
formatter.feature({
  "line": 2,
  "name": "Check XE currency app",
  "description": "",
  "id": "check-xe-currency-app",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "get euro to canadian dollar conversion rate and comapre",
  "description": "",
  "id": "check-xe-currency-app;get-euro-to-canadian-dollar-conversion-rate-and-comapre",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "open the webpage and check title",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "The title should contain \"Xe Currency Converter - Live Exchange Rates Today\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "set \u003cFrom\u003e value   and \u003cTo\u003e value in convert page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click convert button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "get convertion value",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Go to chart page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "set \u003cFrom\u003e value   and \u003cTo\u003e value in chart page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click view chart button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "get conversion value from chart page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "compare conversion value from convert and chart pages",
  "keyword": "And "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "check-xe-currency-app;get-euro-to-canadian-dollar-conversion-rate-and-comapre;",
  "rows": [
    {
      "cells": [
        "From",
        "To"
      ],
      "line": 18,
      "id": "check-xe-currency-app;get-euro-to-canadian-dollar-conversion-rate-and-comapre;;1"
    },
    {
      "cells": [
        "\"EUR\"",
        "\"CAD\""
      ],
      "line": 19,
      "id": "check-xe-currency-app;get-euro-to-canadian-dollar-conversion-rate-and-comapre;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5026331561,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "get euro to canadian dollar conversion rate and comapre",
  "description": "",
  "id": "check-xe-currency-app;get-euro-to-canadian-dollar-conversion-rate-and-comapre;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "open the webpage and check title",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "The title should contain \"Xe Currency Converter - Live Exchange Rates Today\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "set \"EUR\" value   and \"CAD\" value in convert page",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click convert button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "get convertion value",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Go to chart page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "set \"EUR\" value   and \"CAD\" value in chart page",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click view chart button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "get conversion value from chart page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "compare conversion value from convert and chart pages",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.open_the_webpage_and_check_title()"
});
formatter.result({
  "duration": 114027778,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Xe Currency Converter - Live Exchange Rates Today",
      "offset": 26
    }
  ],
  "location": "Stepdefinition.the_title_should_contain(String)"
});
formatter.result({
  "duration": 2631219,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EUR",
      "offset": 5
    },
    {
      "val": "CAD",
      "offset": 23
    }
  ],
  "location": "Stepdefinition.set_value_and_value_in_convert_page(String,String)"
});
formatter.result({
  "duration": 5792574982,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.click_convert_button()"
});
formatter.result({
  "duration": 276147342,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.get_convertion_value()"
});
formatter.result({
  "duration": 5433037586,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.go_to_chart_page()"
});
formatter.result({
  "duration": 49240589,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EUR",
      "offset": 5
    },
    {
      "val": "CAD",
      "offset": 23
    }
  ],
  "location": "Stepdefinition.set_value_and_value_in_chart_page(String,String)"
});
formatter.result({
  "duration": 5500958009,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.click_view_chart_button()"
});
formatter.result({
  "duration": 428510325,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.get_conversion_value_from_chart_page()"
});
formatter.result({
  "duration": 2025481867,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.compare_conversion_value_from_convert_and_chart_pages()"
});
formatter.result({
  "duration": 357582,
  "status": "passed"
});
formatter.after({
  "duration": 182981747,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/projecttelecom.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@count"
    }
  ]
});
formatter.scenarioOutline({
  "name": "value passed using example",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@secondsce"
    }
  ]
});
formatter.step({
  "name": "launch and verify url",
  "keyword": "Given "
});
formatter.step({
  "name": "click add customer link",
  "keyword": "And "
});
formatter.step({
  "name": "pass value for firstname and lastname \"\u003cfname\u003e\" \"\u003clname\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fname",
        "lname"
      ]
    },
    {
      "cells": [
        "ezhil@gmail.com",
        "explode"
      ]
    }
  ]
});
formatter.scenario({
  "name": "value passed using example",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@count"
    },
    {
      "name": "@secondsce"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch and verify url",
  "keyword": "Given "
});
formatter.match({
  "location": "Addcustomer.launch_and_verify_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click add customer link",
  "keyword": "And "
});
formatter.match({
  "location": "Addcustomer.click_add_customer_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass value for firstname and lastname \"ezhil@gmail.com\" \"explode\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Addcustomer.pass_value_for_firstname_and_lastname(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "",
  "description": "",
  "id": "login-functionality;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "user open url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user enter email as \"\u003cemail\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user click on Log out link",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "login-functionality;;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 27,
      "id": "login-functionality;;;1"
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ],
      "line": 28,
      "id": "login-functionality;;;2"
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ],
      "line": 29,
      "id": "login-functionality;;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 15120032946,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "",
  "description": "",
  "id": "login-functionality;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "user open url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user enter email as \"admin@yourstore.com\" and password as \"admin\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user click on Log out link",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "duration": 2349147471,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 15
    }
  ],
  "location": "Steps.user_open_url(String)"
});
formatter.result({
  "duration": 3952803401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 21
    },
    {
      "val": "admin",
      "offset": 59
    }
  ],
  "location": "Steps.user_enter_email_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 1130026198,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_login_button()"
});
formatter.result({
  "duration": 18438395989,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 22
    }
  ],
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "duration": 283822612,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_Log_out_link()"
});
formatter.result({
  "duration": 14499558404,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "duration": 3196835188,
  "status": "passed"
});
formatter.before({
  "duration": 2094671857,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "",
  "description": "",
  "id": "login-functionality;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "user open url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user enter email as \"admin@yourstore.com\" and password as \"admin\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user click on Log out link",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "duration": 604532,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 15
    }
  ],
  "location": "Steps.user_open_url(String)"
});
formatter.result({
  "duration": 4743494225,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 21
    },
    {
      "val": "admin",
      "offset": 59
    }
  ],
  "location": "Steps.user_enter_email_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 1288910328,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_login_button()"
});
formatter.result({
  "duration": 17559180238,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 22
    }
  ],
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "duration": 110496943,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_Log_out_link()"
});
formatter.result({
  "duration": 14766140054,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "duration": 3202496645,
  "status": "passed"
});
});
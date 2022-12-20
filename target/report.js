$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature%20File/Facebook.feature");
formatter.feature({
  "name": "To Validate The Basic Functionality Of The Facebook Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature1"
    }
  ]
});
formatter.scenario({
  "name": "To Validate Login With Invalid Username and valid Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User has to Launch The Browser and Hit the Facebook Url Page",
  "keyword": "Given "
});
formatter.match({
  "location": "FBdefinition.user_has_to_Launch_The_Browser_and_Hit_the_Facebook_Url_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to Enter the Invalid Username in Email text Field",
  "rows": [
    {
      "cells": [
        "keerthi123@gmail.com",
        "java123@gmail.com",
        "selenium123@gmail.com",
        "manual123@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FBdefinition.user_has_to_Enter_the_Invalid_Username_in_Email_text_Field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to Enter the Valid Password in Password Text field",
  "rows": [
    {
      "cells": [
        "keerthi123",
        "java123",
        "selenium123",
        "cucumber123"
      ]
    },
    {
      "cells": [
        "framework",
        "testNG",
        "Junit",
        "pom"
      ]
    },
    {
      "cells": [
        "dataprovider",
        "parameters",
        "parallel",
        "execution"
      ]
    },
    {
      "cells": [
        "grouping",
        "rerun",
        "crossbrowser",
        "testing"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FBdefinition.user_has_to_Enter_the_Valid_Password_in_Password_Text_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to Click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "FBdefinition.user_has_to_Click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to navigate to home page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User has to  close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FBdefinition.user_has_to_close_the_Browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": ":  To validate login with valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "To launch the chrome browser and hit the url",
  "keyword": "Given "
});
formatter.step({
  "name": "To pass the valid username in the\"\u003cEmailID\u003e\" username text field",
  "keyword": "When "
});
formatter.step({
  "name": "To pass the Invalid password in the \"\u003cPassword\u003e\" password text field",
  "keyword": "And "
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "to close the chrome browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "EmailID",
        "Password"
      ]
    },
    {
      "cells": [
        "keerthi123@gmail.com",
        "keerthijava"
      ]
    },
    {
      "cells": [
        "madhan123@gmail.com",
        "madhaqnselenium"
      ]
    },
    {
      "cells": [
        "fahadh123@gmail.com",
        "fahadhcucumber"
      ]
    }
  ]
});
formatter.scenario({
  "name": ":  To validate login with valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "To launch the chrome browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenariosDefnition.to_launch_the_chrome_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid username in the\"keerthi123@gmail.com\" username text field",
  "keyword": "When "
});
formatter.match({
  "location": "ScenariosDefnition.to_pass_the_valid_username_in_the_username_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the Invalid password in the \"keerthijava\" password text field",
  "keyword": "And "
});
formatter.match({
  "location": "ScenariosDefnition.to_pass_the_Invalid_password_in_the_password_text_field(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.ScenariosDefnition.to_pass_the_Invalid_password_in_the_password_text_field(ScenariosDefnition.java:30)\r\n\tat ✽.To pass the Invalid password in the \"keerthijava\" password text field(file:src/test/resources/Feature%20File/Facebook.feature:20)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "ScenariosDefnition.to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "to close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenariosDefnition.to_close_the_chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": ":  To validate login with valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "To launch the chrome browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenariosDefnition.to_launch_the_chrome_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid username in the\"madhan123@gmail.com\" username text field",
  "keyword": "When "
});
formatter.match({
  "location": "ScenariosDefnition.to_pass_the_valid_username_in_the_username_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the Invalid password in the \"madhaqnselenium\" password text field",
  "keyword": "And "
});
formatter.match({
  "location": "ScenariosDefnition.to_pass_the_Invalid_password_in_the_password_text_field(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.ScenariosDefnition.to_pass_the_Invalid_password_in_the_password_text_field(ScenariosDefnition.java:30)\r\n\tat ✽.To pass the Invalid password in the \"madhaqnselenium\" password text field(file:src/test/resources/Feature%20File/Facebook.feature:20)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "ScenariosDefnition.to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "to close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenariosDefnition.to_close_the_chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": ":  To validate login with valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "To launch the chrome browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenariosDefnition.to_launch_the_chrome_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid username in the\"fahadh123@gmail.com\" username text field",
  "keyword": "When "
});
formatter.match({
  "location": "ScenariosDefnition.to_pass_the_valid_username_in_the_username_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the Invalid password in the \"fahadhcucumber\" password text field",
  "keyword": "And "
});
formatter.match({
  "location": "ScenariosDefnition.to_pass_the_Invalid_password_in_the_password_text_field(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.ScenariosDefnition.to_pass_the_Invalid_password_in_the_password_text_field(ScenariosDefnition.java:30)\r\n\tat ✽.To pass the Invalid password in the \"fahadhcucumber\" password text field(file:src/test/resources/Feature%20File/Facebook.feature:20)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "ScenariosDefnition.to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "to close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenariosDefnition.to_close_the_chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/resources/Feature%20File/amazon.feature");
formatter.feature({
  "name": "To validate the Login functionality of the Amazon Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature2"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User To  Launch browser and hit url of the application",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonDefinition.user_To_Launch_browser_and_hit_url_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To pass login with Valid username and Valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature2"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "To pass the valid username in the corresponding field",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonDefinition.toPassTheValidUsernameInTheCorrespondingField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the ctnue button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonDefinition.toClickTheCtnueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid password in the corresponding field",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonDefinition.toPassTheValidPasswordInTheCorrespondingField()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.AmazonDefinition.toPassTheValidPasswordInTheCorrespondingField(AmazonDefinition.java:37)\r\n\tat ✽.To pass the valid password in the corresponding field(file:src/test/resources/Feature%20File/amazon.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To click the Signin button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonDefinition.toClickTheSigninButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonDefinition.toCloseTheBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User To  Launch browser and hit url of the application",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonDefinition.user_To_Launch_browser_and_hit_url_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To pass login with Blank username and Blank password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature2"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "To pass the balnk username in the corresponding field",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonDefinition.toPassTheBalnkUsernameInTheCorrespondingField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonDefinition.toClickTheContinueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the blank password in the corresponding field",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonDefinition.toPassTheBlankPasswordInTheCorrespondingField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the Signin button in the application",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonDefinition.toClickTheSigninButtonInTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser of amazon",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonDefinition.toCloseTheBrowserOfAmazon()"
});
formatter.result({
  "status": "passed"
});
});
@feature1
Feature: To Validate The Basic Functionality Of The Facebook Page
@sanity @smoke
  Scenario: To Validate Login With Invalid Username and valid Password
    Given User has to Launch The Browser and Hit the Facebook Url Page
    When User has to Enter the Invalid Username in Email text Field
      | keerthi123@gmail.com | java123@gmail.com | selenium123@gmail.com | manual123@gmail.com |
    And User has to Enter the Valid Password in Password Text field
      | keerthi123   | java123    | selenium123  | cucumber123 |
      | framework    | testNG     | Junit        | pom         |
      | dataprovider | parameters | parallel     | execution   |
      | grouping     | rerun      | crossbrowser | testing     |
    And User has to Click the Login button
    And user has to navigate to home page
    Then User has to  close the Browser
@regression
  Scenario Outline: :  To validate login with valid username and invalid password
    Given To launch the chrome browser and hit the url
    When To pass the valid username in the"<EmailID>" username text field
    And To pass the Invalid password in the "<Password>" password text field
    And To click the login button
    Then to close the chrome browser

    Examples: 
      | EmailID                  | Password        |
      | keerthi123@gmail.com     | keerthijava     |
      | madhan123@gmail.com      | madhaqnselenium |
      | fahadh123@gmail.com      | fahadhcucumber  |
      

@feature2
Feature: To validate the Login functionality of the Amazon Application

Background:
Given User To  Launch browser and hit url of the application
    @sanity @regression
	  Scenario: To pass login with Valid username and Valid password
	  
		When To pass the valid username in the corresponding field
		And To click the ctnue button
		And To pass the valid password in the corresponding field
		And To click the Signin button
		Then To close the browser
		@smoke @sanity
		Scenario: To pass login with Blank username and Blank password
		When To pass the balnk username in the corresponding field
		And To click the continue button
		And To pass the blank password in the corresponding field
		And To click the Signin button in the application
		Then To close the browser of amazon

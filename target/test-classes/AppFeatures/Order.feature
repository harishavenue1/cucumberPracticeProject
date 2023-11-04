Feature: Amazon Order Details
	Scenarios to Validate Orders on Different Screens
	
	Background:
		Given a Registered User Exists
		Given User is on Amazon Login Page
		When User Enters UserName
		And User Enter Password
		And User Clicks on Login button
		Then User Navigates to Home Page
		
	Scenario: Check Previous Order Details
		When User Clicks on Order Link
		Then User check the Previous Order Details
		
	Scenario: Check Open Order Details
		When User Clicks on Open Order Link
		Then User check the Open Order Details
		
	Scenario: Check Cancelled Order Details
		When User Clicks on Cancelled Order Link
		Then User check the Cancelled Order Details
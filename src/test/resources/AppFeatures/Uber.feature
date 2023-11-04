@All
Feature: Uber Booking Feature

@Smoke
Scenario: Booking Cab Sedan
Given User wants to select a car type "sedan" from uber app
When User selects car "sedan" and pick up point "Bangalore" and drop location "Pune"
Then Driver starts the Journey
And Driver ends the Journey
Then User pays 1000 USD

@Smoke @Regression 
Scenario: Booking Cab SUV
Given User wants to select a car type "SUV" from uber app
When User selects car "sedan" and pick up point "Bangalore" and drop location "Hyd"
Then Driver starts the Journey
And Driver ends the Journey
Then User pays 2000 USD

@Prod
Scenario: Booking Cab Mini-Cooper
Given User wants to select a car type "sedan" from uber app
When User selects car "sedan" and pick up point "Bangalore" and drop location "Mumbai"
Then Driver starts the Journey
And Driver ends the Journey
Then User pays 3000 USD
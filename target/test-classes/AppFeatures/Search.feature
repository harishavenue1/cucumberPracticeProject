Feature: Amazon Search

@smoke
Scenario: Search a Product - Laptop
Given I have a search field on Amazon Page
When I search for a product with name "Apple MacBook Air" and price 2000
Then Product with name "Apple MacBook Pro" should be displayed

@Regression
Scenario: Search a Product - Mobile
Given I have a search field on Amazon Page
When I search for a product with name "Apple iPhone" and price 200
Then Product with name "Apple iPhone" should be displayed
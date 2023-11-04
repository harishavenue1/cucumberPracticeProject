Feature: Login Feature

  Scenario Outline: Login Possible Combinations
    Given User is on Registration page
    When User clicks on Sign in button
    Then User is displayed login screen
    When user enter "<UserName>" in userName field
    When user enter "<Password>" in password field
    Then user clicks on Login button

    Examples: 
      | UserName | Password |
      | U1       | P1       |
      | U2       | P2       |
      | U3       | P3       |

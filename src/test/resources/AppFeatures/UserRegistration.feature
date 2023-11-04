Feature: Registration of Users

  Scenario: Register User with List of Data
    Given User is on Registration Page
    When User enters following user details
      | name1 | city1 | email1 | mob1 |
      | name2 | city2 | email2 | mob2 |
      | name3 | city3 | email3 | mob3 |
    Then User Registration is Successful

  Scenario: Register User with List of Data Columns
    Given User is on Registration Page
    When User enters following user details columns
      | name  | city  | email  | mob  |
      | name1 | city1 | email1 | mob1 |
      | name2 | city2 | email2 | mob2 |
      | name3 | city3 | email3 | mob3 |
    Then User Registration is Successful

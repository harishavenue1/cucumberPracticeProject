Feature: Calculate Billing Amount

  Scenario Outline: Calculate Bills
    Given User is on Billing Page
    When User enter Billing Amount "<billingAmount>"
    And User enter Tax Amount "<taxAmount>"
    Then User calculates "<finalAmount>"

    Examples: 
      | billingAmount | taxAmount | finalAmount |
      |          1000 |        10 |        1010 |
      |           500 |        20 |         520 |
      |           100 |       5.5 |       105.5 |

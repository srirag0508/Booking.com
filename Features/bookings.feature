Feature: Booking Senarios


  Scenario Outline: Verify user can view the result as per the property selected

    Given User is on the default section on page
    When User select Star as <Stars>
    Then User verify that system displays only <stars> hotels
    Examples:
      | stars   |
      | 5 stars |
      | 4 stars |
      | 3 stars |

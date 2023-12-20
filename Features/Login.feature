Feature: all login related scenarios

  @valid @login
  Scenario: To test the Sign In functionality for valid input
    Given Login page should be opened
 # When I enter username and password
    When I enter "admin" and "admin"
    And I click on login button
    Then I should be redirected to home page

  @invalid @login
  Scenario: To test the Sign In for invalid input
    Given Login page should be opened
#  When I enter incorrect username and password
    When I enter "dsdsd" and "ddsd"
    And I click on login button
    Then I should get an error message

  @blank @login
  Scenario: To test the functionality of Sign In for blank input
    Given Login page should be opened
 # When I enter blank username and password
    When I enter "" and ""
    And I click on login button
    Then I should get an another error message
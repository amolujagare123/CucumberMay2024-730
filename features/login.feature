Feature: all login related scenarios

  Scenario: To test the functionality of login button for valid input
    Given I am on login page
    When I enter correct username and password
    And I click on login button
    Then I should be on dashboard
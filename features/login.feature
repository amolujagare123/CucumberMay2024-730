Feature: all login related scenarios


 # Background: open the browser
 #   Given I open the browser
  #  And I maximize it


  @valid @login
  Scenario: To test the functionality of login button for valid input
    Given I am on login page
 #   When I enter correct username and password
    When I enter "admin" and "admin" as username and password
    And I click on login button
    Then I should be on dashboard

  @invalid @login
  Scenario: To test the functionality of login button for invalid input
    Given I am on login page
  #  When I enter incorrect username and password
    When I enter "dsdsd" and "dsdsds" as username and password
    And I click on login button
    Then I should get an error message

    @blank  @invalid @login
  Scenario: To test the functionality of login button for invalid input
    Given I am on login page
   # When I enter blank username and password
    When I enter "" and "" as username and password
    And I click on login button
    Then I should get an error message


      @submitForm @login
      Scenario: to test the functionality of submit button for valid input
        Given I am on user registration page
        When I enter below Data
          | amol | ujagare | abc pune | amol@gmail.com | 787878778 |
        And I click on submit button
        Then user should be added


  @submitForm2
  Scenario Outline: to test the functionality of submit button for valid input
    Given I am on user registration page
    When I enter <firstName> , <lastName> , <address> , <email> , <phone>
    And I click on submit button
    Then user should be added
    Examples:
      | firstName | lastName | address              | email                      | phone         |
      | John      | Doe      | 123 Maple St, City   | john.doe@example.com       | 123-456-7890  |
      | Jane      | Smith    | 456 Oak St, Town     | jane.smith@example.com     | 234-567-8901  |
      | Alice     | Johnson  | 789 Pine St, Village | alice.johnson@example.com  | 345-678-9012  |
      | Bob       | Brown    | 101 Birch St, Hamlet | bob.brown@example.com      | 456-789-0123  |
      | Carol     | White    | 202 Cedar St, Borough| carol.white@example.com    | 567-890-1234  |
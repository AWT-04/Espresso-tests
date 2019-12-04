Feature: Calculate basic operations
  As a owner, I want create a sum, substraction, multiplication and division operations, so that I can verify in the UI board.

   Scenario: Calculate add operation
     Given I press the button "1"
     And I press the button add
     And I press the button "2"
     When I press the button equal
     Then I should see the number "3.0" in the screen

  Scenario: Calculate multiplication operation
    Given I press the button "1"
    And I press the multiplication button
    And I press the button "2"
    When I press the button equal
    Then I should see the number "2.0" in the screen

  Scenario: Calculate division operation
    Given I press the button "5"
    And I press the division button
    And I press the button "1"
    When I press the button equal
    Then I should see the number "5.0" in the screen

  Scenario: Calculate substraction operation
    Given I press the button "6"
    And I press the substraction button
    And I press the button "3"
    When I press the button equal
    Then I should see the number "3.0" in the screen

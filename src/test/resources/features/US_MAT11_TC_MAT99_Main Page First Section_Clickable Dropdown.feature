
Feature: Clickable Language Dropdown Menu

  Scenario: Clickable English Language
    Given User navigates to "movita" page
    And   Locate dropdown
    And Click on English
    Then Verify English Writing
@mat11 @crossfirefox
  Scenario: Clickable Turkish Language
    Given User navigates to "movita" page
    And   Locate dropdown
    And Click on Turkish
    Then Verify Turkish Writing


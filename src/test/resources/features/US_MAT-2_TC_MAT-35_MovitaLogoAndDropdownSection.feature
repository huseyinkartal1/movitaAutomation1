@logoAndDropdown
Feature: Movita Logo and Dropdown Section

  Background: User go to homepage
    Given User navigates to "movita" page

    Scenario: Movita Logo
      When Movita Logo should be clickable
      Then User click to logo
      And User verify Mobil Vasıta İzleme Takip Sistemi displayed

    Scenario: English Language Dropdown
      When Locate dropdown
      Then Click on English
      And Verify English Writing

    Scenario: Turkish Language Dropdown
      When Locate dropdown
      Then Click on Turkish
      And Verify Turkish Writing
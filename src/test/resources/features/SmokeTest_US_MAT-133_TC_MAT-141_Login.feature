@smoketest1
Feature: Smoke Test Login Function

  Scenario: Positive Login
    Given User navigates to "movita" page
    Then Click on “Giriş Yap”
    Then Enter username as "ValidUserName" and password as "ValidPassword"
    Then User click to login button
    Then User must see their own dashboard
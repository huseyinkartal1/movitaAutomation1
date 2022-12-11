@smoketest
Feature: Smoke Test For Alarm Islemleri

  Scenario: Alarm Islemleri
    Given User navigates to "movita" page
    Then Click on “Giriş Yap”
    Then Enter username as "ValidUserName" and password as "ValidPassword"
    Then User click to login button
    Then User click to Alarm Islemleri
    Then User should be on Alarm Listesi page
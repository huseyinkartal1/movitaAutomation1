@mainComponents
Feature: Home Page Frist Section Main Components Clickable/Change Color/Verify Text Tests

  Background: Go to homepage
    Given User navigates to "movita" page

  Scenario: US_MAT-2_TC_MAT-44
    When User hover over “ROTA OPTIMIZASYONU“
    Then “ROTA OPTIMIZASYONU“ should be clickable
    Then User verify “ROTA OPTIMIZASYONU“ text color change
    And Text shold be “ROTA OPTIMIZASYONU“

  Scenario: US_MAT-2_TC_MAT-45
    When User hover over “UYGULAMALAR“
    Then “UYGULAMALAR“ should be clickable
    Then User verify “UYGULAMALAR“ text color change
    And Text shold be “UYGULAMALAR“

  Scenario: US_MAT-2_TC_MAT-46
    When User hover over “KILAVUZ“
    Then “KILAVUZ“ should be clickable
    Then User verify “KILAVUZ“ text color change
    And Text shold be “KILAVUZ“

  Scenario: US_MAT-2_TC_MAT-47
    When User hover over “İLETİŞİM“
    Then “İLETİŞİM“ should be clickable
    Then User verify “İLETİŞİM“ text color change
    And Text shold be “İLETİŞİM“

  Scenario: US_MAT-2_TC_MAT-47
    When User hover over “GİRİŞ YAP“
    Then “GİRİŞ YAP“ should be clickable
    Then User verify “GİRİŞ YAP“ text color change
    And Text shold be “GİRİŞ YAP“
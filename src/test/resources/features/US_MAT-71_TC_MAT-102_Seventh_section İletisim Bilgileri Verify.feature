Feature: US_MAT-71_TC_MAT-102_Seventh_section İletisim Bilgileri Verify

  Background: User go to homepage
    Given User navigates to "movita" page

  Scenario:
    And User scroll down to seventh section
    Then User should see “Adres”, “Telefon”, and “email”
    And User verify the expected texts

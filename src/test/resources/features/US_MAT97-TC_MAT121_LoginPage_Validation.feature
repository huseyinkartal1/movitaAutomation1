Feature: Login Validation

  Background:
    Given User navigates to "movita" page
    Then Click on “Giriş Yap”
    Then Click on "Şifrenizi mi unuttunuz?"

  Scenario: Login Invalid credentials
    When  user login as follow
      | userName | invalid |
      | phoneNumber | 05554443322 |
    Then  Click on “Şifre Değiştir” button
    And Verify valid username

  Scenario: Valid username invalid phone number
    When  user login as follow
      | userName | demomovita |
      | phoneNumber | 05554443322 |
    Then  Click on “Şifre Değiştir” button
    And Verify valid username

  Scenario: Login none credentials
    Then  Click on “Şifre Değiştir” button
    And Verify none credentials



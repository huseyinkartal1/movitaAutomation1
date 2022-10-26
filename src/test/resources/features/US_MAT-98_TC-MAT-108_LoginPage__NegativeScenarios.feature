@login_negative_scenarios

  Feature: Login Page Negative Test

  Background: US_MAT-98_TC-108 Negative Scenarios
    Given user login movita page
    Then user clicks firstGirisYap button

   Scenario: incorrect username, correct password
    Then user enters username incorrectly
    And user enters password correctly
    Then user clicks secondGirisYap button
    Then user verifies that ‘Lütfen kullanıcı adınızı veya şifrenizi doğru girdiğinizden emin olunuz.’ text should be displayed


   Scenario: incorrect password, correct username
     Then user enters username "demomovita" correctly
     And user enters password "123456" incorrectly
     Then user clicks secondGirisYap button
     Then user verifies that ‘Lütfen kullanıcı adınızı veya şifrenizi doğru girdiğinizden emin olunuz.’ text should be displayed

   Scenario: incorrect password and incorrect username
     Then user enters username "username" incorrectly
     And user enters password "123456" incorrect
     Then user clicks secondGirisYap button
     Then user verifies that ‘Lütfen kullanıcı adınızı veya şifrenizi doğru girdiğinizden emin olunuz.’ text should be displayed
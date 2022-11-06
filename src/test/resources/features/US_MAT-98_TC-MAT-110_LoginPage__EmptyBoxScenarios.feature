@emptyBoxScenarios

  Feature: Login Page Empty Box Scenarios

    Background: US_MAT-98_TC-MAT-110_LoginPage_EmptyBoxScenarios
      Given user login movita page
      Then user clicks firstGirisYap button

    Scenario: username entered, password empty
      And user enters username  correct
      Then user clicks secondGirisYap button
      Then user verifies Lütfen şifrenizi girdiğinizden emin olun! text is displayed

    Scenario: username empty, password entered
      And user enters password correct
      Then user clicks secondGirisYap button
      Then user verifies Lütfen kullanıcı adınızı girdiğinizden emin olun! text is displayed

    Scenario: username empty, password empty
      Then user clicks secondGirisYap button
      Then user verifies Lütfen kullanıcı adınızı girdiğinizden emin olun! text is displayed
      Then user verifies Lütfen şifrenizi girdiğinizden emin olun! text is displayed
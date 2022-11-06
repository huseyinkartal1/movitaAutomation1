@loginPage_positiveScenario

  Feature: Login page positive scenario

    Scenario: US_MAT-98_TC_109

      Given user login movita page
      Then user clicks firstGirisYap button
      And user enters password correct
      Then user enters username  correct
      And user clicks secondGirisYap button
      Then user should login website
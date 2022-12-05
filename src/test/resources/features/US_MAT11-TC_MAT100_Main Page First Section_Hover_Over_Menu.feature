Feature: Main Page First Section_Hover_Over_Menu

  Background: Go to homepage
    Given User navigates to "movita" page

  Scenario: “ROTA OPTIMIZASYONU”
    And  Hover over “ROTA OPTIMIZASYONU”
    Then Verify “ROTA OPTIMIZASYONU” color change
    And  Click on “ROTA OPTIMIZASYONU”
    Then Verify writing “ROTA OPTIMIZASYONU”

  Scenario: “UYGULAMALAR”
    And  Hover over “UYGULAMALAR”
    Then Verify “UYGULAMALAR” color change
    And  Click on “UYGULAMALAR”
    Then Verify writing “UYGULAMALAR”

  Scenario: “KILAVUZ”
    And Hover over “KILAVUZ”
    Then Verify “KILAVUZ” color change
    And Click on “KILAVUZ”
    Then Verify writing “movita Uygulama Kullanım Kılavuzu”

  Scenario: “İLETİŞİM”
    And Hover over “İLETİŞİM”
    Then Verify “İLETİŞİM” color change
    And Click on “İLETİŞİM”
    Then Verify writing “İLETİŞİM”

  Scenario: “Giriş Yap”
    And  Hover over “Giriş Yap”
    Then Verify “Giriş Yap” color change
    And  Click on “Giriş Yap”
    Then Verify writing “Giriş Yap”


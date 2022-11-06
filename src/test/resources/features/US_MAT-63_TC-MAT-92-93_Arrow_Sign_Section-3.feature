@verifyTexts

Feature:Verifying Texts

  Background: Verifying Texts
    Given user login movita page

  Scenario:TC_01_Verifying The Third Section Texts
    Then user verifies NEDEN TAKİP SİSTEMİ text
    Then user verifies TSE BELGELİ CİHAZLAR text
    And  user verifies ÜCRETSİZ İNCELEYİN text
    And  user verifies YAZILIM VE TEKNOLOJI GELISTIRME text
    Then user verifies ARAC TAKİP SİSTEMİ text
    Then user verifies ÖNE ÇIKAN OZELLİKLERİMİZ text
    And  user verifies KOLAY ERİSİM text
    Then user verifies TEKNİK DESTEK text
    Then user verifies SEKTÖRLERE YÖNELİK COZUMLER text

  Scenario: TC_02_Arrow Sign
    Then when user hovers over arrow sign,
    And  background color of arrow returns from blue to grey
    And  user clicks arrow button
    Then Tüm Sektörlere Hitap Eden Cozumler text is should be displayed
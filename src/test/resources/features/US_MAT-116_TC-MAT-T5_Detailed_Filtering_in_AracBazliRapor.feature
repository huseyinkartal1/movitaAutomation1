Feature:  Deatiled Filter
  Scenario: Deatiled Filter
    Given user navigates to login page
    When user logins the page
    And click on Raporlar
    And click on Araç Bazlı Rapor
    Then clicks on Baslangic Tarihi
    And choose 2021 from dropdown menu
    Then choose Jan from dropdown menu
    And choose 1st day of the month
    Then click  on Rapor al
    And click on Detayli Filtre
    Then verify Tarih writing
    Then verify Ise Baslama writing
    Then verify Is Bitis writing
    And verify Tarih placeholder
    Then verify Ise Baslama placeholder
    And verify Is Bitis placeholder


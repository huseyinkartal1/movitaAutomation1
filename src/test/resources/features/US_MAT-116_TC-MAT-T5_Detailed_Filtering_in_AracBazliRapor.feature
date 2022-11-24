Feature:  Deatiled Filter

  Background: Deatiled Filter

    Given user navigates to login page
    When user logins the page
    And click on Raporlar
    And click on Araç Bazlı Rapor
    Then clicks on Baslangic Tarihi
    And choose 2021-01-01 from dropdown menu
    Then click  on Rapor al
    And click on Detayli Filtre

  Scenario: verify writings and placeholders
    Then verify Tarih writing
    Then verify Ise Baslama writing
    Then verify Is Bitis writing
    And verify Tarih placeholder
    Then verify Ise Baslama placeholder
    And verify Is Bitis placeholder

  Scenario: Date filter
    Given user sends input as "2022"
    Then user verifies filtered result1
    And user sends input as "2021-11"
    Then user verifies filtered result2
    And user sends input as "2021-11-05"
    Then user verifies filtered result3

  Scenario Outline: Date filter
    Given user sends input as "<date>"
    Then user verifies <result> filtered result with date "<date>"
    Examples:
      | date       | result |
      | 2022       | 1      |
      | 2021-11    | 7      |
      | 2021-11-05 | 1      |

   Scenario Outline: Date filter with ise baslama
     Given user sends input as "2021-11"
     And user sends input as "<ise baslama>" to ise baslama
    Then user verifies <result> filtered result with ise baslama "<ise baslama>"
     Examples:
       | ise baslama | result |
       | 11:         | 0      |
       | 12:         | 3      |
       | 12:09       | 1      |
       | 12:09:07    | 1      |


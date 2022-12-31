Feature: US_MAT105-TC-03_Seventh_section "KURUMSAL" Verify

  Background: User go to homepage
    Given User navigates to "movita" page

  Scenario:
    Given User scroll down to seventh section
    And User should click “Hakkimizda”
    Then User should see “HAKKIMIZDA“ text
    And User should click “Belgelerimiz”
    Then User should see “BELGELERIMIZ“ text
    And User should click “Bayilik Basvurusu”
    Then User should see “BAYILIK BAŞVURU“ text
    And User should click “Demo Basvurusu”
    Then User should see “DEMO BAŞVURU“ text
    And User should click “Ürünler”
    Then User should see “ÜRÜNLER“ text
    And User should click “Rota Optimizasyonu”
    Then User should see “ROTA OPTIMIZASYONU“ text
    And User should click “Iletisim”
    Then User should see “İADE ŞARTLARI“ text
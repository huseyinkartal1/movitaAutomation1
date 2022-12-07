@smoketest
Feature: Smoke Test For Personel Islemleri

  Scenario: Personel Islemleri Functionality
    Given User navigates to "movita" page
    Then Click on “Giriş Yap”
    Then Enter username as "ValidUserName" and password as "ValidPassword"
    Then User click to login button
    Then User click to Personel Islemleri
    Then User click to Personel
    Then User should be on Personel Listesi page
    Then User click to Is Atama
    Then User should be on Is Atama page
    Then User click to Servis Islemleri
    Then User should be on Servis Islemleri page
    Then User click to Birim Listesi
    Then User should be on Birim Listesi page
    Then User click to Personel Anket
    Then User should be on Personel Anket page
    Then User click to Personel Sikayet Talep
    Then User should be on Personel Sikayet Talep page

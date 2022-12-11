@smoketest
Feature: Smoke Test For Rota Islemleri

  Scenario: Rota Islemleri
    Given User navigates to "movita" page
    Then Click on “Giriş Yap”
    Then Enter username as "ValidUserName" and password as "ValidPassword"
    Then User click to login button
    Then User click to Rota Islemleri
    Then User click to Optimizasyon
    Then User should be on Optimize Et page
    Then User click to Istasyon
    Then User should be on Istasyon Listesi page
    Then User click to Durak
    Then User should be on Durak Listesi page


Feature: Movita Tests

  Background:
    Given kullanıcı movita sayfasına gider
  @smoketest1
  Scenario: Movita TC_01
    Given  kullanıcı movita losgosuna tıklar
    Then Mobil Vasita izleme takip Sistemi yazısı ekranda görünür

  Scenario: TC_02 Dropdown Optimization
    Given user clicks on dropdown button
    And  English item is selected after clicking, text of Mobile Vehicle Tracking System should be displayed on the screen.
    Then  Türkçe item is selected after clicking, text of Mobil Vasıta İzleme Takip Sistemi should be displayed

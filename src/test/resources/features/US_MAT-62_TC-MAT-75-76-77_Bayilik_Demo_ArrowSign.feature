@movita2sectiontests

Feature: Movita 2_section Tests

  Background:
    Given kullanıcı movita sayfasına gider

  Scenario: Section2_TC_01 Bayilik Başvurusu
    Then Bayilik Basvurusuna hover over yapılır
    And hover over yapılınca textin rengi değişir
    Then Bayilik Basvurusu tıklanır
    Then ekranda Bayilik Başvuru yazısı görünür

  Scenario:  Section2_TC_02 Demo Başvurusu
    Then Demo başvurusuna hover over yapılır ve renk değişikliği olmaz
    And Demo Başvurusuna click yapılır
    Then Demo Başvuru yazısı ekranda görünür

  Scenario:  Section2_TC_03 ARROW SIGN
    Then ARROW SIGN a hover over yapılır ve renk değişikliği olur
    And ARROW SIGN a click yapılır
    Then “Tüm Sektörlere Hitap Eden Cözümler yazısı ekranda görünür
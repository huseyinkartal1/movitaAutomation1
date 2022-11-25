@Modules

Feature: US_MAT-112_TC-MAT-128_Modules under user account movita logo

  Background: Login Main Page

    Given User navigates to "movita" page
    Then User clicks girisYapFirst button
    Then user enters the username and password
    Then User clicks girisYapSecond button
    Then user should be login main page

  Scenario: TC-128 Main Page
    Then menus available should display on the left side of the screen
    Then map should display in the middle
    Then summary information should display covering total vehicles

  Scenario: TC-128 Menu
    Then Anasayfa (filo_admin) submenus should be opened
    And  Raporlar submenus should be opened
    And  Araç Rota submenus should be opened
    And  Araç Video-Fotoğraf submenus should be opened
    And  Güzergah İslemleri submenus should be opened
    And  Alarm Islemleri submenus should be opened
    And  Rota islemleri submenus should be opened
    And  Personel İslemleri submenus should be opened
    And  Yönetim ve Ayarlar submenus should be opened

  Scenario: any main and or subcomponent should not be selected
    When User login the main page any main and or subcomponent should not be selected

  Scenario: TC-128 Color Test
    When User hovers over the main components background color should change from white to gray
    When User click the main components Openable component's background color remains grey, ana text color is not change
    When User click the main components Not openable component's background color remains grey, but text color is change to blue

    Scenario: TC-128 Movita logo
      When User clicks on the Movita Logo User should reach the layout after logging into his account

      Scenario:TC-128 Copyright Text
        Then User should read "Copyright © 2017 - 2022 movita, Bütün Hakları Saklıdır." in the bottom footer of the screen.















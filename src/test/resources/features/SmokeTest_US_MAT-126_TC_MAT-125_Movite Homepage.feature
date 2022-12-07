@smoketest
Feature: Create smoke test case steps for the movita homepage
  Background: Go to homepage
    Given User navigates to "movita" page
    Then user should see the expected Text

  Scenario: Create smoke test case steps for the movita homepage
    Given user hover over on menu item clicks on items in order user verifies the page

    Scenario:
      Then user clicks on ROTA OPTİMİZASYONU
      And when ROTA OPTİMİZASYONU is clicked, the text of ROTA OPTİMİZASYONU should be displayed on the screen.
      Then user clicks on Uygulamalar OPTİMİZASYONU
      And when Uygulamalar OPTİMİZASYONU is clicked, the text of Uygulamalar OPTİMİZASYONU should be displayed on the screen.
      Then user clicks on Kılavuz OPTİMİZASYONU
      And when Uygulamalar OPTİMİZASYONU is clicked, the text of Kılavuz OPTİMİZASYONU should be displayed on the screen.
      Then user clicks on ILETISIM OPTİMİZASYONU
      And when ILETISIM OPTİMİZASYONU is clicked, the text of ILETISIM OPTİMİZASYONU should be displayed on the screen.
      Then user clicks on GIRIS YAP OPTİMİZASYONU
      And user navigates to login page




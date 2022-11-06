@forgetPassword

  Feature: US_MAT-95_TC-MAT-122-123'Şifrenizi mi Unuttunuz?'

    Background: navigate to page
      Given user login movita page
      Then user clicks firstGirisYap button

    Scenario: TC-122-LoginPage_ForgetPassword
      Then user clicks Şifrenizi mi unuttunuz? text
      Then username box and telephone box should be enabled
      And Movita Şifre Yenileme text should be displayed
      Then Movita Logo should be displayed
      Then Blue colored Şifre Değiştir  button should be displayed
      And  Giriş Ekranı link should be displayed
      And User hovers over Giriş Ekranı link
      Then Color of  Giriş Ekranı link’s  text should be green from blue
      Then user clicks Giriş Ekranı link

    Scenario: TC-123-After Clicking Giris Ekrani
      Then Anasayfaya don text is displayed
      And user clicks anasayfaya don button
      Then main page should be opened
      And Copyright © 2017-2022, Bütün Hakları Saklıdır. text is displayed
      Then user navigates to back for opening giris ekrani
      And user clicks Giriş Ekranı link again
      Then login page should be opened







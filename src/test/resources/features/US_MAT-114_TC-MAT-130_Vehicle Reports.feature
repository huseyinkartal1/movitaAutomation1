@vehicleReports

  Feature: Vehicle Reports Tests

     Background: Vehicle reports page
     Given User navigates to "movita" page
     Then  user clicks firstGirisYap button
     And   user enters username  correct
     Then  user enters password correct
     Then  user clicks secondGirisYap button
     And   user clicks Raporlar button
     Then  user clicks Araç Bazlı Rapor button
     And   two blogs should be opened on the ‘Araç Bazlı Rapor’ page

    Scenario:US_114_TC_130_Vehicle reports page_1
     Then Arac dropdown should be displayed on the left blog
     Then ‘Başlangıç Tarihi’ dropdown should be displayed on the left blog
     Then Bitiş Tarihi dropdown should be displayed on the left blog
     Then Rapor Al dropdown should be displayed on the left blog

    Scenario:US_114_TC_131_Vehicle reports page_2
     Then Detaylı Arama,excel,pdf and print buttons are displayed on the right blog
     Then ‘Bütün Kayıtlarda Ara’ search box is displayed on the right blog
     And  A graphical table below the buttons showing the results is displayed on the right blog
     Then ‘Rapor almak için sol tarafta tarih aralığı seçerek 'Rapor Al’ butonuna tıklayınız.’ text is displayed on the right blog
    Then Heigths and bottoms should be the same of left blog and report blog on the right blog
     And  ‘Önceki' and ‘Sonraki’ buttons are enabled on the right blog
     Then  user hovers over all buttons


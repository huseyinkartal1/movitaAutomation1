
Feature: US_MAT11-TC_-MAT91_Main Page First Section
  Scenario: Clickable Logo of Movita
    Given User navigates to "movita" page
    When clicks on movita logo
    Then Verify if Mobil Vasıta İzleme Takip Sistemi displayed


    #Dropdown
    #1.Clickable olmali
    #2.Iki secenegi click yapinca:
    #English → “Mobile Vehicle Tracking System” yazisini verify et
    #Türkce → “Mobil Vasita izleme takip Sistemi” yazisini verify et

    #ROTA OTIMIZASYONU
    #Hover over edince ROTA OTIMIZASYON' nun rengi degismeli
    #Clickable olmali
    #String verify edilmeli → ROTA OTIMIZASYONU

    #UYGULAMALAR
    #Hover over edince UYGULAMALAR' in rengi degismeli
    #Clickable olmali
    #String verify edilmeli → UYGULAMALAR

    #KLAVUZ
    #Hover over edince KILAVUZ' un rengi degismeli
    #Clickable olmali
    #String verify edilmeli → movita Servis Kullanim Kilavuzu

    #ILETISIM
    #Hover over edince İLETİŞİM' in rengi degismeli
    #Clickable olmali
    #String verify edilmeli → İLETİŞİM

    #GIRIS YAP
    #Hover over edince GIRIS YAP' in rengi degismeli
    #Clickable olmali
    #String verify edilmeli → Giris Yap
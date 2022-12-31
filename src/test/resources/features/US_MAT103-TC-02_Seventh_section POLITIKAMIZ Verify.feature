
Feature: US_MAT103-TC-02_Seventh_section "POLITIKAMIZ" Verify

  Background: User go to homepage
    Given User navigates to "movita" page

    Scenario:
      Given User scroll down to seventh section
      And User should click “Mesafeli Satis Sözlesmesi”
      Then User should see “MESAFELI SATIŞ SÖZLEŞMESI“ text
      And User should click “Gizlilik Politikasi”
      Then User should see “GİZLİLİK POLİTİKASI“ text
      And User should click “Ödeme ve Teslimat”
      Then User should see “ÖDEME VE TESLİMAT“ text
      And User should click “Garanti Sartlari”
      Then User should see “GARANTİ ŞARTLARI“ text
      And User should click “Iade Sartlari”
      Then User should see “ÜRÜNLER“ text

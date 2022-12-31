package stepdefinitions;



import io.cucumber.datatable.DataTable;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.MovitaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;


import static org.junit.Assert.*;
import java.util.*;


public class MovitaStepDefinitions extends ReusableMethods {

    MovitaPage movita = new MovitaPage();

    @Given("User navigates to {string} page")
    public void user_navigates_to_page(String homePage) {
        Driver.getDriver().get(ConfigurationReader.getProperty(homePage));

    }

    @When("clicks on movita logo")
    public void clicks_on_movita_logo() {
        movita.movitaLogo.click();
    }


    @Then("User should navigate to homepage")
    @Then("Verify the URL")
    public void user_should_navigate_to_homepage() {
        String expectedUrl = "https://movita.com.tr/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("Urls are not matched.User can't navigate to homepage", expectedUrl, actualUrl);
    }

    @Then("Verify if Mobil Vasıta İzleme Takip Sistemi displayed")
    public void verify_if_mobil_vasıta_izleme_takip_sistemi_displayed() {
        ReusableMethods.waitForVisibility(movita.mainTextTurkish, 3);
        Assert.assertTrue(movita.mainTextTurkish.isDisplayed());
    }


    //-------------------------Çözümler----------------------------------
    //-------------------------Okul Servis Aracları Takip Sistemi----------------------------------
    @Given("User navigates to {string} page6")
    public void user_navigates_to_page6(String homePage) {
        Driver.getDriver().get(ConfigurationReader.getProperty(homePage));
    }

    @When("hover over6 {string}")
    public void hover_over6(String string) {
        Driver.getDriver().navigate().to("https://movita.com.tr");
        ReusableMethods.hover(movita.cozumlerOkul);
    }

    @When("User should see6 {string} text")
    public void user_should_see6_text(String okulServis) {
        movita.cozumlerOkul.isDisplayed();
        String cozumlerOkulText = movita.cozumlerOkul.getText();
        Assert.assertEquals(cozumlerOkulText, "Okul Servis Araçları Takip Sistemi");
    }

    @Then("User should click6 {string}")
    public void user_should_click6(String string) {
        movita.cozumlerOkul.click();
    }

    @Then("User should see6 {string} text6")
    public void user_should_see6_text6(String okulServisAraclari) {
        movita.okulServisText.isDisplayed();
        String expOkulServisText = movita.okulServisText.getText();
        Assert.assertEquals(expOkulServisText, "OKUL SERVIS ARAÇLARI TAKIP SISTEMI");
    }

//-------------------------Kameralı Araç Takip Sistemi----------------------------------


    @When("hover over7 {string}")
    public void hover_over7(String string) {
        Driver.getDriver().navigate().to("https://movita.com.tr");
        ReusableMethods.hover(movita.cozumlerKamerali);
    }

    @When("User should see7 {string} text")
    public void user_should_see7_text(String string) {
        movita.cozumlerKamerali.isDisplayed();
        String cozumlerKameraliText = movita.cozumlerKamerali.getText();
        Assert.assertEquals(cozumlerKameraliText, "Kameralı Araç Takip Sistemi");
    }

    @Then("User should click7 {string}")
    public void user_should_click7(String string) {
        movita.cozumlerKamerali.click();
    }

    @Then("User should see7 {string} text7")
    public void user_should_see7_text7(String string) {
        movita.kameraliAracText.isDisplayed();
        String expKameraliAracText = movita.kameraliAracText.getText();
        Assert.assertEquals(expKameraliAracText, "KAMERALI ARAÇ TAKIP SISTEMI");
    }

//-------------------------Kişi Bilgilendirme Sistemi-------------------------------

    @When("hover over8 {string}")
    public void hover_over8(String string) {
        Driver.getDriver().navigate().to("https://movita.com.tr");
        ReusableMethods.hover(movita.cozumlerKisi);
    }

    @When("User should see8 {string} text")
    public void user_should_see8_text(String string) {
        movita.cozumlerKisi.isDisplayed();
        String cozumlerKisiText = movita.cozumlerKisi.getText();
        Assert.assertEquals(cozumlerKisiText, "Kişi Bilgilendirme Sistemi");
    }

    @Then("User should click8 {string}")
    public void user_should_click8(String string) {
        movita.cozumlerKisi.click();
    }

    @Then("User should see8 {string} text8")
    public void user_should_see8_text8(String string) {
        movita.kisiBilgilendirmeText.isDisplayed();
        String expKisiBilgilendirmeText = movita.kisiBilgilendirmeText.getText();
        Assert.assertEquals(expKisiBilgilendirmeText, "KIŞI BILGILENDIRME SISTEMI");
    }

//-------------------------Kişi ve Nesne Sistemi-------------------------------

    @When("hover over9 {string}")
    public void hover_over9(String string) {
        Driver.getDriver().navigate().to("https://movita.com.tr");
        ReusableMethods.hover(movita.cozumlerKisiVeNesne);
    }

    @When("User should see9 {string} text")
    public void user_should_see9_text(String string) {
        movita.cozumlerKisiVeNesne.isDisplayed();
        String cozumlerKisiVeNesneText = movita.cozumlerKisiVeNesne.getText();
        Assert.assertEquals(cozumlerKisiVeNesneText, "Kişi ve Nesne/Hayvan Takip Sistemi");
    }


    @Then("User should click9 {string}")
    public void user_should_click9(String string) {
        ReusableMethods.hover(movita.cozumlerKisiVeNesne);
        movita.cozumlerKisiVeNesne.click();
    }

    @Then("User should see9 {string} text9")
    public void user_should_see9_text9(String string) {
        movita.kisiVeNesneText.isDisplayed();
        String expKisiVeNesneText = movita.kisiVeNesneText.getText();
        Assert.assertEquals(expKisiVeNesneText, "KIŞI VE NESNE/HAYVAN TAKIP SISTEMI");
    }

    // ---------------huseyinKartal ------------
// ------Clickable Language Dropdown Menu-----------
    @Given("Navigate to homepage")
    public void navigate_to_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("movita"));
    }

    @Given("Locate dropdown")
    public void hover_over_clickable() {
        //  dropdown = new Select(movita.bayrak);
        movita.flag_up_right.click();

    }

    @Given("Click on English")
    public void click_on_english() {
        movita.eng_Flag.click();
    }

    @Then("Verify English Writing")
    public void verify_english_writing() {
        ReusableMethods.waitForVisibility(movita.engWriting, 3);
        Assert.assertTrue(movita.engWriting.isDisplayed());
    }

    @Given("Click on Turkish")
    public void click_on_turkish() {
        movita.tr_Flag.click();
    }

    @Then("Verify Turkish Writing")
    public void verify_turkish_writing() {
        ReusableMethods.waitForVisibility(movita.trWriting, 3);
        Assert.assertTrue(movita.trWriting.isDisplayed());
    }


    /**
     * huseyinKartal
     * US_MAT11-TC_MAT100_Main Page First Section_Hover_Over_Menu
     */

    @Given("Hover over “ROTA OPTIMIZASYONU”")
    public void hover_over_rota_optımızasyonu() {
        ReusableMethods.hover(movita.rotaOptimizasyonu);
    }

    @Then("Verify “ROTA OPTIMIZASYONU” color change")
    public void verify_rota_optımızasyonu_color_change() {
        String s = movita.rotaOptimizasyonu.getCssValue("color");
        String c = Color.fromString(s).asHex();
        Assert.assertEquals("#00adee", c);
    }

    @Given("Click on “ROTA OPTIMIZASYONU”")
    public void click_on_rota_optımızasyonu() {
        movita.rotaOptimizasyonu.click();
    }

    @Then("Verify writing “ROTA OPTIMIZASYONU”")
    public void verify_writing_rota_optımızasyonu() {
        Assert.assertTrue(movita.rotaWriting.isDisplayed());
    }

    @Given("Hover over “UYGULAMALAR”")
    public void hover_over_uygulamalar() {
        ReusableMethods.hover(movita.uygulamalar1);
    }

    @Then("Verify “UYGULAMALAR” color change")
    public void verify_uygulamalar_color_change() {
        String s = movita.uygulamalar1.getCssValue("color");
        String c = Color.fromString(s).asHex();
        Assert.assertEquals("#00adee", c);
    }

    @Given("Click on “UYGULAMALAR”")
    public void click_on_uygulamalar() {
        movita.uygulamalar1.click();
    }

    @Then("Verify writing “UYGULAMALAR”")
    public void verify_writing_uygulamalar() {
        Assert.assertTrue(movita.uygulamalarWriting.isDisplayed());
    }

    @Given("Hover over “KILAVUZ”")
    public void hover_over_kılavuz() {
        ReusableMethods.hover(movita.kilavuz1);
    }

    @Then("Verify “KILAVUZ” color change")
    public void verify_kılavuz_color_change() {
        String s = movita.kilavuz1.getCssValue("color");
        String c = Color.fromString(s).asHex();
        Assert.assertEquals("#00adee", c);
    }

    @Given("Click on “KILAVUZ”")
    public void click_on_kılavuz() {
        movita.kilavuz1.click();
    }

    @Then("Verify writing “movita Uygulama Kullanım Kılavuzu”")
    public void verify_writing_movita_uygulama_kullanım_kılavuzu() {
        Assert.assertTrue(movita.kilavuzWriting.isDisplayed());
    }

    @Given("Hover over “İLETİŞİM”")
    public void hover_over_iletişim() {
        ReusableMethods.hover(movita.iletisim1);
    }

    @Then("Verify “İLETİŞİM” color change")
    public void verify_iletişim_color_change() {
        String s = movita.iletisim1.getCssValue("color");
        String c = Color.fromString(s).asHex();
        Assert.assertEquals("#00adee", c);
    }

    @Given("Click on “İLETİŞİM”")
    public void click_on_iletişim() {
        movita.iletisim1.click();
    }

    @Then("Verify writing “İLETİŞİM”")
    public void verify_writing_iletişim() {
        Assert.assertTrue(movita.iletisimWriting.isDisplayed());
    }

    @Given("Hover over “Giriş Yap”")
    public void hover_over_giriş_yap() {
        ReusableMethods.hover(movita.girisYap1);
    }

    @Then("Verify “Giriş Yap” color change")
    public void verify_giriş_yap_color_change() {
        String s = movita.girisYap1.getCssValue("color");
        String c = Color.fromString(s).asHex();
        Assert.assertEquals("#00adee", c);
    }


    @Then("Verify writing “Giriş Yap”")
    public void verifyWritingGirişYap() {
        Assert.assertEquals("Giriş Yap", movita.girisYapButton.getText());
    }


    /**
     * huseyinKartal
     * TC_MAT121_Şifrenizi mi Unuttunuz
     */

    @Given("Click on “Giriş Yap”")
    public void click_on_giriş_yap() {
        movita.girisYap1.click();
    }

    @Given("Click on \"Şifrenizi mi unuttunuz?\"")
    public void click_on_forgotPassword() {
        movita.forgotPassword.click();
    }

    @Given("Click on “Şifre Değiştir” button")
    public void click_on_changePassword() {
        movita.changePassword.click();
    }

    @When("user login as follow")
    public void userLoginAsFollow(DataTable table) {
        Map<String, String> map = table.asMap();
        movita.userName.sendKeys(map.get("userName"));
        movita.phoneNumber.sendKeys(map.get("phoneNumber"));

    }

    @And("Verify none credentials")
    public void Verify_none_credentials() {
        String expected = "Lütfen kullanıcı adınızı veya telefon numaranızı doğru girdiğinizden emin olunuz.";
        String actual1 = "Lütfen kullanıcı adınızı girdiğinizden emin olun!";
        Assert.assertEquals(expected, movita.noneCredentials.getText());
    }

    @And("Verify valid username")
    public void valid_username() {
        String expected = "Lütfen kullanıcı adınızı veya telefon numaranızı doğru girdiğinizden emin olunuz.";
        String actual1 = "Telefon Bilgisi Doğru Değildir. Şifreniz Değiştirilmemiştir";

        Assert.assertEquals(expected, movita.toastMessage.getText());
    }

    @And("Verify valid phoneNumber")
    public void valid_phoneNumber() {
        //DONT HAVE VALID PHONE NUMBER
    }

    @Given("user login movita page")
    public void user_login_movita_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("movita"));
    }

    @Then("user verifies NEDEN TAKİP SİSTEMİ text")
    public void userVerifiesNEDENTAKİPSİSTEMİText() {
        ReusableMethods.hover(movita.thirdSectionBody);
        String bodyText = movita.thirdSectionBody.getText();
        String takipText = movita.nedenTakipSistemi.getText();
        assertTrue(bodyText.contains(takipText));
    }

    @Then("user verifies TSE BELGELİ CİHAZLAR text")
    public void userVerifiesTSEBELGELİCİHAZLARText() {
        ReusableMethods.hover(movita.thirdSectionBody);
        String bodyText = movita.thirdSectionBody.getText();
        String tseText = movita.TSEBelgeseliCihazlar.getText();
        assertTrue(bodyText.contains(tseText));
    }

    @And("user verifies ÜCRETSİZ İNCELEYİN text")
    public void userVerifiesÜCRETSİZİNCELEYİNText() {
        // ReusableMethods.hover(movita2.ucretsizInceleyin);
        assertTrue(movita.ucretsizInceleyin.isEnabled());
    }

    @And("user verifies YAZILIM VE TEKNOLOJI GELISTIRME text")
    public void userVerifiesYAZILIMVETEKNOLOJIGELISTIRMEText() {
        assertTrue(movita.yazilimTeknGelistirme.isEnabled());
    }

    @Then("user verifies ARAC TAKİP SİSTEMİ text")
    public void userVerifiesARACTAKİPSİSTEMİText() {
        assertTrue(movita.aracTakipSistemi.isEnabled());
    }

    @Then("user verifies ÖNE ÇIKAN OZELLİKLERİMİZ text")
    public void userVerifiesÖNEÇIKANOZELLİKLERİMİZText() {
        assertTrue(movita.oneCikanOzellikler.isEnabled());
    }

    @And("user verifies KOLAY ERİSİM text")
    public void userVerifiesKOLAYERİSİMText() {
        assertTrue(movita.kolayErisim.isEnabled());
    }

    @Then("user verifies TEKNİK DESTEK text")
    public void userVerifiesTEKNİKDESTEKText() {
        assertTrue(movita.teknikDestek.isEnabled());
    }

    @Then("user verifies SEKTÖRLERE YÖNELİK COZUMLER text")
    public void userVerifiesSEKTÖRLEREYÖNELİKCOZUMLERText() {
        assertTrue(movita.sektorlereYonelik.isEnabled());
    }

    @Then("when user hovers over arrow sign,")
    public void whenUserHoversOverArrowSign() {
        ReusableMethods.hover(movita.thirdSectionBody);
        String firstcolor = movita.arrowsign.getCssValue("background-color");
        ReusableMethods.hover(movita.arrowsign);
        String secondColor = movita.arrowsign.getCssValue("background-color");
        System.out.println("firstcolor = " + firstcolor);
        System.out.println("secondColor = " + secondColor);
    }

    @And("background color of arrow returns from blue to grey")
    public void backgroundColorOfArrowReturnsFromBlueToGrey() {

    }

    @And("user clicks arrow button")
    public void userClicksArrowButton() {
        movita.arrowsign.click();
    }

    @Then("Tüm Sektörlere Hitap Eden Cozumler text is should be displayed")
    public void tümSektörlereHitapEdenCozumlerTextIsShouldBeDisplayed() {
        ReusableMethods.waitForVisibility(movita.tumSektorlerText, 10);
        assertTrue(movita.tumSektorlerText.isDisplayed());

    }

    @Given("kullanıcı movita sayfasına gider")
    public void kullanıcıMovitaSayfasınaGider() {
        Driver.getDriver().get("https://movita.com.tr/");
    }

    @And("kullanıcı movita losgosuna tıklar")
    public void kullanıcıMovitaLosgosunaTıklar() {
        movita.movitaLogo.click();
    }

    @Then("Mobil Vasita izleme takip Sistemi yazısı ekranda görünür")
    public void mobilVasitaIzlemeTakipSistemiYazısıEkrandaGörünür() {
        ReusableMethods.waitForVisibility(movita.mobilText, 2);
        Assert.assertTrue(movita.mobilText.isDisplayed());
    }

    @Given("user clicks on dropdown button")
    public void userClicksOnDropdownButton() {
        movita.dropdown.click();
    }

    @Then("English item is selected after clicking, text of Mobile Vehicle Tracking System should be displayed on the screen.")
    public void english_item_is_selected_after_clicking_text_of_mobile_vehicle_tracking_system_should_be_displayed_on_the_screen() {
        movita.eng.click();
        ReusableMethods.waitForVisibility(movita.engPano, 2);
        String expText = "Vehicle";
        String actText = movita.body.getText();
        Assert.assertTrue(actText.contains(expText));

    }

    @Then("Türkçe item is selected after clicking, text of Mobil Vasıta İzleme Takip Sistemi should be displayed")
    public void türkçe_item_is_selected_after_clicking_text_of_mobil_vasıta_i̇zleme_takip_sistemi_should_be_displayed() {
        movita.dropdown.click();
        movita.turk.click();
        ReusableMethods.waitFor(2);
        String expText = "Vasıta";
        String actText = movita.body.getText();
        Assert.assertTrue(actText.contains(expText));

    }

    @Given("user moves mouse cursor over  ROTA OPTİMİZASYONU")
    public void userMovesMouseCursorOverROTAOPTİMİZASYONU() {
        String ilkRenk = movita.rota.getCssValue("color");
        System.out.println("ilkRenk = " + ilkRenk);
        ReusableMethods.hover(movita.rota);
        String ikinciRenk = movita.rota.getCssValue("color");
        System.out.println("ikinciRenk = " + ikinciRenk);
        Assert.assertFalse(ilkRenk.equals(ikinciRenk));
    }

    @Then("The text color should change when the mouse cursor is on the  ROTA OPTİMİZASYONU")
    public void theTextColorShouldChangeWhenTheMouseCursorIsOnTheROTAOPTİMİZASYONU() {

    }

    @Then("user clicks on ROTA OPTİMİZASYONU")
    public void userClicksOnROTAOPTİMİZASYONU() {
        movita.rota.click();

    }

    @And("when ROTA OPTİMİZASYONU is clicked, the text of ROTA OPTİMİZASYONU should be displayed on the screen.")
    public void whenROTAOPTİMİZASYONUIsClickedTheTextOfROTAOPTİMİZASYONUShouldBeDisplayedOnTheScreen() {
        String rotaoptText = movita.rotaText.getText();
        Assert.assertTrue(movita.rotaText.isDisplayed());
    }

    @Given("Given user moves mouse cursor over  Uygulamalar OPTİMİZASYONU")
    public void givenUserMovesMouseCursorOverUygulamalarOPTİMİZASYONU() {
        String ilkRenk = movita.uygulamalar1.getCssValue("color");
        ReusableMethods.hover(movita.uygulamalar1);
        String ikinciRenk = movita.uygulamalar1.getCssValue("color");
        Assert.assertFalse(ilkRenk.equals(ikinciRenk));
    }

    @Then("The text color should change when the mouse cursor is on the Uygulamalar OPTİMİZASYONU")
    public void theTextColorShouldChangeWhenTheMouseCursorIsOnTheUygulamalarOPTİMİZASYONU() {

    }

    @Then("user clicks on Uygulamalar OPTİMİZASYONU")
    public void userClicksOnUygulamalarOPTİMİZASYONU() {
        movita.uygulamalar1.click();
    }

    @And("when Uygulamalar OPTİMİZASYONU is clicked, the text of Uygulamalar OPTİMİZASYONU should be displayed on the screen.")
    public void whenUygulamalarOPTİMİZASYONUIsClickedTheTextOfUygulamalarOPTİMİZASYONUShouldBeDisplayedOnTheScreen() {
        Assert.assertTrue(movita.uygulamalarText.isDisplayed());
    }

    @Given("Given user moves mouse cursor over  Kılavuz OPTİMİZASYONU")
    public void givenUserMovesMouseCursorOverKılavuzOPTİMİZASYONU() {
        String ilkRenk = movita.kilavuz1.getCssValue("color");
        ReusableMethods.hover(movita.kilavuz1);
        String ikinciRenk = movita.kilavuz1.getCssValue("color");
        Assert.assertFalse(ilkRenk.equals(ikinciRenk));
    }

    @Then("The text color should change when the mouse cursor is on the Kılavuz OPTİMİZASYONU")
    public void theTextColorShouldChangeWhenTheMouseCursorIsOnTheKılavuzOPTİMİZASYONU() {

    }

    @Then("user clicks on Kılavuz OPTİMİZASYONU")
    public void userClicksOnKılavuzOPTİMİZASYONU() {
        movita.kilavuz1.click();

    }

    @And("when Uygulamalar OPTİMİZASYONU is clicked, the text of Kılavuz OPTİMİZASYONU should be displayed on the screen.")
    public void whenUygulamalarOPTİMİZASYONUIsClickedTheTextOfKılavuzOPTİMİZASYONUShouldBeDisplayedOnTheScreen() {
        Assert.assertTrue(movita.kilavuzText.isDisplayed());
    }

    @Given("Given user moves mouse cursor over ILETISIM OPTİMİZASYONU")
    public void givenUserMovesMouseCursorOverILETISIMOPTİMİZASYONU() {
        String ilkRenk = movita.kilavuz1.getCssValue("color");
        ReusableMethods.hover(movita.iletisim1);
        String ikinciRenk = movita.iletisim1.getCssValue("color");
        Assert.assertFalse(ilkRenk.equals(ikinciRenk));
    }

    @Then("The text color should change when the mouse cursor is on the ILETISIM OPTİMİZASYONU")
    public void theTextColorShouldChangeWhenTheMouseCursorIsOnTheILETISIMOPTİMİZASYONU() {
    }

    @Then("user clicks on ILETISIM OPTİMİZASYONU")
    public void userClicksOnILETISIMOPTİMİZASYONU() {
        movita.iletisim1.click();
    }

    @And("when ILETISIM OPTİMİZASYONU is clicked, the text of ILETISIM OPTİMİZASYONU should be displayed on the screen.")
    public void whenILETISIMOPTİMİZASYONUIsClickedTheTextOfILETISIMOPTİMİZASYONUShouldBeDisplayedOnTheScreen() {
        Assert.assertTrue(movita.iletisim1.isDisplayed());
    }

    @Given("Given user moves mouse cursor over  GIRIS YAP OPTİMİZASYONU")
    public void givenUserMovesMouseCursorOverGIRISYAPOPTİMİZASYONU() {
        String ilkRenk = movita.girisYap1.getCssValue("color");
        ReusableMethods.hover(movita.girisYap1);
        String ikinciRenk = movita.girisYap1.getCssValue("color");
        Assert.assertFalse(ilkRenk.equals(ikinciRenk));
    }

    @Then("The text color should change when the mouse cursor is on the GIRIS YAP OPTİMİZASYONU")
    public void theTextColorShouldChangeWhenTheMouseCursorIsOnTheGIRISYAPOPTİMİZASYONU() {
    }

    @Then("user clicks on GIRIS YAP OPTİMİZASYONU")
    public void userClicksOnGIRISYAPOPTİMİZASYONU() {
        movita.girisYap1.click();
    }

    @And("when GIRIS YAP OPTİMİZASYONU is clicked, the text of Kılavuz OPTİMİZASYONU should be displayed on the screen.")
    public void whenGIRISYAPOPTİMİZASYONUIsClickedTheTextOfKılavuzOPTİMİZASYONUShouldBeDisplayedOnTheScreen() {
        String actText = movita.girisYapText.getText();
        String expText = "Giriş";
        Assert.assertTrue(actText.contains(expText));
    }

    @Then("Bayilik Basvurusuna hover over yapılır")
    public void bayilikBasvurusunaHoverOverYapılır() {
        String ilkRenk = movita.bayilik.getCssValue("color");
        ReusableMethods.hover(movita.bayilik);
        String ikiRenk = movita.body.getCssValue("color");
        System.out.println("ilkRenk = " + ilkRenk);
        System.out.println("ikiRenk = " + ikiRenk);
        Assert.assertFalse(ilkRenk.equals(ikiRenk));
    }

    @And("hover over yapılınca textin rengi değişir")
    public void hoverOverYapılıncaTextinRengiDeğişir() {
    }

    @Then("Bayilik Basvurusu tıklanır")
    public void bayilikBasvurusuTıklanır() {
        movita.bayilik.click();
    }

    @Then("ekranda Bayilik Başvuru yazısı görünür")
    public void ekrandaBayilikBaşvuruYazısıGörünür() {
        System.out.println("bayilikText = " + movita.bayilikText.getText());
        Assert.assertTrue(movita.bayilikText.isDisplayed());
    }

    @Then("Demo başvurusuna hover over yapılır ve renk değişikliği olmaz")
    public void demoBaşvurusunaHoverOverYapılırVeRenkDeğişikliğiOlmaz() {
        String ilkRenk = movita.demo.getCssValue("color");
        ReusableMethods.hover(movita.demo);
        String ikiRenk = movita.demo.getCssValue("color");
        System.out.println("ilkRenk = " + ilkRenk);
        System.out.println("ikiRenk = " + ikiRenk);
        Assert.assertTrue(ilkRenk.equals(ikiRenk));
    }

    @And("Demo Başvurusuna click yapılır")
    public void demoBaşvurusunaClickYapılır() {
        movita.demo.click();
    }

    @Then("Demo Başvuru yazısı ekranda görünür")
    public void demoBaşvuruYazısıEkrandaGörünür() {
        System.out.println("demmoText= " + movita.demmoText.getText());
        Assert.assertTrue(movita.demmoText.isDisplayed());
    }

    @Then("ARROW SIGN a hover over yapılır ve renk değişikliği olur")
    public void arrowSIGNAHoverOverYapılırVeRenkDeğişikliğiOlur() {
        ReusableMethods.hover(movita.demo);
        String ilkRenk = movita.arrow.getCssValue("background-color");
        ReusableMethods.hover(movita.arrow);
        String ikiRenk = movita.arrow.getCssValue("background-color");
        System.out.println("ilkRenk = " + ilkRenk);
        System.out.println("ikiRenk = " + ikiRenk);
        Assert.assertFalse(ilkRenk.equals(ikiRenk));
    }

    @And("ARROW SIGN a click yapılır")
    public void arrowSIGNAClickYapılır() {
        movita.arrow.click();
    }

    @Then("“Tüm Sektörlere Hitap Eden Cözümler yazısı ekranda görünür")
    public void tümSektörlereHitapEdenCözümlerYazısıEkrandaGörünür() {
        ReusableMethods.waitFor(9);
        System.out.println("arrowText = " + movita.arrowText.getText());
        Assert.assertTrue(movita.arrowText.isDisplayed());
    }

    @Then("user clicks firstGirisYap button")
    public void userClicksFirstGirisYapButton() {
        movita.firstGirisYap.click();
    }

    @Then("user enters username incorrectly")
    public void userEntersUsernameIncorrectly() {
        movita.username.sendKeys("sss");
    }

    @And("user enters password correctly")
    public void userEntersPasswordCorrectly() {
        movita.password.sendKeys("11921992");
    }

    @Then("user clicks secondGirisYap button")
    public void userClicksSecondGirisYapButton() {
        movita.secondGirisYap.click();
        ReusableMethods.waitFor(1);

    }

    @Then("user verifies that ‘Lütfen kullanıcı adınızı veya şifrenizi doğru girdiğinizden emin olunuz.’ text should be displayed")
    public void userVerifiesThatLütfenKullanıcıAdınızıVeyaŞifreniziDoğruGirdiğinizdenEminOlunuzTextShouldBeDisplayed() {

        String warning = movita.bodyLogin.getText();
        assertTrue(warning.contains("HATA!"));
    }

    @Then("user enters username {string} correctly")
    public void userEntersUsernameCorrectly(String username) {
        movita.username.sendKeys(username);
    }

    @And("user enters password {string} incorrectly")
    public void userEntersPasswordIncorrectly(String password) {
        movita.password.sendKeys(password);
    }

    @Then("user enters username {string} incorrectly")
    public void userEntersUsernameIncorrectly(String username) {
        movita.username.sendKeys(username);
    }

    @And("user enters password {string} incorrect")
    public void userEntersPasswordIncorrect(String password) {
        movita.password.sendKeys(password);
    }

    @And("user enters password correct")
    public void userEntersPasswordCorrect() {
        movita.password.sendKeys(ConfigurationReader.getProperty("ValidPassword"));
    }

    @Then("user enters username  correct")
    public void userEntersUsernameCorrect() {
        movita.username.sendKeys(ConfigurationReader.getProperty("ValidUserName"));
    }

    @Then("user should login website")
    public void userShouldLoginWebsite() {
        assertTrue(movita.demoLogo.isDisplayed());
    }

    @Then("user verifies Lütfen şifrenizi girdiğinizden emin olun! text is displayed")
    public void userVerifiesLütfenŞifreniziGirdiğinizdenEminOlunTextIsDisplayed() {
        assertTrue(movita.passwordWarning.isDisplayed());
    }

    @Then("user verifies Lütfen kullanıcı adınızı girdiğinizden emin olun! text is displayed")
    public void userVerifiesLütfenKullanıcıAdınızıGirdiğinizdenEminOlunTextIsDisplayed() {
        assertTrue(movita.usernameWarning.isDisplayed());
    }

    @Then("user clicks Şifrenizi mi unuttunuz? text")
    public void userClicksŞifreniziMiUnuttunuzText() {
        movita.sifrenimiUnuttun.click();
    }

    @Then("username box and telephone box should be enabled")
    public void usernameBoxAndTelephoneBoxShouldBeEnabled() {
        assertTrue(movita.usernameBox.isEnabled());
        assertTrue(movita.telephoneBox.isEnabled());
    }

    @And("Movita Şifre Yenileme text should be displayed")
    public void movitaŞifreYenilemeTextShouldBeDisplayed() {
        assertTrue(movita.sifreYenileme.isDisplayed());
    }

    @Then("Movita Logo should be displayed")
    public void movitaLogoShouldBeDisplayed() {
        assertTrue(movita.movitaLOGO.isDisplayed());
    }

    @Then("Blue colored Şifre Değiştir  button should be displayed")
    public void blueColoredŞifreDeğiştirButtonShouldBeDisplayed() {
        assertTrue(movita.sifreDegistir.isDisplayed());
    }

    @And("Giriş Ekranı link should be displayed")
    public void girişEkranıLinkShouldBeDisplayed() {
        assertTrue(movita.girisEkrani.isDisplayed());
    }

    @And("User hovers over Giriş Ekranı link")
    public void userHoversOverGirişEkranıLink() {
        // ReusableMethods.hover(movita.girisEkrani);
    }

    @Then("Color of  Giriş Ekranı link’s  text should be green from blue")
    public void colorOfGirişEkranıLinkSTextShouldBeGreenFromBlue() {
        //ReusableMethods.hover(movita.sifreDegistir);
        String firstColor = movita.girisEkrani.getCssValue("color");

        ReusableMethods.hover(movita.girisEkrani);
        String secondColor = movita.girisEkrani.getCssValue("color");
        System.out.println("firstColor = " + firstColor);
        System.out.println("secondColor = " + secondColor);
        assertFalse(firstColor.equals(secondColor));
    }

    @Then("user clicks Giriş Ekranı link")
    public void userClicksGirişEkranıLink() {
        movita.girisEkrani.click();
    }


    @Then("Anasayfaya don text is displayed")
    public void anasayfayaDonTextIsDisplayed() {
        String anasayfayadon = movita.anaSayfayaDon.getText();
        System.out.println("anasayfayadon = " + anasayfayadon);
        assertTrue(movita.anaSayfayaDon.isDisplayed());
    }

    @And("user clicks anasayfaya don button")
    public void userClicksAnasayfayaDonButton() {
        movita.anaSayfayaDon.click();
    }

    @Then("main page should be opened")
    public void mainPageShouldBeOpened() {
        assertTrue(movita.firstGirisYap.isDisplayed());
    }

    @And("Copyright © {int}{int}, Bütün Hakları Saklıdır. text is displayed")
    public void copyrightBütünHaklarıSaklıdırTextIsDisplayed(int arg0, int arg1) {
        ReusableMethods.hover(movita.copyrightText);
        System.out.println("movita.copyrightText.getText() = " + movita.copyrightText.getText());
        assertTrue(movita.copyrightText.isDisplayed());
    }

    @Then("user navigates to back for opening giris ekrani")
    public void userNavigatesToBackForOpeningGirisEkrani() {
        Driver.getDriver().navigate().to("https://movita.com.tr/recover_password");

    }

    @And("user clicks Giriş Ekranı link again")
    public void userClicksGirişEkranıLinkAgain() {
        movita.girisEkrani.click();
    }

    @Then("login page should be opened")
    public void loginPageShouldBeOpened() {

        assertTrue(movita.secondGirisYap.isDisplayed());
    }


    // Alkan Tuncer --- US_MAT-2 --- TC_MAT-44 to MAT-48
    @When("Movita Logo should be clickable")
    public void movitaLogoShouldBeClickable() {
        ReusableMethods.waitForClickablility(movita.movitaLogo, 5);
    }

    @Then("User click to logo")
    public void userClickToLogo() {
        ReusableMethods.waitForVisibility(movita.movitaLogo, 3).click();
    }

    @And("User verify Mobil Vasıta İzleme Takip Sistemi displayed")
    public void userVerifyMobilVasıtaİzlemeTakipSistemiDisplayed() {
        ReusableMethods.waitForVisibility(movita.mainTextTurkish, 3);
        Assert.assertTrue(movita.mainTextTurkish.isDisplayed());
    }

    @When("User hover over “ROTA OPTIMIZASYONU“")
    public void userHoverOverROTAOPTIMIZASYONU() {
        ReusableMethods.hover(movita.rotaOptimizasyonu);
    }

    @Then("“ROTA OPTIMIZASYONU“ should be clickable")
    public void rotaOPTIMIZASYONUShouldBeClickable() {
        ReusableMethods.waitForClickablility(movita.rotaOptimizasyonu, 2);
    }

    @Then("User verify “ROTA OPTIMIZASYONU“ text color change")
    public void userVerifyROTAOPTIMIZASYONUTextColorChange() {
        String s = movita.rotaOptimizasyonu.getCssValue("color");
        String c = Color.fromString(s).asHex();
        Assert.assertEquals("#00adee", c);
    }

    @And("Text shold be “ROTA OPTIMIZASYONU“")
    public void textSholdBeROTAOPTIMIZASYONU() {
        Assert.assertEquals("ROTA OPTIMIZASYONU", movita.rotaOptimizasyonu.getText());
    }

    @When("User hover over “UYGULAMALAR“")
    public void userHoverOverUYGULAMALAR() {
        ReusableMethods.hover(movita.uygulamalar);
    }

    @Then("“UYGULAMALAR“ should be clickable")
    public void uygulamalarShouldBeClickable() {
        ReusableMethods.waitForClickablility(movita.uygulamalar, 2);
    }

    @Then("User verify “UYGULAMALAR“ text color change")
    public void userVerifyUYGULAMALARTextColorChange() {
        String s = movita.uygulamalar.getCssValue("color");
        String c = Color.fromString(s).asHex();
        Assert.assertEquals("#00adee", c);
    }

    @And("Text shold be “UYGULAMALAR“")
    public void textSholdBeUYGULAMALAR() {
        Assert.assertEquals("UYGULAMALAR", movita.uygulamalar.getText());
    }

    @When("User hover over “KILAVUZ“")
    public void userHoverOverKILAVUZ() {
        ReusableMethods.hover(movita.kilavuz);
    }

    @Then("“KILAVUZ“ should be clickable")
    public void kilavuzShouldBeClickable() {
        ReusableMethods.waitForClickablility(movita.kilavuz, 2);
    }

    @Then("User verify “KILAVUZ“ text color change")
    public void userVerifyKILAVUZTextColorChange() {
        String s = movita.kilavuz.getCssValue("color");
        String c = Color.fromString(s).asHex();
        Assert.assertEquals("#00adee", c);
    }

    @And("Text shold be “KILAVUZ“")
    public void textSholdBeKILAVUZ() {
        Assert.assertEquals("KILAVUZ", movita.kilavuz.getText());
    }

    @When("User hover over “İLETİŞİM“")
    public void userHoverOverİLETİŞİM() {
        ReusableMethods.hover(movita.iletisim);
    }

    @Then("“İLETİŞİM“ should be clickable")
    public void i̇leti̇şi̇mShouldBeClickable() {
        ReusableMethods.waitForClickablility(movita.iletisim, 2);
    }

    @Then("User verify “İLETİŞİM“ text color change")
    public void userVerifyİLETİŞİMTextColorChange() {
        String s = movita.iletisim.getCssValue("color");
        String c = Color.fromString(s).asHex();
        Assert.assertEquals("#00adee", c);
    }

    @And("Text shold be “İLETİŞİM“")
    public void textSholdBeİLETİŞİM() {
        Assert.assertEquals("İLETİŞİM", movita.iletisim.getText());
    }

    @When("User hover over “GİRİŞ YAP“")
    public void userHoverOverGİRİŞYAP() {
        ReusableMethods.hover(movita.girisYap);
    }

    @Then("“GİRİŞ YAP“ should be clickable")
    public void gi̇ri̇şYAPShouldBeClickable() {
        ReusableMethods.waitForClickablility(movita.girisYap, 2);
    }

    @Then("User verify “GİRİŞ YAP“ text color change")
    public void userVerifyGİRİŞYAPTextColorChange() {
        String s = movita.girisYap.getCssValue("color");
        String c = Color.fromString(s).asHex();
        Assert.assertEquals("#00adee", c);
    }

    @And("Text shold be “GİRİŞ YAP“")
    public void textSholdBeGİRİŞYAP() {
        Assert.assertEquals("GİRİŞ YAP", movita.girisYap.getText());
    }

//------TC-128------

    @Then("User clicks girisYapFirst button")
    public void userClicksGirisYapFirstButton() {
        waitForVisibility(movita.girisYapFirst, 5000).click();
    }

    @Then("user enters the username and password")
    public void userEntersTheUsernameAndPassword() {
        waitForVisibility(movita.userName, 5000).sendKeys("demomovita");
        waitForVisibility(movita.password, 5000).sendKeys("movita1192");
    }

    @Then("User clicks girisYapSecond button")
    public void userClicksGirisYapSecondButton() {
        waitForVisibility(movita.girisYapSecond, 5).click();
    }

    @Then("user should be login main page")
    public void userShouldBeLoginMainPage() {
        Assert.assertTrue(waitForVisibility(movita.logoMainPage,2).isDisplayed());

    }

    @Then("menus available should display on the left side of the screen")
    public void menusAvailableShouldDisplayOnTheLeftSideOfTheScreen() {
        Assert.assertTrue(waitForVisibility(movita.allMenu,2).isDisplayed());
        System.out.println("AllMenu.getLocation() = " + movita.allMenu.getLocation());
    }

    @Then("map should display in the middle")
    public void mapShouldDisplayInTheMiddle() {
        Assert.assertTrue(waitForVisibility(movita.map,2).isDisplayed());
        System.out.println("Map.getLocation() = " + movita.map.getLocation());
    }

    @Then("summary information should display covering total vehicles")
    public void summaryInformationShouldDisplayCoveringTotalVehicles() {
        Assert.assertTrue(waitForVisibility(movita.vehicles,2).isDisplayed());
        System.out.println("Vehicles.getLocation() = " + movita.vehicles.getLocation());
    }

    @Then("Anasayfa \\(filo_admin) submenus should be opened")
    public void anasayfaFilo_adminSubmenusShouldBeOpened() {
        System.out.println("Anasayfa.getText() = " + movita.anasayfa.getText());
        Assert.assertTrue(waitForVisibility(movita.anasayfa,2).isDisplayed());
    }

    @And("Raporlar submenus should be opened")
    public void raporlarSubmenusShouldBeOpened() {
        System.out.println("Raporlar.getText() = " + movita.raporlar2.getText());
        Assert.assertTrue(waitForVisibility(movita.raporlar2,2).isDisplayed());


        waitForVisibility(movita.raporlar2, 2).click();
        Assert.assertTrue(waitForVisibility(movita.aracBazli,2).isDisplayed());
        Assert.assertTrue(waitForVisibility(movita.yakitBazli,2).isDisplayed());
        waitForVisibility(movita.raporlar2, 2).click();
    }

    @And("Araç Rota submenus should be opened")
    public void araçRotaSubmenusShouldBeOpened() {
        System.out.println("AracRota.getText() = " + movita.aracRota.getText());
        Assert.assertTrue(waitForVisibility(movita.aracRota,2).isDisplayed());

    }

    @And("Araç Video-Fotoğraf submenus should be opened")
    public void araçVideoFotoğrafSubmenusShouldBeOpened() {
        System.out.println("AracVideoFotograf.getText() = " + movita.aracVideoFotograf.getText());
        Assert.assertTrue(waitForVisibility(movita.aracVideoFotograf,2).isDisplayed());

    }

    @And("Güzergah İslemleri submenus should be opened")
    public void güzergahİslemleriSubmenusShouldBeOpened() {
        System.out.println("Guzergahİslemleri.getText() = " + movita.guzergahIslemleri.getText());
        Assert.assertTrue(waitForVisibility(movita.guzergahIslemleri,2).isDisplayed());

        waitForVisibility(movita.guzergahIslemleri, 2).click();
        Assert.assertTrue(waitForVisibility(movita.aracBazliGuzergah,2).isDisplayed());
        waitForVisibility(movita.guzergahIslemleri, 2).click();
    }

    @And("Alarm Islemleri submenus should be opened")
    public void alarmIslemleriSubmenusShouldBeOpened() {
        System.out.println("AlarmIslemleri.getText() = " + movita.alarmIslemleri.getText());
        Assert.assertTrue(waitForVisibility(movita.alarmIslemleri,2).isDisplayed());
    }

    @And("Rota islemleri submenus should be opened")
    public void rotaIslemleriSubmenusShouldBeOpened() {
        System.out.println("Rotaİslemleri.getText() = " + movita.rotaIslemleri.getText());
        Assert.assertTrue(waitForVisibility(movita.rotaIslemleri,2).isDisplayed());

        waitForVisibility(movita.rotaIslemleri, 2).click();
        Assert.assertTrue(waitForVisibility(movita.optimizasyon,2).isDisplayed());
        waitForVisibility(movita.rotaIslemleri, 2).click();
    }

    @And("Personel İslemleri submenus should be opened")
    public void personelİslemleriSubmenusShouldBeOpened() {
        System.out.println("Personelİslemleri.getText() = " + movita.personelIslemleri.getText());
        Assert.assertTrue(waitForVisibility(movita.personelIslemleri,2).isDisplayed());

        waitForVisibility(movita.personelIslemleri, 2).click();
        Assert.assertTrue(waitForVisibility(movita.personel,2).isDisplayed());
        waitForVisibility(movita.personelIslemleri, 2).click();
    }

    @And("Yönetim ve Ayarlar submenus should be opened")
    public void yönetimVeAyarlarSubmenusShouldBeOpened() {
        System.out.println("YonetimAyarlar.getText() = " + movita.yonetimAyarlar.getText());

        Assert.assertTrue(waitForVisibility(movita.yonetimAyarlar, 5).isDisplayed());

        movita.yonetimAyarlar.click();
        Assert.assertTrue(waitForVisibility(movita.grupYonetimi, 5).isDisplayed());
        Assert.assertTrue(waitForVisibility(movita.aracIslemleri, 5).isDisplayed());
        movita.yonetimAyarlar.click();
    }

    @When("User login the main page any main and or subcomponent should not be selected")
    public void userLoginTheMainPageAnyMainAndOrSubcomponentShouldNotBeSelected() {
        Assert.assertFalse("Sekme Seçili", movita.anasayfa.isSelected());
        Assert.assertFalse("Sekme Seçili", movita.raporlar2.isSelected());
        Assert.assertFalse("Sekme Seçili", movita.aracRota.isSelected());
        Assert.assertFalse("Sekme Seçili", movita.aracVideoFotograf.isSelected());
        Assert.assertFalse("Sekme Seçili", movita.guzergahIslemleri.isSelected());
        Assert.assertFalse("Sekme Seçili", movita.alarmIslemleri.isSelected());
        Assert.assertFalse("Sekme Seçili", movita.rotaIslemleri.isSelected());
        Assert.assertFalse("Sekme Seçili", movita.personelIslemleri.isSelected());
        Assert.assertFalse("Sekme Seçili", movita.yonetimAyarlar.isSelected());

    }



    @When("User hovers over the main components background color should change from white to gray")
    public void userHoversOverTheMainComponentsBackgroundColorShouldChangeFromWhiteToGray() {

        String ilkRenkZemin=movita.raporlar3.getCssValue("background-color");
        ReusableMethods.hover(movita.raporlar3);
        String ikinciRenkZemin=movita.raporlar3.getCssValue("background-color");
        Assert.assertFalse(ilkRenkZemin.equals(ikinciRenkZemin));

        System.out.println("-----Açılır menünün üstüne gelince zemin renginde değişim olması-----");
        System.out.println("ilkRenkZemin.asHex() = " + Color.fromString(ilkRenkZemin).asHex());
        System.out.println("ikinciRenkZemin.asHex() = " + Color.fromString(ikinciRenkZemin).asHex());

    }

    @When("User click the main components Openable component's background color remains grey, ana text color is not change")
    public void userClickTheMainComponentsOpenableComponentSBackgroundColorRemainsGreyAnaTextColorIsNotChange() {


        ReusableMethods.hover(movita.raporlar3);

        String ilkRenkMetin=movita.raporlar3.getCssValue("color");
        String ilkRenkZemin=movita.raporlar3.getCssValue("background-color");

        movita.raporlar3.click();

        String ikinciRenkMetin = movita.raporlar3.getCssValue("color");
        String ikinciRenkZemin = movita.raporlar3.getCssValue("background-color");

        Assert.assertTrue(ilkRenkMetin.equals(ikinciRenkMetin));

        System.out.println("-----Açılır menüye tıklayınca yazı renginde herhangi bir değişim olmaması-----");
        System.out.println("ilkRenkMetin.asHex() = " + Color.fromString(ilkRenkMetin).asHex());
        System.out.println("ikinciRenkMetin.asHex() = " + Color.fromString(ikinciRenkMetin).asHex());

        Assert.assertTrue(ilkRenkZemin.equals(ikinciRenkZemin));

        System.out.println("-----Açılır menüye tıklayınca zemin renginde herhangi bir değişim olmaması-----");
        System.out.println("ilkRenkZemin.asHex() = " + Color.fromString(ikinciRenkZemin).asHex());
        System.out.println("ikinciRenkZemin.asHex() = " + Color.fromString(ikinciRenkZemin).asHex());

        movita.raporlar3.click();

    }

    @When("User click the main components Not openable component's background color remains grey, but text color is change to blue")
    public void userClickTheMainComponentsNotOpenableComponentSBackgroundColorRemainsGreyButTextColorIsChangeToBlue() {

        waitFor(2);
        ReusableMethods.hover(movita.alarmIslemleri3);

        String ilkRenkZemin=movita.alarmIslemleri3.getCssValue("background-color");
        String ilkRenkMetin=movita.alarmIslemleri3.getCssValue("color");

        waitForVisibility(movita.alarmIslemleri3,2).click();
        waitFor(2);

        String ikinciRenkZemin=movita.alarmIslemleri3.getCssValue("background-color");
        String ikinciRenkMetin=movita.alarmIslemleri3.getCssValue("color");



        System.out.println("-----Açılır olmayan menüye tıklayınca zemin renginde değişim olmaması-----");
        System.out.println("ilkRenkZemin.asHex() = " + Color.fromString(ilkRenkZemin).asHex());
        System.out.println("ikinciRenkZemin.asHex() = " + Color.fromString(ikinciRenkZemin).asHex());

        System.out.println("-----Açılır olmayan menüye tıklayınca metin renginde değişim olması-----");
        System.out.println("ilkRenkMetin.asHex() = " + Color.fromString(ilkRenkMetin).asHex());
        System.out.println("ikinciRenkMetin.asHex() = " + Color.fromString(ikinciRenkMetin).asHex());

        Assert.assertTrue(ilkRenkZemin.equals(ikinciRenkZemin));
        Assert.assertFalse(ilkRenkMetin.equals(ikinciRenkMetin));

    }

    @When("User clicks on the Movita Logo User should reach the layout after logging into his account")
    public void userClicksOnTheMovitaLogoUserShouldReachTheLayoutAfterLoggingIntoHisAccount() {
        movita.movitaLogo2.click();
        Assert.assertTrue(waitForVisibility(movita.loginPageLayout,2).isDisplayed());
    }


    @Then("User should read {string} in the bottom footer of the screen.")
    public void userShouldReadInTheBottomFooterOfTheScreen(String arg0) {
        System.out.println("copyRight.getText() = " + movita.copyRight.getText());
        String actualText=movita.copyRight.getText();
        String expectedText="Copyright © 2017 - 2022 movita , Bütün Hakları Saklıdır.";
        Assert.assertTrue("Footer metni farklıdır",actualText.equals(expectedText));

    }

    //-----TC-125-----
    @Given("user hover over on menu item clicks on items in order user verifies the page")
    public void userHoverOverOnMenuItemClicksOnItemsInOrderUserVerifiesThePage() {
        Object array[][]={
                {movita.kurumsal, movita.hakkimizda, movita.textHakkimizda},
                {movita.kurumsal, movita.belgelerimiz, movita.textBelgelerimiz},
                {movita.kurumsal, movita.bayilikBasvuru, movita.textBayilikBasvuru},
                {movita.kurumsal, movita.demoBasvuru, movita.textDemoBasvuru},
                {movita.kurumsal, movita.cerezPolitikasi, movita.textCerezPolitikasi},
                {movita.kurumsal, movita.kvkk, movita.textKvkk},
                {movita.urunler, movita.mnvr, movita.textMnvr},
                {movita.urunler, movita.mnvrPro, movita.textMnvrPro},
                {movita.urunler, movita.aracTakipCihazi, movita.textAracTakipCihazi},
                {movita.urunler, movita.urunlerAltMenu, movita.textUrunlerAltMenu},
                {movita.urunler, movita.akilliDirekSistemi, movita.textAkilliDirekSistemi},
                {movita.cozumlerimiz, movita.taksiOzelArac, movita.textTaksiOzelArac},
                {movita.cozumlerimiz, movita.minibusMidibus, movita.textMinibusMidibus},
                {movita.cozumlerimiz, movita.sehirlerArasiOtobus, movita.textSehirlerArasiOtobus},
                {movita.cozumlerimiz, movita.zirhliTasimaAraclari, movita.textZirhliTasimaAraclari},
                {movita.cozumlerimiz, movita.okulServisleri, movita.textOkulServisleri},
                {movita.cozumlerimiz, movita.guvenlikKuvvetleriAraclari, movita.textGuvenlikKuvvetleriAraclari},
                {movita.cozumlerimiz, movita.yukVeEsyaTasiyanAraclar, movita.textYukVeEsyaTasiyanAraclar},
                {movita.cozumlerimiz, movita.belediyeVeHalkOtobusleri, movita.textBelediyeVeHalkOtobusleri}


        };

        for (Object[] e:array){

            ReusableMethods.hover((WebElement) e[0]);
            waitForClickablility((WebElement) e[1],3).click();
            Assert.assertTrue(((WebElement)e[2]).isDisplayed());

        }
    }

    @Then("user should see the expected Text")
    public void userShouldSeeTheExpectedText() {
        String actualText1=movita.textMNVR1.getText();
        String actualText2=movita.textMNVR2.getText();
        String expectedText1="Mobil Vasıta İzleme Takip Sistemi";
        String expectedText2="movita MNVR ile tüm araçları izleyip, takip edebilirisniz";
        Assert.assertTrue(expectedText1.equals(actualText1));
        Assert.assertTrue(expectedText2.equals(actualText2));
        System.out.println("actualText1 = " + actualText1);
        System.out.println("actualText2 = " + actualText2);


    }

    //-----SmokeTest_MAT-136_AlarmIslemleri-----

    @Then("User click to Alarm Islemleri")
    public void userClickToAlarmIslemleri() {

        waitForClickablility(movita.alarmIslemleri,2).click();

    }

    @Then("User should be on Alarm Listesi page")
    public void userShouldBeOnAlarmListesiPage() {
        Assert.assertEquals("http://movita.com.tr:9045/alarm-listesi", Driver.getDriver().getCurrentUrl());
    }

    //-----SmokeTest_MAT-136_RotaIslemleri-----

    @Then("User click to Rota Islemleri")
    public void userClickToRotaIslemleri() {
waitForClickablility(movita.rotaIslemleri,2).click();
    }

    @Then("User click to Optimizasyon")
    public void userClickToOptimizasyon() {
waitForClickablility(movita.optimizasyon,2).click();
    }

    @Then("User should be on Optimize Et page")
    public void userShouldBeOnOptimizeEtPage() {
        Assert.assertEquals("http://movita.com.tr:9045/rota-optimizasyonu-oto", Driver.getDriver().getCurrentUrl());
    }

    @Then("User click to Istasyon")
    public void userClickToIstasyon() {
waitForClickablility(movita.istasyonListesi,2).click();
    }

    @Then("User should be on Istasyon Listesi page")
    public void userShouldBeOnIstasyonListesiPage() {
        Assert.assertEquals("http://movita.com.tr:9045/istasyon-listesi", Driver.getDriver().getCurrentUrl());
    }

    @Then("User click to Durak")
    public void userClickToDurak() {
        waitForClickablility(movita.durakListesi,2).click();
    }

    @Then("User should be on Durak Listesi page")
    public void userShouldBeOnDurakListesiPage() {
        Assert.assertEquals("http://movita.com.tr:9045/durak-listesi", Driver.getDriver().getCurrentUrl());
    }


    // Alkan Tuncer - SmokeTest_US_MAT-137_TC_MAT-146

    @Then("User click to Personel Islemleri")
    public void userClickToPersonelIslemleri() {
        waitForVisibility(movita.personelIslemleri,2).click();
    }

    @Then("User click to Personel")
    public void userClickToPersonel() {
        waitForVisibility(movita.personel,2).click();
    }

    @Then("User should be on Personel Listesi page")
    public void userShouldBeOnPersonelListesiPage() {
        Assert.assertEquals("http://movita.com.tr:9045/personel-listesi",Driver.getDriver().getCurrentUrl());
    }

    @Then("User click to Is Atama")
    public void userClickToIsAtama() {
        waitForVisibility(movita.isAtama,2).click();
    }

    @Then("User should be on Is Atama page")
    public void userShouldBeOnIsAtamaPage() {
        Assert.assertEquals("http://movita.com.tr:9045/is-atama-listesi",Driver.getDriver().getCurrentUrl());
    }

    @Then("User click to Servis Islemleri")
    public void userClickToServisIslemleri() {
        waitForVisibility(movita.servisIslemleri,2).click();
    }

    @Then("User should be on Servis Islemleri page")
    public void userShouldBeOnServisIslemleriPage() {
        Assert.assertEquals("http://movita.com.tr:9045/servis-islemleri",Driver.getDriver().getCurrentUrl());
    }

    @Then("User click to Birim Listesi")
    public void userClickToBirimListesi() {
        waitForVisibility(movita.birimListesi,2).click();
    }

    @Then("User should be on Birim Listesi page")
    public void userShouldBeOnBirimListesiPage() {
        Assert.assertEquals("http://movita.com.tr:9045/birim-listesi",Driver.getDriver().getCurrentUrl());
    }

    @Then("User click to Personel Anket")
    public void userClickToPersonelAnket() {
        waitForVisibility(movita.personelAnket,2).click();
    }

    @Then("User should be on Personel Anket page")
    public void userShouldBeOnPersonelAnketPage() {
        Assert.assertEquals("http://movita.com.tr:9045/personel-anket-listesi",Driver.getDriver().getCurrentUrl());
    }

    @Then("User click to Personel Sikayet Talep")
    public void userClickToPersonelSikayetTalep() {
        waitForVisibility(movita.personelSikayetTalep,2).click();
    }

    @Then("User should be on Personel Sikayet Talep page")
    public void userShouldBeOnPersonelSikayetTalepPage() {
        Assert.assertEquals("http://movita.com.tr:9045/personel-talep-listesi",Driver.getDriver().getCurrentUrl());
    }

    //Murat YILMAZ  -   US_MAT-71_TC_MAT-102

    @And("User scroll down to seventh section")
    public void userScrollDownToSeventhSection() {
        ReusableMethods.hover(movita.adres);
    }

    @Then("User should see “Adres”, “Telefon”, and “email”")
    public void userShouldSeeAdresTelefonAndEmail() {
        Assert.assertTrue(movita.adres.isDisplayed());
        Assert.assertTrue(movita.telefon.isDisplayed());
        Assert.assertTrue(movita.eMail.isDisplayed());
    }

    @And("User verify the expected texts")
    public void userVerifyTheExpectedTexts() {
        String expectedText = movita.expectedText.getText();
        System.out.println("expectedText= " + movita.expectedText.getText());

        Assert.assertEquals(expectedText, "Adres:\n" +
                "Beştepe Mahallesi\n" +
                "Nergiz Sokak No:7/2 Via Flat\n" +
                "Yenimahalle/ANKARA\n" +
                "Telefon: + 90 (850) 557 7627\n" +
                "Email: bilgi@movita.com.tr");

    }


    //Murat YILMAZ  -   US_MAT103-TC-02_Seventh_section "POLITIKAMIZ" Verify

    @And("User should click “Mesafeli Satis Sözlesmesi”")
    public void userShouldClickMesafeliSatisSözlesmesi() {
        movita.mesafeliSatisSozlesmesi.click();
    }

    @Then("User should see “MESAFELI SATIŞ SÖZLEŞMESI“ text")
    public void userShouldSeeMESAFELISATIŞSÖZLEŞMESIText() {
        String actualMesSatSoz=movita.mesafeliSatisSozlesmesiText.getText();
        Assert.assertEquals("MESAFELI SATIŞ SÖZLEŞMESI",actualMesSatSoz);
    }

    @And("User should click “Gizlilik Politikasi”")
    public void userShouldClickGizlilikPolitikasi() {
        movita.gizlilikPolitikasi.click();
    }

    @Then("User should see “GİZLİLİK POLİTİKASI“ text")
    public void userShouldSeeGİZLİLİKPOLİTİKASIText() {
        String actualGizPol=movita.gizlilikPolitikasiText.getText();
        Assert.assertEquals("GİZLİLİK POLİTİKASI",actualGizPol);
    }

    @And("User should click “Ödeme ve Teslimat”")
    public void userShouldClickÖdemeVeTeslimat() {
        movita.odemeVeTeslimat.click();
    }

    @Then("User should see “ÖDEME VE TESLİMAT“ text")
    public void userShouldSeeÖDEMEVETESLİMATText() {
        String actualOdemeVeTes=movita.odemeVeTeslimatText.getText();
        Assert.assertEquals("ÖDEME VE TESLİMAT",actualOdemeVeTes);
    }

    @And("User should click “Garanti Sartlari”")
    public void userShouldClickGarantiSartlari() {
        movita.garantiSartlari.click();
    }

    @Then("User should see “GARANTİ ŞARTLARI“ text")
    public void userShouldSeeGARANTİŞARTLARIText() {
        String actualGarSartlari= movita.garantiSartlariText.getText();
        Assert.assertNotEquals("GARANTİ ŞARTLARI",actualGarSartlari);
    }

    @And("User should click “Iade Sartlari”")
    public void userShouldClickIadeSartlari() {
        movita.iadeSartlari.click();
    }

    @Then("User should see “ÜRÜNLER“ text")
    public void userShouldSeeÜRÜNLERText() {
        String actualUrunler=movita.urunlerText.getText();
        Assert.assertEquals("ÜRÜNLER",actualUrunler);
    }

    //Murat YILMAZ - US_MAT105-TC-03

    @And("User should click “Hakkimizda”")
    public void userShouldClickHakkimizda() {
        movita.hakkimizda2.click();
    }

    @Then("User should see “HAKKIMIZDA“ text")
    public void userShouldSeeHAKKIMIZDAText() {
        String actualHakkimizda=movita.hakkimizda2Text.getText();
        Assert.assertEquals("HAKKIMIZDA",actualHakkimizda);
    }

    @And("User should click “Belgelerimiz”")
    public void userShouldClickBelgelerimiz() {
movita.belgelerimiz2.click();
navigate_to_homepage();
    }

    @Then("User should see “BELGELERIMIZ“ text")
    public void userShouldSeeBELGELERIMIZText() {

    }

    @And("User should click “Bayilik Basvurusu”")
    public void userShouldClickBayilikBasvurusu() {
        movita.bayilikBasvurusu.click();
    }

    @Then("User should see “BAYILIK BAŞVURU“ text")
    public void userShouldSeeBAYILIKBAŞVURUText() {
        String actualBayilikBasvurusu=movita.bayilikBasvurusuText.getText();
        Assert.assertEquals("BAYILIK BAŞVURU",actualBayilikBasvurusu);
    }

    @And("User should click “Demo Basvurusu”")
    public void userShouldClickDemoBasvurusu() {
        movita.demoBasvurusu.click();
    }

    @Then("User should see “DEMO BAŞVURU“ text")
    public void userShouldSeeDEMOBAŞVURUText() {
        String actualDemoBasvurusu=movita.demoBasvurusuText.getText();
        Assert.assertEquals("DEMO BAŞVURU",actualDemoBasvurusu);
    }

    @And("User should click “Ürünler”")
    public void userShouldClickÜrünler() {
        movita.urunler2.click();

    }

    @And("User should click “Rota Optimizasyonu”")
    public void userShouldClickRotaOptimizasyonu() {
        movita.rotaOptimizasyonu2.click();
    }

    @Then("User should see “ROTA OPTIMIZASYONU“ text")
    public void userShouldSeeROTAOPTIMIZASYONUText() {
        String actualRotaOptimizasyonu=movita.rotaOptimizasyonu2Text.getText();
        Assert.assertEquals("ROTA OPTIMIZASYONU",actualRotaOptimizasyonu);
    }

    @And("User should click “Iletisim”")
    public void userShouldClickIletisim() {
        movita.iletisim2.click();
    }

    @Then("User should see “İADE ŞARTLARI“ text")
    public void userShouldSeeİADEŞARTLARIText() {
        String actualIadeSartlari=movita.iadeSartlariText.getText();
        Assert.assertEquals("İADE ŞARTLARI",actualIadeSartlari);
    }


}

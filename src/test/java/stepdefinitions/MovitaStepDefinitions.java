package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MovitaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class MovitaStepDefinitions {

    MovitaPage movita=new MovitaPage();

    @Given("User navigates to {string} page")
    public void user_navigates_to_page(String homePage) {
        Driver.getDriver().get(ConfigurationReader.getProperty(homePage));
    }
    @When("clicks on movita logo")
    public void clicks_on_movita_logo() {
       movita.movitaLogo.click();
    }

    @Then("User should navigate to homepage")
    public void user_should_navigate_to_homepage() {
      String expectedUrl="https://movita.com.tr/";
      String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("Urls are not matched.User can't navigate to homepage",expectedUrl,actualUrl);
    }
    @Then("Verify if Mobil Vasıta İzleme Takip Sistemi displayed")
    public void verify_if_mobil_vasıta_izleme_takip_sistemi_displayed() {
        ReusableMethods.waitForVisibility(movita.mainTextTurkish,3);
       Assert.assertTrue(movita.mainTextTurkish.isDisplayed());
    }
    @Given("user login movita page")
    public void user_login_movita_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("movita"));
    }

    @Then("user verifies NEDEN TAKİP SİSTEMİ text")
    public void userVerifiesNEDENTAKİPSİSTEMİText() {
        ReusableMethods.hover(movita.thirdSectionBody);
        String bodyText=movita.thirdSectionBody.getText();
        String takipText=movita.nedenTakipSistemi.getText();
        assertTrue(bodyText.contains(takipText));
    }

    @Then("user verifies TSE BELGELİ CİHAZLAR text")
    public void userVerifiesTSEBELGELİCİHAZLARText() {
        ReusableMethods.hover(movita.thirdSectionBody);
        String bodyText=movita.thirdSectionBody.getText();
        String tseText=movita.TSEBelgeseliCihazlar.getText();
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
        String firstcolor=movita.arrowsign.getCssValue("background-color");
        ReusableMethods.hover(movita.arrowsign);
        String secondColor=movita.arrowsign.getCssValue("background-color");
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
        ReusableMethods.waitForVisibility(movita.tumSektorlerText,10);
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
        ReusableMethods.waitForVisibility(movita.mobilText,2);
        Assert.assertTrue(movita.mobilText.isDisplayed());
    }

    @Given("user clicks on dropdown button")
    public void userClicksOnDropdownButton() {
        movita.dropdown.click();
    }
    @Then("English item is selected after clicking, text of Mobile Vehicle Tracking System should be displayed on the screen.")
    public void english_item_is_selected_after_clicking_text_of_mobile_vehicle_tracking_system_should_be_displayed_on_the_screen() {
        movita.eng.click();
        ReusableMethods.waitForVisibility(movita.engPano,2);
        String expText="Vehicle";
        String actText=movita.body.getText();
        Assert.assertTrue(actText.contains(expText));

    }

    @Then("Türkçe item is selected after clicking, text of Mobil Vasıta İzleme Takip Sistemi should be displayed")
    public void türkçe_item_is_selected_after_clicking_text_of_mobil_vasıta_i̇zleme_takip_sistemi_should_be_displayed() {
        movita.dropdown.click();
        movita.turk.click();
        ReusableMethods.waitFor(2);
        String expText="Vasıta";
        String actText=movita.body.getText();
        Assert.assertTrue(actText.contains(expText));

    }

    @Given("user moves mouse cursor over  ROTA OPTİMİZASYONU")
    public void userMovesMouseCursorOverROTAOPTİMİZASYONU() {
        String ilkRenk=movita.rota.getCssValue("color");
        System.out.println("ilkRenk = " + ilkRenk);
        ReusableMethods.hover(movita.rota);
        String ikinciRenk=movita.rota.getCssValue("color");
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
        String rotaoptText=movita.rotaText.getText();
        Assert.assertTrue(movita.rotaText.isDisplayed());
    }

    @Given("Given user moves mouse cursor over  Uygulamalar OPTİMİZASYONU")
    public void givenUserMovesMouseCursorOverUygulamalarOPTİMİZASYONU() {
        String ilkRenk=movita.uygulamalar.getCssValue("color");
        ReusableMethods.hover(movita.uygulamalar);
        String ikinciRenk=movita.uygulamalar.getCssValue("color");
        Assert.assertFalse(ilkRenk.equals(ikinciRenk));
    }

    @Then("The text color should change when the mouse cursor is on the Uygulamalar OPTİMİZASYONU")
    public void theTextColorShouldChangeWhenTheMouseCursorIsOnTheUygulamalarOPTİMİZASYONU() {

    }

    @Then("user clicks on Uygulamalar OPTİMİZASYONU")
    public void userClicksOnUygulamalarOPTİMİZASYONU() {
        movita.uygulamalar.click();
    }

    @And("when Uygulamalar OPTİMİZASYONU is clicked, the text of Uygulamalar OPTİMİZASYONU should be displayed on the screen.")
    public void whenUygulamalarOPTİMİZASYONUIsClickedTheTextOfUygulamalarOPTİMİZASYONUShouldBeDisplayedOnTheScreen() {
        Assert.assertTrue(movita.uygulamalarText.isDisplayed());
    }

    @Given("Given user moves mouse cursor over  Kılavuz OPTİMİZASYONU")
    public void givenUserMovesMouseCursorOverKılavuzOPTİMİZASYONU() {
        String ilkRenk=movita.kilavuz.getCssValue("color");
        ReusableMethods.hover(movita.kilavuz);
        String ikinciRenk=movita.kilavuz.getCssValue("color");
        Assert.assertFalse(ilkRenk.equals(ikinciRenk));
    }

    @Then("The text color should change when the mouse cursor is on the Kılavuz OPTİMİZASYONU")
    public void theTextColorShouldChangeWhenTheMouseCursorIsOnTheKılavuzOPTİMİZASYONU() {

    }

    @Then("user clicks on Kılavuz OPTİMİZASYONU")
    public void userClicksOnKılavuzOPTİMİZASYONU() {
        movita.kilavuz.click();

    }
    @And("when Uygulamalar OPTİMİZASYONU is clicked, the text of Kılavuz OPTİMİZASYONU should be displayed on the screen.")
    public void whenUygulamalarOPTİMİZASYONUIsClickedTheTextOfKılavuzOPTİMİZASYONUShouldBeDisplayedOnTheScreen() {
        Assert.assertTrue(movita.kilavuzText.isDisplayed());
    }

    @Given("Given user moves mouse cursor over ILETISIM OPTİMİZASYONU")
    public void givenUserMovesMouseCursorOverILETISIMOPTİMİZASYONU() {
        String ilkRenk=movita.kilavuz.getCssValue("color");
        ReusableMethods.hover(movita.iletisim);
        String ikinciRenk=movita.iletisim.getCssValue("color");
        Assert.assertFalse(ilkRenk.equals(ikinciRenk));
    }

    @Then("The text color should change when the mouse cursor is on the ILETISIM OPTİMİZASYONU")
    public void theTextColorShouldChangeWhenTheMouseCursorIsOnTheILETISIMOPTİMİZASYONU() {
    }

    @Then("user clicks on ILETISIM OPTİMİZASYONU")
    public void userClicksOnILETISIMOPTİMİZASYONU() {
        movita.iletisim.click();
    }

    @And("when ILETISIM OPTİMİZASYONU is clicked, the text of ILETISIM OPTİMİZASYONU should be displayed on the screen.")
    public void whenILETISIMOPTİMİZASYONUIsClickedTheTextOfILETISIMOPTİMİZASYONUShouldBeDisplayedOnTheScreen() {
        Assert.assertTrue(movita.iletisim.isDisplayed());
    }

    @Given("Given user moves mouse cursor over  GIRIS YAP OPTİMİZASYONU")
    public void givenUserMovesMouseCursorOverGIRISYAPOPTİMİZASYONU() {
        String ilkRenk=movita.girisYap.getCssValue("color");
        ReusableMethods.hover(movita.girisYap);
        String ikinciRenk=movita.girisYap.getCssValue("color");
        Assert.assertFalse(ilkRenk.equals(ikinciRenk));
    }

    @Then("The text color should change when the mouse cursor is on the GIRIS YAP OPTİMİZASYONU")
    public void theTextColorShouldChangeWhenTheMouseCursorIsOnTheGIRISYAPOPTİMİZASYONU() {
    }

    @Then("user clicks on GIRIS YAP OPTİMİZASYONU")
    public void userClicksOnGIRISYAPOPTİMİZASYONU() {
        movita.girisYap.click();
    }

    @And("when GIRIS YAP OPTİMİZASYONU is clicked, the text of Kılavuz OPTİMİZASYONU should be displayed on the screen.")
    public void whenGIRISYAPOPTİMİZASYONUIsClickedTheTextOfKılavuzOPTİMİZASYONUShouldBeDisplayedOnTheScreen() {
        String actText=movita.girisYapText.getText();
        String expText="Giriş";
        Assert.assertTrue(actText.contains(expText));
    }

    @Then("Bayilik Basvurusuna hover over yapılır")
    public void bayilikBasvurusunaHoverOverYapılır() {
        String ilkRenk=movita.bayilik.getCssValue("color");
        ReusableMethods.hover(movita.bayilik);
        String ikiRenk=movita.body.getCssValue("color");
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
        String ilkRenk=movita.demo.getCssValue("color");
        ReusableMethods.hover(movita.demo);
        String ikiRenk=movita.demo.getCssValue("color");
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
        String ilkRenk=movita.arrow.getCssValue("background-color");
        ReusableMethods.hover(movita.arrow);
        String ikiRenk=movita.arrow.getCssValue("background-color");
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

        String warning=movita.bodyLogin.getText();
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
        String firstColor=movita.girisEkrani.getCssValue("color");

        ReusableMethods.hover(movita.girisEkrani);
        String secondColor=movita.girisEkrani.getCssValue("color");
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
        String anasayfayadon=movita.anaSayfayaDon.getText();
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


}

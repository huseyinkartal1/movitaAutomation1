package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MovitaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;


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
    @Then("Verify the URL")
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
        String cozumlerOkulText=movita.cozumlerOkul.getText();
        Assert.assertEquals(cozumlerOkulText,"Okul Servis Araçları Takip Sistemi");
    }

    @Then("User should click6 {string}")
    public void user_should_click6(String string) {
        movita.cozumlerOkul.click();
    }

    @Then("User should see6 {string} text6")
    public void user_should_see6_text6(String okulServisAraclari) {
        movita.okulServisText.isDisplayed();
        String expOkulServisText=movita.okulServisText.getText();
        Assert.assertEquals(expOkulServisText,"OKUL SERVIS ARAÇLARI TAKIP SISTEMI");
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
        String cozumlerKameraliText=movita.cozumlerKamerali.getText();
        Assert.assertEquals(cozumlerKameraliText,"Kameralı Araç Takip Sistemi");
    }

    @Then("User should click7 {string}")
    public void user_should_click7(String string) {
        movita.cozumlerKamerali.click();
    }

    @Then("User should see7 {string} text7")
    public void user_should_see7_text7(String string) {
        movita.kameraliAracText.isDisplayed();
        String expKameraliAracText=movita.kameraliAracText.getText();
        Assert.assertEquals(expKameraliAracText,"KAMERALI ARAÇ TAKIP SISTEMI");
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
        String cozumlerKisiText=movita.cozumlerKisi.getText();
        Assert.assertEquals(cozumlerKisiText,"Kişi Bilgilendirme Sistemi");
    }

    @Then("User should click8 {string}")
    public void user_should_click8(String string) {
        movita.cozumlerKisi.click();
    }

    @Then("User should see8 {string} text8")
    public void user_should_see8_text8(String string) {
        movita.kisiBilgilendirmeText.isDisplayed();
        String expKisiBilgilendirmeText=movita.kisiBilgilendirmeText.getText();
        Assert.assertEquals(expKisiBilgilendirmeText,"KIŞI BILGILENDIRME SISTEMI");
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
        String cozumlerKisiVeNesneText=movita.cozumlerKisiVeNesne.getText();
        Assert.assertEquals(cozumlerKisiVeNesneText,"Kişi ve Nesne/Hayvan Takip Sistemi");
    }


    @Then("User should click9 {string}")
    public void user_should_click9(String string) {
        ReusableMethods.hover(movita.cozumlerKisiVeNesne);
        movita.cozumlerKisiVeNesne.click();
    }

    @Then("User should see9 {string} text9")
    public void user_should_see9_text9(String string) {
        movita.kisiVeNesneText.isDisplayed();
        String expKisiVeNesneText=movita.kisiVeNesneText.getText();
        Assert.assertEquals(expKisiVeNesneText,"KIŞI VE NESNE/HAYVAN TAKIP SISTEMI");
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
}

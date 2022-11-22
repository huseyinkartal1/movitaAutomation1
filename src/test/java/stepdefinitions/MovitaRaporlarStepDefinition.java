package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MovitaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;


import static org.junit.Assert.*;

import java.util.*;

public class MovitaRaporlarStepDefinition extends ReusableMethods {

    MovitaPage movita = new MovitaPage();


    /*
     *  huseyinKartal
     *  SmokeTest_US_MAT-127-Report_Modules
     * */
    @Given("user navigates to login page")
    public void userNavigatesToLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginPage"));
    }

    @When("user logins the page")
    public void userLoginsThePage() {
        movita.username.sendKeys(ConfigurationReader.getProperty("ValidUserName"), Keys.TAB, ConfigurationReader.getProperty("ValidPassword"), Keys.ENTER);
    }


    @And("click on Raporlar")
    public void clickOnRaporlar() {
        waitForVisibility(movita.menuRaporlar, 5).click();
    }

    @And("click on Araç Bazlı Rapor")
    public void clickOnAraçBazlıRapor() {
        waitForVisibility(movita.menuAracBazliRapor, 5).click();

    }

    @Then("click  on Rapor al")
    public void clickOnRaporAl() {
        String expectedURL = Driver.getDriver().getCurrentUrl();
        waitForVisibility(movita.menuRaporAlButton, 5).click();
        assertNotEquals(Driver.getDriver().getCurrentUrl(), expectedURL);
    }

    @And("click on Yakıt Entegrasyon Raporu")
    public void clickOnYakıtEntegrasyonRaporu() {
        waitForVisibility(movita.menuYakitEntegrasyonRaporu, 5).click();
    }


    @And("click on Günlük Seyehat")
    public void clickOnGünlükSeyehat() {
        waitForVisibility(movita.menuGunlukSeyahatRaporu, 5).click();
    }

    @And("click on Aktivite Detay Raporu")
    public void clickOnAktiviteDetayRaporu() {
        waitForVisibility(movita.menuAktiviteDetayRaporu, 5).click();
    }

    @And("click on Araç Karne")
    public void clickOnAraçKarne() {
        waitForVisibility(movita.menuAracKarneRaporu, 5).click();
    }

    @And("click on Filo Bazlı Rapor")
    public void clickOnFiloBazlıRapor() {
        waitForVisibility(movita.menuFiloBazliRapor, 5).click();
    }

    @And("click on Grup Bazlı Rapor")
    public void clickOnGrupBazlıRapor() {
        waitForVisibility(movita.menuGrupBazliRapor, 5).click();
    }

    @And("click on Alarm Log Raporu")
    public void clickOnAlarmLogRaporu() {
        waitForVisibility(movita.menuAlarmLogRaporu, 5).click();
    }

    @Then("click on Sorgula")
    public void clickOnSorgula() {
        waitForClickablility(movita.menuSorgulaButton, 5);
    }


    @And("click on Şoför Log Raporu")
    public void clickOnŞoförLogRaporu() {
        waitForVisibility(movita.menuSoforLogRaporu, 5).click();

    }

    @And("click on Sensör Raporu")
    public void clickOnSensörRaporu() {
        waitForVisibility(movita.menuSensorRaporu, 5).click();
    }
    /*  huseyinKartal
     *  SmokeTest_US_MAT-127-Report_Modules
     * END */


    /* hkartal
     * US_MAT-116_TC-MAT-T5_Detailed_Filtering_in_AracBazliRapor
     * */
    @Then("clicks on Baslangic Tarihi")
    public void clicksOnBaslangicTarihi() {
        waitForVisibility(movita.baslangicTarihi, 5).click();
    }

    @And("choose {int}{int}{int} from dropdown menu")
    public void chooseFromDropdownMenu(int arg0, int arg1, int arg2) {
        Select option1 = new Select(movita.selectYear1);
        option1.selectByValue("2021");
        Select option2 = new Select(movita.selectMonth1);
        option2.selectByValue("0");
        movita.firstDayOfTheMonth.click();
    }

    @And("click on Detayli Filtre")
    public void clickOnDetayliFiltre() {
        movita.detayliFiltre.click();
    }

    @Then("verify Tarih writing")
    public void verifyTarihWriting() {
        Assert.assertEquals(movita.tarihfilter.getText(),"Tarih");
    }

    @Then("verify Ise Baslama writing")
    public void verifyIseBaslamaWriting() {
        Assert.assertEquals(movita.iseBaslamaFilter.getText(),"İşe Başlama");

    }

    @Then("verify Is Bitis writing")
    public void verifyIsBitisWriting() {
        Assert.assertEquals(movita.isBitisFilter.getText(),"İş Bitiş");

    }

    @And("verify Tarih placeholder")
    public void verifyTarihPlaceholder() {

        String actualTarihPlaceHolder=movita.inputTarihFilter.getAttribute("placeholder");
        Assert.assertEquals(actualTarihPlaceHolder,"...");

    }

    @Then("verify Ise Baslama placeholder")
    public void verifyIseBaslamaPlaceholder() {
        String actualTarihPlaceHolder=movita.inputIseBaslamaFilter.getAttribute("placeholder");
        Assert.assertEquals(actualTarihPlaceHolder,"...");

    }

    @And("verify Is Bitis placeholder")
    public void verifyIsBitisPlaceholder() {
        String actualTarihPlaceHolder=movita.inputIsBitisFilter.getAttribute("placeholder");
        Assert.assertEquals(actualTarihPlaceHolder,"...");

    }

    @Given("user sends input as {string}")
    public void userSendsInputAs(String arg0) {
        movita.inputTarihFilter.clear();
        movita.inputTarihFilter.sendKeys(arg0);
    }

    @Then("user verifies {int} filtered result with date {string}")
    public void userVerifiesFilteredResultWithDate(int arg0, String arg1) {

        List<WebElement> element = Driver.getDriver().findElements(By.xpath(".//td[contains(text(),\""+arg1+"\")]/parent::tr"));
        waitForPageToLoad(1);
        assertEquals(arg0,element.size());
    }


    @Then("user verifies filtered result1")
    public void userVerifiesFilteredResult1() {
        assertEquals(1,movita.resultDate2022.size());
    }

    @Then("user verifies filtered result2")
    public void userVerifiesFilteredResult2() {
        assertEquals(7,movita.resultDate2021_11.size());
    }

    @Then("user verifies filtered result3")
    public void userVerifiesFilteredResult3() {
        assertEquals(1,movita.resultDate2021_11_05.size());
    }


    @And("user sends input as {string} to ise baslama")
    public void userSendsInputAsToIseBaslama(String arg0) {
        movita.inputIseBaslamaFilter.clear();
        movita.inputIseBaslamaFilter.sendKeys(arg0);

    }

    @Then("user verifies {int} filtered result with ise baslama {string}")
    public void userVerifiesResultFilteredResultWithIntoIseBaslama(int arg0, String arg1) {
      /*  List<WebElement> elements=Driver.getDriver().findElements(By.xpath(".//td[contains(text(),\"2021-11\")]/following-sibling::td[10 and contains(text(),\""+arg1+"\")]"));
        assertEquals(arg0, elements.size());*/

       // TODO: 22.11.2022 hkartal
      //  assertEquals(arg0, movita.resultDate2021_11.size());

    }



}

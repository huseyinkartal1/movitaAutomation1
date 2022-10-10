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

   //2.27 DEĞİŞİKLİK
}

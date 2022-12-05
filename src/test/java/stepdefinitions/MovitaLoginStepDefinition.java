package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.MovitaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;


import static org.junit.Assert.*;
import java.util.*;

public class MovitaLoginStepDefinition extends ReusableMethods {

    MovitaPage movita = new MovitaPage();

    // Alkan Tuncer Smoke Test_Login Function US_MAT-133_TC_MAT-141
    @Then("Enter username as {string} and password as {string}")
    public void enterUsernameAsAndPasswordAs(String username, String password) {
        movita.userName.sendKeys(ConfigurationReader.getProperty(username));
        movita.password.sendKeys(ConfigurationReader.getProperty(password));
    }

    @Then("User click to login button")
    public void userClickToLoginButton() {
        movita.loginGirisButton.click();
    }

    @Then("User must see their own dashboard")
    public void userMustSeeTheirOwnDashboard() {
        Assert.assertTrue(movita.raporlar.isDisplayed());
    }

}
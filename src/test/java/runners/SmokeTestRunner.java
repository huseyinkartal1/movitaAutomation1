package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        plugin={"html:target//Pcucumber-SmokeTestReport.html",
                "json:target/json-reports/SmokeTestReport.json",
                "junit:target/xml-report/SmokeTestReport.xml"},
        tags = "@smoketest",
        dryRun = false


)

public class SmokeTestRunner {

}

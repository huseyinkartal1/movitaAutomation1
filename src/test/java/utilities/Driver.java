package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){
            String browser=ConfigurationReader.getProperty("browser");
            switch (browser){
                case "chrome":
                    //System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
                    WebDriverManager.chromedriver().setup();



                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("headless");
                    options.addArguments("disable-gpu"); // applicable to windows os only
                    /*options.addArguments("--start-maximized"); // open Browser in maximized mode
                    options.addArguments("disable-infobars"); // disabling infobars
                    options.addArguments("--disable-extensions"); // disabling extensions

                    options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
                    options.addArguments("--no-sandbox"); // Bypass OS security model*/

                    driver = new ChromeDriver(options);

                    //driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "safari":
                    //WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;

            }
        }
        return driver;
    }

    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}

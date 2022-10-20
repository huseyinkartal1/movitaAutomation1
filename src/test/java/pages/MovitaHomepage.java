package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MovitaPage {

    public MovitaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[text()=\"Kurumsal\"]")
   public WebElement kurumsalMenu;

    @FindBy(xpath = "(//ul[@class=\"sub-menu-container\"])[1]")
    public List<WebElement> subKurumsalMenu;

    @FindBy (id = "logo")
    public WebElement movitaLogo;

    @FindBy(xpath = "//div[text()=\"Mobil Vasıta İzleme Takip Sistemi\"]")
    public WebElement mainTextTurkish;

    //-------------Cozumler-----------
//-------------Okul servis araclari----------

    @FindBy(xpath = "(//h4)[4]")
    public WebElement cozumlerOkul;

    @FindBy(xpath = "//h1")
    public WebElement okulServisText;

//-------------Kamerali arac takip sistemi-----------

    @FindBy(xpath = "(//h4)[5]")
    public WebElement cozumlerKamerali;

    @FindBy(xpath = "//h1")
    public WebElement kameraliAracText;

//-------------Kişi Bilgilendirme Sistemi-----------

    @FindBy(xpath = "(//h4)[6]")
    public WebElement cozumlerKisi;

    @FindBy(xpath = "//h1")
    public WebElement kisiBilgilendirmeText;

//-------------Kişi ve Nesne Sistemi-----------

    @FindBy(xpath = "//*[@id=\"post-list-footer\"]/div[4]/div/div/div/h4/a")
    public WebElement cozumlerKisiVeNesne;

    @FindBy(xpath = "//h1")
    public WebElement kisiVeNesneText;

}

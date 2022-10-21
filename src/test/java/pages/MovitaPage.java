package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MovitaPage {


 public void deneme(){

 }


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


 //---------Clickable Drowdown Language Menu---------------------
 @FindBy(xpath = "//*[@id=\"dropdownMenuButton\"]/img")
 public WebElement flag_up_right;
 @FindBy(xpath = "//*[@id=\"header-wrap\"]/div/div/div[3]/div/a[1]/img")
 public WebElement eng_Flag;
 @FindBy(xpath = "//*[@id=\"header-wrap\"]/div/div/div[3]/div/a[2]/img")
 public WebElement tr_Flag;
 @FindBy(xpath = "/html/body/div[1]/section[1]/div/div/div[1]/div/ul/li[1]/div[3]/div/div/div")
 public WebElement engWriting;
 @FindBy(xpath = "/html/body/div[1]/section[1]/div/div/div[1]/div/ul/li[1]/div[3]/div/div/div")
 public WebElement trWriting;

}

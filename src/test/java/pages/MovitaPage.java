package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MovitaPage {

//check it out
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

 // ---------------huseyinKartal ------------
 //--------------US_MAT11-TC_MAT100_Main Page First Section_Hover_Over_Menu----
 @FindBy(xpath = "//*[@id=\"header-wrap\"]/div/div/nav/ul/li[5]/a/div")
 public WebElement rotaOptimizasyonu;
 @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
 public WebElement rotaWriting;
 @FindBy(xpath = "//*[@id=\"header-wrap\"]/div/div/nav/ul/li[6]/a/div")
 public WebElement uygulamalar;
 @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
 public WebElement uygulamalarWriting;
 @FindBy(xpath = "//*[@id=\"header-wrap\"]/div/div/nav/ul/li[7]/a/div")
 public WebElement kilavuz;
 @FindBy(xpath = "//*[@id=\"myTab2\"]/li[2]/a")
 public WebElement kilavuzWriting;
 @FindBy(xpath = "//*[@id=\"header-wrap\"]/div/div/nav/ul/li[8]/a/div")
 public WebElement iletisim;
 @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
 public WebElement iletisimWriting;
 @FindBy(xpath = "//*[@id=\"header-wrap\"]/div/div/a/div")
 public WebElement girisYap;
 @FindBy(xpath = "//button[@type=\"submit\"]")
 public WebElement girisYapButton;

 // ---------------huseyinKartal ------------
 //--------------TC_MAT121_ForgotPassword

 @FindBy(xpath="//a[text()=\"Şifrenizi mi unuttunuz?\"]")
 public WebElement forgotPassword;

 @FindBy(xpath="//button[text()=\" Şifre Değiştir\"]")
 public WebElement changePassword;
 @FindBy(xpath="//li[text()=\"Lütfen kullanıcı adınızı girdiğinizden emin olun!\"]")
 public WebElement noneCredentials;

@FindBy(id="username")
 public WebElement userName;
@FindBy(id="telefon")
 public WebElement phoneNumber;

 @FindBy(xpath="//div[@class=\"toast-message\"]")
 public WebElement toastMessage;









}

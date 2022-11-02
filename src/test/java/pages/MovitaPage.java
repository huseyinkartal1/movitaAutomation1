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

 @FindBy(xpath = "//*[.=\"NEDEN TAKİP SİSTEMİ\"]")
 public WebElement nedenTakipSistemi;

 @FindBy(xpath = "//*[.=\"TSE BELGELİ CİHAZLAR\"]")
 public WebElement TSEBelgeseliCihazlar;

 @FindBy(xpath = "//*[.=\"ÜCRETSİZ İNCELEYİN\"]")
 public WebElement ucretsizInceleyin;

 @FindBy(xpath = "//*[.=\"Yazılım ve Teknoloji Geliştirme\"]")
 public WebElement yazilimTeknGelistirme;

 @FindBy(xpath = "//*[.=\"ARAÇ TAKİP SİSTEMİ\"]")
 public WebElement aracTakipSistemi;

 @FindBy(xpath = "//*[.=\"ÖNE ÇIKAN ÖZELLİKLERİMİZ\"]")
 public WebElement oneCikanOzellikler;

 @FindBy(xpath = "//*[.=\"KOLAY ERİŞİM\"]")
 public WebElement kolayErisim;

 @FindBy(xpath = "//*[.=\"TEKNİK DESTEK\"]")
 public WebElement teknikDestek;

 @FindBy(xpath = "//*[.=\"SEKTÖRLERE YÖNELİK ÇÖZÜMLER\"]")
 public WebElement sektorlereYonelik;

 @FindBy(xpath = "//div[@class=\"row justify-content-center col-mb-50\"]")
 public WebElement thirdSectionBody;

 @FindBy(xpath = "//div[@id=\"gotoTop\"]")
 public WebElement arrowsign;

 @FindBy(xpath = "(//*[.=\"Tüm Sektörlere Hitap Eden Çözümler\"])[3]")
 public WebElement tumSektorlerText;

 @FindBy(xpath = "(//div[@class=\"slotholder\"])[1]")
 public WebElement firstBody;

 @FindBy(xpath = "(//*[.=\"Mobil Vasıta İzleme Takip Sistemi\"])[4]")
 public WebElement mobilText;

 @FindBy(xpath = "//button[@id=\"dropdownMenuButton\"]")
 public WebElement dropdown;

 @FindBy(xpath = "(//a[@class=\"dropdown-item\"])[1]")
 public WebElement turk;

 @FindBy(xpath = "//a[@href=\"/index_en\"]")
 public WebElement eng;

 @FindBy(xpath = "//div[@class=\"rs-fullvideo-cover\"]")
 public WebElement engPano;

 @FindBy(xpath = "//div[@id=\"layer-730358461\"]")
 public WebElement engText;

 @FindBy(xpath = "(//a[@href=\"/rota_optimizasyonu\"])[1]")
 public WebElement rota;

 @FindBy(xpath = "(//div[@class=\"container clearfix\"])[1]")
 public WebElement rotaText;

 @FindBy(xpath = "//a[@href=\"/uygulamalar\"]")
 public WebElement uygulamalar;

 @FindBy(xpath = "(//div[@class=\"container clearfix\"])[1]")
 public WebElement uygulamalarText;

 @FindBy(xpath = "//a[@href=\"/guide\"]")
 public WebElement kilavuz;

 @FindBy(xpath = "//a[@href=\"#uygulama1\"]")
 public WebElement kilavuzText;

 @FindBy(xpath = "//a[@href=\"/iletisim\"]")
 public WebElement iletisim;

 @FindBy(xpath = "(//div[@class=\"container clearfix\"])[1]")
 public WebElement iletisimText;

 @FindBy(xpath = "//*[.=\"GİRİŞ Yap\"]")
 public WebElement girisYap;

 @FindBy(xpath = "//button[@type=\"submit\"]")
 public WebElement girisYapText;

 @FindBy(tagName = "body")
 public WebElement body;

 @FindBy(xpath = "(//a[@href=\"/bayi_basvuru\"])[2]")
 public WebElement bayilik;

 @FindBy(xpath = "(//*[.=\"Bayilik Başvuru\"])[1]")
 public WebElement bayilikText;

 @FindBy(xpath = "(//a[@href=\"/demo_basvuru\"])[2]")
 public WebElement demo;

 @FindBy(xpath = "(//*[.=\"Demo Başvuru\"])[1]")
 public WebElement demmoText;

 @FindBy(xpath = "//div[@id=\"gotoTop\"]")
 public WebElement arrow;

 @FindBy(xpath = "(//*[.=\"Tüm Sektörlere Hitap Eden Çözümler\"])[3]")
 public WebElement arrowText;

 @FindBy(xpath = "//*[.=\"GİRİŞ Yap\"]")
 public WebElement firstGirisYap;

 @FindBy(xpath = "//input[@id=\"username\"]")
 public WebElement username;

 @FindBy(xpath = "//input[@id=\"password\"]")
 public WebElement password;

 @FindBy(xpath = "//button[@type=\"submit\"]")
 public WebElement secondGirisYap;

 @FindBy(partialLinkText = "")
 public WebElement hataText;

 @FindBy(tagName = "body")
 public WebElement bodyLogin;

 @FindBy(xpath = "//img[@src=\"/images/profile_logo.png\"]")
 public WebElement demoLogo;

 @FindBy(xpath = "(//*[.=\"Lütfen şifrenizi girdiğinizden emin olun!\"])[1]")
 public WebElement passwordWarning;

 @FindBy(xpath = "(//*[.=\"Lütfen kullanıcı adınızı girdiğinizden emin olun!\"])[1]")
 public WebElement usernameWarning;

 @FindBy(xpath = "(//*[.=\"Şifrenizi mi unuttunuz?\"])[2]")
 public WebElement sifrenimiUnuttun;

 @FindBy(xpath = "//input[@id=\"username\"]")
 public WebElement usernameBox;

 @FindBy(xpath = "//input[@id=\"telefon\"]")
 public WebElement telephoneBox;

 @FindBy(xpath = "(//*[.=\"Movita Şifre Yenileme\"])[2]")
 public WebElement sifreYenileme;

 @FindBy(xpath = "(//img[@src=\"/images/icons/ic-logo.png\"])[2]")
 public WebElement movitaLOGO;

 @FindBy(xpath = "//button[@type=\"submit\"]")
 public WebElement sifreDegistir;

 @FindBy(xpath = "(//*[.=\"Giriş Ekranı\"])[2]")
 public WebElement girisEkrani;

 @FindBy(xpath = "(//a[@href=\"/\"])[2]")
 public WebElement anaSayfayaDon;

 @FindBy(xpath = "//div[@class=\"col-md-6 text-center text-md-start\"]")
 public WebElement copyrightText;

}

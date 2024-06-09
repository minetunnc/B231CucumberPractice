package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class AmazonPage {

    /*
     PageFactory.initElements(Driver.getDriver(),this); kodu bu classtaki ögeleri
     webdriver ile eslestirir, bu sayede classtaki webelemenetlere erismek icin @FindBy
     gibi PageFactory ye yardimci notasyonlar kullanilablir hale gelir
     */
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//*[.='Try different image']")
    public WebElement captchaHandling;

    public void handleCaptcha(){
        try{
            ReusableMethods.click(captchaHandling);
        }catch (Exception e){
            //captcha cikmamasi halinde NoSuchElementExceptionu ignore ettik
        }
    }







}

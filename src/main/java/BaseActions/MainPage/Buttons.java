package BaseActions.MainPage;

import BaseActions.OpenPage.Basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Buttons extends Basic {

    public Buttons(WebDriver driver) {
        super(driver);
    }
    private final By YoutubePic = By.cssSelector(".wd-100[alt='image']");
    private final By aboutus = By.xpath("//a[contains(text(), 'ABOUT US')]");
    private final By blog = By.xpath("//a[contains(text(), 'BLOG')]");
    private final By faq = By.xpath("//a[contains(text(), 'FAQ')]");
    private final By features = By.xpath("//a[contains(text(), 'FEATURES')]");
    private final By startforfree = By.xpath("//button[contains(text(), 'start for free ')]");
    private final By createacc = By.xpath("(//button[@type='button' and @class='dash dashLogin'])[1]");
    private final By createacc2 = By.xpath("(//button[@type='button' and @class='dash dashLogin'])[2]");
    private final By createmultLT = By.xpath("//a[contains(text(), ' Create multiple linktrees')]");
    private final By customdesign = By.xpath("//a[contains(text(), 'Custom Design')]");
    private final By seeLT = By.xpath("(//img[@src='cdn/img/New_linktree_tamplate_3.svg'])[2]");
    private final By LoginB = By.xpath("//button[contains(text(), 'LOGIN')]");
    private final By SignupB = By.xpath("//button[contains(text(), 'SIGN UP')]");

    public void clickYoutpic(){
        driver.findElement(YoutubePic).click();
    }
    public void ClickAboutus(){
        driver.findElement(aboutus).click();
    }
    public void Clickblog(){
        driver.findElement(blog).click();
    }
    public void Clickfaq(){
        driver.findElement(faq).click();
    }
    public void Clickfeatures(){
        driver.findElement(features).click();
    }
    public void Clickstartfree(){
        driver.findElement(startforfree).click();
    }
    public void Clickcreateacc(){
        driver.findElement(createacc).click();
    }
    public void Clickcreateacc2(){
        driver.findElement(createacc2).click();
    }
    public void ClickmultLT(){
        driver.findElement(createmultLT).click();
    }
    public void Clickcustomdes(){
        driver.findElement(customdesign).click();
    }
    public void ClickseeLT(){
        driver.findElement(seeLT).click();
    }
    public void ClickLigB(){
        driver.findElement(LoginB).click();
    }
    public void ClickSignB(){
        driver.findElement(SignupB).click();
    }
}

package BaseActions.Features;

import BaseActions.OpenPage.Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FeatButtons extends Basic {
    public FeatButtons(WebDriver driver) {
        super(driver);
    }
    private final By createmultTL = By.xpath("//a[contains(text(),' Create multiple linktrees')]");
    private final By customDes = By.xpath("//a[contains(text(),'Custom Design')]");
    private final By getbestLT = By.xpath("//a[contains(text(),'Get the best linktree by experts')]");
    private final By pinBest = By.xpath("//a[contains(text(),'Pin the best linktree ')]");
    private final By analytics = By.xpath("//a[contains(text(),'In-depth Analytics')]");
    private final By customurl = By.xpath("//a[contains(text(),'Custom URL ')]");
    private final By urlshorter = By.xpath("//a[contains(text(),'URL Shortner')]");
    private final By linklocker =  By.xpath("//a[contains(text(),'Link Locker')]");

    public void createmultTLClick(){
        driver.findElement(createmultTL).click();
    }
    public void customDesClick(){
        driver.findElement(customDes).click();
    }
    public void getbestLTClick(){
        driver.findElement(getbestLT).click();
    }
    public void pinBestClick(){
        driver.findElement(pinBest).click();
    }
    public void analyticsClick(){
        driver.findElement(analytics).click();
    }
    public void customurlClick(){
        driver.findElement(customurl).click();
    }
    public void urlshorterClick(){
        driver.findElement(urlshorter).click();
    }
    public void linklockerClick(){
        driver.findElement(linklocker).click();
    }
}

package BaseActions.Loginka;

import BaseActions.OpenPage.Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Common.Config.UName;
import static Common.Config.UPass;

public class LoginKa extends Basic {

    public LoginKa(WebDriver driver) {
        super(driver);
    }
    private final By Username = By.xpath("//input[@id='usernameID']");
    private final By Pass = By.xpath("//input[@id='passwordID']");
    private final By LogButton = By.xpath("//button[@id='signinID']");

    public LoginKa EnterLoginData(){
        driver.findElement(Username).sendKeys(UName);
        driver.findElement(Pass).sendKeys(UPass);
        driver.findElement(LogButton).click();
        return this;
    }
}

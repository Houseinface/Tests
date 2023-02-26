package BaseActions.OpenPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import static Const.Const.Timeouts.ConditionsWait;
import static org.testng.Assert.assertEquals;

public class Basic {

    protected WebDriver driver;

    public Basic(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url){
        driver.get(url);
    }

    public void WaitElement (String element){
        new WebDriverWait(driver, Duration.ofSeconds(ConditionsWait)).until(ExpectedConditions.presenceOfElementLocated((By.xpath(String.valueOf(element)))));
    }
    public void WaitElementCss(String element){
        new WebDriverWait(driver, Duration.ofSeconds(ConditionsWait)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(element)));
    }
    public void TabSwitch (){

        String currentTab = driver.getWindowHandle();

        Set<String> allTabs = driver.getWindowHandles();

        for (String tab : allTabs) {
            if (!tab.equals(currentTab)) {
                driver.switchTo().window(tab);
            }
        }
    }
    public void ReturnFirstTab(){
        String currentWindow = driver.getWindowHandle();

        driver.close();

        Set<String> windows = driver.getWindowHandles();

        for (String window : windows) {
            if (!window.equals(currentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }
    public Basic assertUrl(String url){
        String Url = driver.getCurrentUrl();
        assertEquals(Url, url);
        return this;
    }


    private final By profileIcon = By.cssSelector("#miniprofilepicID");
    private final By logOutB = By.xpath("//span[contains(text(),'Logout')]");
    private final By logOutBpopup = By.xpath("//button[contains(text(),'Logout')]");

    public void logOut() throws InterruptedException {
        open("https://meau.in/home");
        WaitElementCss("#miniprofilepicID");
        driver.findElement(profileIcon).click();
        driver.findElement(logOutB).click();
        WaitElement("//button[contains(text(),'Logout')]");
        driver.findElement(logOutBpopup).click();
        Thread.sleep(500);
    }
}

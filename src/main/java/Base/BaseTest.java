package Base;

import BaseActions.FAQ.FAQAsserts;
import BaseActions.FAQ.FAQButtons;
import BaseActions.Features.FeatButtons;
import BaseActions.HomeSearch.*;
import BaseActions.MainPage.AssertYouyubepopup;
import BaseActions.MainPage.Buttons;
import BaseActions.OpenPage.Basic;
import BaseActions.Loginka.LoginKa;
import Common.CommonCore;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import static Common.Config.Browser_Close;
import static Common.Config.ClearKookies;

public class BaseTest {

    protected WebDriver driver = CommonCore.createWebdriver();

    protected Basic basic = new Basic(driver);

    protected LoginKa loginka = new LoginKa(driver);

    protected HomeSearch homeSearch = new HomeSearch(driver);

    protected Asserts asserts = new Asserts(driver);
    protected Clicks clicks = new Clicks(driver);
    protected Buttons buttons = new Buttons(driver);
    protected AssertYouyubepopup assertYouyubepopup = new AssertYouyubepopup(driver);
    protected FeatButtons featButtons = new FeatButtons(driver);
    protected FAQButtons faqButtons = new FAQButtons(driver);
    protected FAQAsserts faqAsserts = new FAQAsserts(driver);

    @AfterTest
    public void ClearCookies() throws InterruptedException {
        if (ClearKookies){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }
    @AfterSuite
    public void quitB(){
        if (Browser_Close) {
            driver.quit();
        }
    }
}

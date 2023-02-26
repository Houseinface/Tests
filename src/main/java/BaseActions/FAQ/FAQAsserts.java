package BaseActions.FAQ;

import BaseActions.OpenPage.Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.*;

public class FAQAsserts extends Basic {
    public FAQAsserts(WebDriver driver) {
        super(driver);
    }
    private final By collapse1 = By.cssSelector("#collapseOne");
    private final By collapse2 = By.cssSelector("#collapseThree");

    public FAQAsserts collapse1Show() throws InterruptedException {
        WebElement collapse1Att = driver.findElement(collapse1);
        Thread.sleep(1000);
        assertTrue(collapse1Att.isDisplayed());
        return this;
    }
    public FAQAsserts collapse2Show() throws InterruptedException {
        WebElement collapse2Att = driver.findElement(collapse2);
        WebElement collapse1Att = driver.findElement(collapse1);
        Thread.sleep(1000);
        assertTrue(collapse2Att.isDisplayed());
        assertFalse(collapse1Att.isDisplayed());
        return this;

    }
}

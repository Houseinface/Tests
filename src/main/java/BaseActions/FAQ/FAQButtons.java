package BaseActions.FAQ;

import BaseActions.OpenPage.Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FAQButtons extends Basic {
    public FAQButtons(WebDriver driver) {
        super(driver);
    }
    private final By firstbox = By.cssSelector("[data-target='#collapseOne']");
    private final By secondbox = By.cssSelector("[data-target='#collapseThree']");

    public void firstboxclick(){
        driver.findElement(firstbox).click();
    }
    public void secondboxclick(){
        driver.findElement(secondbox).click();
    }
}

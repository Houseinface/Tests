package BaseActions.MainPage;

import BaseActions.OpenPage.Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

public class AssertYouyubepopup extends Basic {
    public AssertYouyubepopup(WebDriver driver) {
        super(driver);
    }

    private final By youpopup = By.cssSelector("#iframeYouTubeVideoFile");
    public void YoutpopDisplayed(){
        WebElement Ypop = driver.findElement(youpopup);
        assertTrue(Ypop.isDisplayed());
    }
}

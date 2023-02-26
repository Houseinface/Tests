package BaseActions.HomeSearch;

import BaseActions.OpenPage.Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.*;

public class Asserts extends Basic {

    public Asserts(WebDriver driver) {
        super(driver);
    }
    private final By Loader = By.cssSelector("#loader");
    private final By NotFText = By.xpath("//h3[text()=' No linktree found']");
    private final By bigImage = By.id("popupImageID");
    private final By sharePop = By.id("homeLinktreeSharePopup");
    private final By BookMclicked = By.cssSelector(".save-link-tree[data-value='3493']");
    private final By DialogDelBook = By.cssSelector("[role='dialog']");
    private final By Vievscounter = By.cssSelector("div[class='linktree-views']>div");

    public Asserts AssertSpinner(){
        WebElement loader = driver.findElement(Loader);
        assertTrue(loader.isDisplayed());
        return this;
    }
    public Asserts AssertNotFound(){
        WebElement NotF = driver.findElement(NotFText);
        String NotFound = NotF.getText();
        assertEquals(NotFound, "No linktree found");
        return this;
    }
    public Asserts AssertIconBigImage(){
        WebElement image = driver.findElement(bigImage);
        assertTrue(image.isDisplayed());
        return this;
    }
    public Asserts sharepopupVisible(){
        WebElement sharebox = driver.findElement(sharePop);
        assertTrue(sharebox.isDisplayed());
        return this;
    }
    public Asserts BookClicked(){
        WebElement bookclicked = driver.findElement(BookMclicked);
        assertTrue(bookclicked.isDisplayed());
        return this;
    }
    public Asserts BookDealog(){
        WebElement bookdealog = driver.findElement(DialogDelBook);
        assertTrue(bookdealog.isDisplayed());
        return this;
    }
    public String vievcounterAtt(){
        String counterAtt = driver.findElement(Vievscounter).getAttribute("innerText");
        return counterAtt;
    }
    public Asserts AttplusOne(String element){
        String newCounter =driver.findElement(Vievscounter).getAttribute("innerText");
        assertNotEquals(element, newCounter);
        return this;
    }
}

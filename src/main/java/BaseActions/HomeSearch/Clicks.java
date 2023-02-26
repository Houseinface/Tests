package BaseActions.HomeSearch;

import BaseActions.OpenPage.Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Clicks extends Basic {
    public Clicks(WebDriver driver) {
        super(driver);
    }
    private final By creator = By.xpath("//span[contains(text(),'houseinface')]");
    private final By icon = By.xpath("//img[@class='userImageClass timelineProfile']");
    private final By linkName = By.cssSelector("a[href='https://meau.in/dimastest1']");
    private final By shareButton = By.cssSelector(".shareTimeLineLinkTree[data-value='3493']");
    private final By BookCl = By.cssSelector(".linktreeBookmarkClass.save-link-tree[data-value='3493']");
    private final By BookClicked = By.cssSelector(".save-link-tree");
    private final By bookclickedlist = By.cssSelector(".linktreeBookmarkClass");
    private final By DelBookPopupYes = By.cssSelector(".swal2-confirm.swal2-styled");



    public void clickOncreator(){
        driver.findElement(creator).click();
    }
    public void ClickOnIcon() {
        driver.findElement(icon).click();
    }
    public void ClickonName(){
        driver.findElement(linkName).click();
    }
    public void shareclick(){
        driver.findElement(shareButton).click();
    }
    public void BookMClick(){
        driver.findElement(BookCl).click();
    }
    public void bookclicked(){
        driver.findElement(BookClicked).click();
    }
    public void bookclickedlistClick(){
        driver.findElement(bookclickedlist).click();
    }
    public void delpopupyes(){
        driver.findElement(DelBookPopupYes).click();
    }
}

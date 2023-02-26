package BaseActions.HomeSearch;

import BaseActions.OpenPage.Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeSearch extends Basic {

    public HomeSearch(WebDriver driver) {
        super(driver);
    }
    private final By SearchBox = By.xpath("//input[@id='linkTreeSearchBox']");
    private final By SearchButton = By.xpath("//button[@id='searchLinktreeTimeline']");


    public void searchSomething (String searchText) throws InterruptedException {
        driver.findElement(SearchBox).sendKeys(searchText);
        Thread.sleep(1000);
        driver.findElement(SearchButton).click();
    }
}

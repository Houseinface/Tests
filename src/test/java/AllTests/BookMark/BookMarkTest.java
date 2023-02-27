package AllTests.BookMark;

import Base.BaseTest;
import org.testng.annotations.Test;

public class BookMarkTest extends BaseTest {

    @Test
    public void BookmarkClick() throws InterruptedException {
        basic.open("https://meau.in/signup");
        basic.WaitElement("//input[@id='usernameID']");
        loginka.EnterLoginData();
        basic.WaitElement("//span[@id='leftNav-dashboard-text']");

        basic.open("https://meau.in/home");
        homeSearch.searchSomething("test1");
        Thread.sleep(1000);
        clicks.BookMClick();
        Thread.sleep(1000);
        asserts.BookClicked();
        clicks.bookclicked();
        asserts.BookDealog();
    }
}

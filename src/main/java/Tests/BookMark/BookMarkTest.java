package Tests.BookMark;

import Base.BaseTest;
import org.testng.annotations.AfterTest;
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
    @Test(priority = 2)
    public void BookmarkClickPostCond() throws InterruptedException {
        basic.open("https://meau.in/saved-linktrees");
        basic.WaitElementCss(".linktreeBookmarkClass");
        clicks.bookclickedlistClick();
        basic.WaitElementCss(".swal2-confirm.swal2-styled");
        clicks.delpopupyes();

        basic.logOut();
    }
}

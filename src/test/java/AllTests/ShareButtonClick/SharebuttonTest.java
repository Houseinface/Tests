package AllTests.ShareButtonClick;

import Base.BaseTest;
import org.testng.annotations.Test;

public class SharebuttonTest extends BaseTest {
    @Test
    public void Shareclick() throws InterruptedException {
        basic.open("https://meau.in/signup");
        basic.WaitElement("//input[@id='usernameID']");
        loginka.EnterLoginData();
        basic.WaitElement("//span[@id='leftNav-dashboard-text']");
        basic.open("https://meau.in/home");
        homeSearch.searchSomething("test1");
        Thread.sleep(2000);
        clicks.shareclick();
        asserts.sharepopupVisible();

        basic.logOut();
    }
}
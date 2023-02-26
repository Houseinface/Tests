package Tests.AllTests.IconClick;

import Base.BaseTest;
import org.testng.annotations.Test;

public class IconClickTest extends BaseTest {
    @Test
    public void IconT () throws InterruptedException {
        basic.open("https://meau.in/signup");
        basic.WaitElement("//input[@id='usernameID']");
        loginka.EnterLoginData();
        basic.WaitElement("//span[@id='leftNav-dashboard-text']");
        basic.open("https://meau.in/home");
        homeSearch.searchSomething("test");
        Thread.sleep(2000);
        clicks.ClickOnIcon();
        asserts.AssertIconBigImage();

        basic.logOut();
    }
}

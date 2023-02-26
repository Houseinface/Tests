package Tests.CreatorClick;

import Base.BaseTest;
import org.testng.annotations.Test;

public class CreatorUrlTest extends BaseTest {

    @Test
    public void CreatorLink() throws InterruptedException {
        basic.open("https://meau.in/signup");
        basic.WaitElement("//input[@id='usernameID']");
        loginka.EnterLoginData();
        basic.WaitElement("//span[@id='leftNav-dashboard-text']");
        basic.open("https://meau.in/home");
        homeSearch.searchSomething("test1");
        Thread.sleep(2000);
        clicks.clickOncreator();
        basic.TabSwitch();
        asserts.assertUrl("https://meau.in/usercontributor/houseinface");
        basic.ReturnFirstTab();

        basic.logOut();
    }
}

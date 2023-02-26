package AllTests.NameClick;

import Base.BaseTest;
import org.testng.annotations.Test;

public class NameClickTest extends BaseTest {

    @Test
    public void namelink() throws InterruptedException {
        basic.open("https://meau.in/signup");
        basic.WaitElement("//input[@id='usernameID']");
        loginka.EnterLoginData();
        basic.WaitElement("//span[@id='leftNav-dashboard-text']");
        basic.open("https://meau.in/home");
        homeSearch.searchSomething("test1");
        Thread.sleep(2000);
        clicks.ClickonName();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/dimastest1");
        basic.ReturnFirstTab();

        basic.logOut();
    }
}

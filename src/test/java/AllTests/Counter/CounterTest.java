package AllTests.Counter;

import Base.BaseTest;
import org.testng.annotations.Test;

public class CounterTest extends BaseTest {

    @Test
    public void counterTest() throws InterruptedException {
        basic.open("https://meau.in/signup");
        basic.WaitElement("//input[@id='usernameID']");
        loginka.EnterLoginData();
        basic.WaitElement("//span[@id='leftNav-dashboard-text']");

        basic.open("https://meau.in/home");
        homeSearch.searchSomething("test1");
        Thread.sleep(2000);
        String attrib = asserts.vievcounterAtt();
        clicks.ClickonName();

        basic.TabSwitch();
        Thread.sleep(2000);
        basic.ReturnFirstTab();

        basic.open("https://meau.in/home");
        homeSearch.searchSomething("test1");
        Thread.sleep(2000);
        asserts.AttplusOne(attrib);
    }
}

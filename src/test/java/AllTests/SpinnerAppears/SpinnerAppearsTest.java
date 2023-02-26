package AllTests.SpinnerAppears;

import Base.BaseTest;
import org.testng.annotations.Test;


public class SpinnerAppearsTest extends BaseTest {

    @Test
    public void SpinTest () throws InterruptedException {
        basic.open("https://meau.in/signup");
        basic.WaitElement("//input[@id='usernameID']");
        loginka.EnterLoginData();
        basic.WaitElement("//span[@id='leftNav-dashboard-text']");
        basic.open("https://meau.in/home");
        homeSearch.searchSomething("test");
        asserts.AssertSpinner();

        basic.logOut();
    }
}

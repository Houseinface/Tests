package Tests.SearchResults;

import Base.BaseTest;
import org.testng.annotations.Test;

public class SearchNotFoundTest extends BaseTest {
    @Test
    public void NotFoundTest () throws InterruptedException {
        basic.open("https://meau.in/signup");
        basic.WaitElement("//input[@id='usernameID']");
        loginka.EnterLoginData();
        basic.WaitElement("//span[@id='leftNav-dashboard-text']");
        basic.open("https://meau.in/home");
        homeSearch.searchSomething("ddrrdrdyy");
        asserts.AssertNotFound();

        basic.logOut();
    }
}

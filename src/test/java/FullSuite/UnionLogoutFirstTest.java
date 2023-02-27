package FullSuite;

import Base.BaseTest;
import org.testng.annotations.Test;

public class UnionLogoutFirstTest extends BaseTest {
    @Test(priority = 1)
    public void BookmarkClick() throws InterruptedException {
        try {
            basic.logOut();
        } catch (AssertionError | Exception ignored) {
        }
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
    @Test(priority = 3)
    public void counterTest() throws InterruptedException {
        try {
            basic.logOut();
        } catch (AssertionError | Exception ignored) {
        }
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
    @Test(priority = 3)
    public void CreatorLink() throws InterruptedException {
        try {
            basic.logOut();
        } catch (AssertionError | Exception ignored) {
        }
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

    }
    @Test(priority = 3)
    public void boxestest() throws InterruptedException {
        try {
            basic.logOut();
        } catch (AssertionError | Exception ignored) {
        }
        basic.open("https://meau.in/faq");
        basic.WaitElementCss("[data-target='#collapseOne']");
        faqButtons.firstboxclick();
        Thread.sleep(1000);
        faqAsserts.collapse1Show();

        faqButtons.secondboxclick();
        Thread.sleep(1000);
        faqAsserts.collapse2Show();
    }
    @Test(priority = 3)
    public void featureslinks(){
        try {
            basic.logOut();
        } catch (AssertionError | Exception ignored) {
        }
        basic.open("https://meau.in/features");
        featButtons.createmultTLClick();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/signup");
        basic.ReturnFirstTab();

        featButtons.customDesClick();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/signup");
        basic.ReturnFirstTab();

        featButtons.getbestLTClick();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/signup");
        basic.ReturnFirstTab();

        featButtons.pinBestClick();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/signup");
        basic.ReturnFirstTab();

        featButtons.analyticsClick();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/signup");
        basic.ReturnFirstTab();

        featButtons.customurlClick();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/signup");
        basic.ReturnFirstTab();

        featButtons.urlshorterClick();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/signup");
        basic.ReturnFirstTab();

        featButtons.linklockerClick();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/signup");
        basic.ReturnFirstTab();
    }
    @Test(priority = 3)
    public void featureslinksLogined() {
        try {
            basic.logOut();
        } catch (AssertionError | Exception ignored) {
        }
        basic.open("https://meau.in/signup");
        loginka.EnterLoginData();
        basic.WaitElement("//span[@id='leftNav-dashboard-text']");

        basic.open("https://meau.in/features");
        featButtons.createmultTLClick();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/linktree");
        basic.ReturnFirstTab();

        featButtons.customDesClick();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/linktree");
        basic.ReturnFirstTab();

        featButtons.getbestLTClick();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/home");
        basic.ReturnFirstTab();

        featButtons.pinBestClick();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/home");
        basic.ReturnFirstTab();

        featButtons.analyticsClick();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/linktree");
        basic.ReturnFirstTab();

        featButtons.customurlClick();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/linktree");
        basic.ReturnFirstTab();

        featButtons.urlshorterClick();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/add-on-features#usershorturl");
        basic.ReturnFirstTab();

        featButtons.linklockerClick();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/add-on-features#linkslocker");
        basic.ReturnFirstTab();

    }
    @Test(priority = 3)
    public void IconT () throws InterruptedException {
        try {
            basic.logOut();
        } catch (AssertionError | Exception ignored) {
        }
        basic.open("https://meau.in/signup");
        basic.WaitElement("//input[@id='usernameID']");
        loginka.EnterLoginData();
        basic.WaitElement("//span[@id='leftNav-dashboard-text']");
        basic.open("https://meau.in/home");
        homeSearch.searchSomething("test");
        Thread.sleep(2000);
        clicks.ClickOnIcon();
        asserts.AssertIconBigImage();

    }
    @Test(priority = 3)
    public void MainPlinks() {
        try {
            basic.logOut();
        } catch (AssertionError | Exception ignored) {
        }
        basic.open("https://meau.in");
        buttons.clickYoutpic();
        basic.WaitElementCss("#iframeYouTubeVideoFile");
        assertYouyubepopup.YoutpopDisplayed();

        basic.open("https://meau.in");
        buttons.ClickAboutus();
        basic.assertUrl("https://meau.in/about-us");

        basic.open("https://meau.in");
        buttons.Clickblog();
        basic.assertUrl("https://meau.in/blog/");

        basic.open("https://meau.in");
        buttons.Clickfeatures();
        basic.assertUrl("https://meau.in/features");

        basic.open("https://meau.in");
        buttons.Clickfaq();
        basic.assertUrl("https://meau.in/faq");

        basic.open("https://meau.in");
        buttons.Clickcreateacc();
        basic.assertUrl("https://meau.in/signup#signup");

        basic.open("https://meau.in");
        buttons.Clickcreateacc2();
        basic.assertUrl("https://meau.in/signup#signup");

        basic.open("https://meau.in");
        buttons.Clickstartfree();
        basic.assertUrl("https://meau.in/signup#signup");

        basic.open("https://meau.in");
        buttons.ClickmultLT();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/signup");
        basic.ReturnFirstTab();


        buttons.Clickcustomdes();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/signup");
        basic.ReturnFirstTab();


        buttons.ClickseeLT();
        basic.TabSwitch();
        basic.assertUrl("https://meau.in/hr_interview");
        basic.ReturnFirstTab();

        buttons.ClickLigB();
        basic.assertUrl("https://meau.in/signup");

        basic.open("https://meau.in");
        buttons.ClickSignB();
        basic.assertUrl("https://meau.in/signup#signup");
    }
    @Test(priority = 3)
    public void namelink() throws InterruptedException {
        try {
            basic.logOut();
        } catch (AssertionError | Exception ignored) {
        }
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

    }
    @Test(priority = 3)
    public void NotFoundTest () throws InterruptedException {
        try {
            basic.logOut();
        } catch (AssertionError | Exception ignored) {
        }
        basic.open("https://meau.in/signup");
        basic.WaitElement("//input[@id='usernameID']");
        loginka.EnterLoginData();
        basic.WaitElement("//span[@id='leftNav-dashboard-text']");
        basic.open("https://meau.in/home");
        homeSearch.searchSomething("ddrrdrdyy");
        asserts.AssertNotFound();

    }
    @Test(priority = 3)
    public void Shareclick() throws InterruptedException {
        try {
            basic.logOut();
        } catch (AssertionError | Exception ignored) {
        }
        basic.open("https://meau.in/signup");
        basic.WaitElement("//input[@id='usernameID']");
        loginka.EnterLoginData();
        basic.WaitElement("//span[@id='leftNav-dashboard-text']");
        basic.open("https://meau.in/home");
        homeSearch.searchSomething("test1");
        Thread.sleep(2000);
        clicks.shareclick();
        asserts.sharepopupVisible();

    }
    @Test(priority = 3)
    public void SpinTest () throws InterruptedException {
        try {
            basic.logOut();
        } catch (AssertionError | Exception ignored) {
        }
        basic.open("https://meau.in/signup");
        basic.WaitElement("//input[@id='usernameID']");
        loginka.EnterLoginData();
        basic.WaitElement("//span[@id='leftNav-dashboard-text']");
        basic.open("https://meau.in/home");
        homeSearch.searchSomething("test");
        asserts.AssertSpinner();

    }
}

package AllTests.FeaturesLinks;

import Base.BaseTest;
import org.testng.annotations.Test;

public class FeaturesLinkTest extends BaseTest {
    @Test
    public void featureslinks(){
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
    @Test
    public void featureslinksLogined() {
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
}

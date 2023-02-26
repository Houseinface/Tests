package AllTests.MainPageLinks;

import Base.BaseTest;
import org.testng.annotations.Test;


public class MainPageLinksTest extends BaseTest {
    @Test
    public void MainPlinks() {
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
}

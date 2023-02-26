package Tests.FaqBexes;

import Base.BaseTest;
import org.testng.annotations.Test;

public class FaqBoxesTest extends BaseTest {
    @Test
    public void boxestest() throws InterruptedException {
        basic.open("https://meau.in/faq");
        basic.WaitElementCss("[data-target='#collapseOne']");
        faqButtons.firstboxclick();
        Thread.sleep(1000);
        faqAsserts.collapse1Show();

        faqButtons.secondboxclick();
        Thread.sleep(1000);
        faqAsserts.collapse2Show();
    }
}

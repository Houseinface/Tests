package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static Common.Config.Browser;
import static Const.Const.Timeouts.implicityWait;

public class CommonCore {
    public static WebDriver createWebdriver(){
        WebDriver driver = null;

        switch (Browser){
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "E:\\Tests\\Driver\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicityWait));
        return driver;
    }
}

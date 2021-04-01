package letskodeit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HelpClass {

    public static WebDriver driver;

    @BeforeMethod
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "./driver/windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public static void exitBrowser() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();

    }

}

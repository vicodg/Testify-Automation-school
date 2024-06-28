import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//Run the following tests on https://demoqa.com   as a Testsuite (All test must be in diffrent classes)
//Navigate to the homepage and click on the Elements tile
// Assert that you are on the Elements page
//Navigate to the homepage and click on the Forms tile
//Assert that you are on the Forms page
//Navigate to the homepage and click on the Widgets tile
//Assert that you are on the Widgets page
//Navigate to the homepage and click on the Interactions tile
//Assert that you are on the Interactions page


public class Task17d {

    WebDriver driver;

    @BeforeTest
    public void setDriver()  {
        System.setProperty("webdriver.chrome.driver", "/Users/victorodogwu/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void interactionsPage() throws InterruptedException {
        driver.get("https://demoqa.com");
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,202)");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[5]//div[1]//div[3]")).click();
        Thread.sleep(2000);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.getCurrentUrl().contains("interaction"));
        softAssert.assertAll();
}

@AfterTest
public void quit() {
    driver.quit();}
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.By.xpath;

public class Task14 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/victorodogwu/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //Navigate to https://www.toolsqa.com/
        driver.get("https://www.toolsqa.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

       // Wait for the dialogue box to appear and then close it
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='accept-cookie-policy']")));

        Thread.sleep(3000);

        //Click on the tutorial button on the top left corner of the page
        driver.findElement(xpath("//header/nav[1]/div[1]/div[1]/div[4]/a[1]")).click();
        Thread.sleep(3000);


        driver.quit();








    }
}



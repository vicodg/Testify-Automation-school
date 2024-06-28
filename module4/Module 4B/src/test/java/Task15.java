import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Structure your TestNG file to run Naviagte to google and search for testify.
//close the browser
//Naviagate to https://www.mcdonalds.com/us/en-us.html .
// print out the colour - code of the order now button.
// All test should be done in one class and utilize your knowldge of tesNG annotation)


public class Task15 {
    WebDriver driver = null;
    @BeforeMethod
    public void OpenBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/victorodogwu/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.uk/");
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testify ltd");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).click();


    }

    @Test
    public void Navigate () throws InterruptedException {
        driver.navigate().to("https://www.mcdonalds.com/us/en-us.html");
        WebElement orderNow = driver.findElement(By.cssSelector("a#button-ordernow"));
        Thread.sleep(3000);
        String color = orderNow.getCssValue("color");
        Thread.sleep(3000);
        String BackgroundColor = orderNow.getCssValue("background-color");
        Thread.sleep(3000);

        System.out.println(color);
        System.out.println(BackgroundColor);

    }


    @AfterMethod
    public void CloseBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/victorodogwu/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/");
        driver.findElement(By.linkText("Security Project")).click();
        driver.findElement(By.name("uid")).sendKeys("chidivictor56@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Chidi56392");
    }
}

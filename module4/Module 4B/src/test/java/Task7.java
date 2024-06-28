import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/victorodogwu/Downloads/chromedriver-mac-arm64 2/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://worldweather.wmo.int/en/home.html");
        driver.findElement(By.name("query")).sendKeys("lagos");
        Thread.sleep(2000);
        driver.findElement(By.name("submit")).click();
        Thread.sleep(5000);
        String forecast = driver.findElement(By.cssSelector("div.wrapper:nth-child(1) div.row:nth-child(7) div.col-7.city_right_side div.col-12.city_fc_block:nth-child(2) > div.city_fc_block_mask")).getText();
        System.out.println(forecast);
        driver.quit();


    }





    }

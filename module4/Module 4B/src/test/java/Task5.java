import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/victorodogwu/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='checkout']")).click();

    }
}

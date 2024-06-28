import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/victorodogwu/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#login-button")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.header_container:nth-child(1) div.primary_header div.shopping_cart_container:nth-child(3) > a.shopping_cart_link")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#checkout")).click();

        driver.quit();

    }
}

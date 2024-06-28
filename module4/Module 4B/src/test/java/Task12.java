import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/victorodogwu/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Resizable")).click();
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")));
        Thread.sleep(5000);
       WebElement drag = driver.findElement(By.xpath("//body/div[@id='resizable']/div[1]"));
       Actions dragAction = new Actions(driver);
       dragAction.clickAndHold(drag).moveByOffset(343,242).build().perform();

       Thread.sleep(5000);


    }
}

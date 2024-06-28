import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/victorodogwu/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body//header[@role='banner']//button[@class='flat-button search-expand touch-icon-button']/div[@class='search-expand-text']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("Demo Dropdown");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html//div[@id='Blog1']/div[1]/article[@class='post-outer-container']//a[@title='Demo Dropdown List']")).click();
        Thread.sleep(2000);

       WebElement selectmenu = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]"));
       Thread.sleep(2000);
       Select select = new Select(selectmenu);
       select.selectByVisibleText("Nigeria");

        WebElement Text = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/select[1]"));
        Thread.sleep(2000);
        select = new Select(Text);
        select.selectByVisibleText("February");
        select.selectByVisibleText("March");
        select.selectByVisibleText("April");



    }
}

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/victorodogwu/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.uk/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testify ltd");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='https://www.testifyltd.com/']//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Testify Limited']")).click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Thread.sleep(2000);
         driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/testifyorg']")).click();
         Thread.sleep(3000);
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
        Thread.sleep(2000);
       // click on the x icon
        driver.findElement(By.xpath("/html/body/div[5]/div/div/section/button/icon")).click();

        driver.manage().deleteAllCookies();

        String figure = driver.findElement(By.xpath("/html/body/main/section[1]/section/div/div[2]/div[1]/h4/span")).getText();
        System.out.println(figure);

        Thread.sleep(5000);






    }
}

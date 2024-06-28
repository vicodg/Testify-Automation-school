import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/victorodogwu/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://idorenyinankoh.github.io/loginPage/ ");
        Thread.sleep(2000);
        boolean mata = driver.findElement(By.xpath("//button[@id='create']")).isEnabled();
        System.out.println(mata);

        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Victor");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Odogwu");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chidivictor56@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#male")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vic1234");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='confirmPass']")).sendKeys("Vic1234");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='xpLevel']")).sendKeys("A Software QA Engineer critical thinker with an eagles eye hunting for bugs ");


        //Checking  if Create account is enabled
        boolean state = driver.findElement(By.xpath("//button[@id='create']")).isEnabled();
        System.out.println(state);

        driver.quit();


    }
}

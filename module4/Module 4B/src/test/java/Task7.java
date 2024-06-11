import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/victorodogwu/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://worldweather.wmo.int/en/home.html");
        driver.findElement(By.xpath("//a[contains(text(),'Add Your Own City')]")).click();
        driver.findElement(By.xpath("//input[@id='faf_searchbox']")).sendKeys("Reading, United Kingdom of Great Britain and Northern Ireland");
        driver.findElement(By.xpath("//a[contains(text(),'Save')]")).click();
        driver.navigate().to("https://worldweather.wmo.int/en/home.html");
        boolean state=driver.findElement(By.cssSelector("div.wrapper:nth-child(1) div.row.fav_city_wx_block:nth-child(6) div.col-12.col-m-12.col-s-12.name_block:nth-child(2) div.row > div.col-8.col-m-8.col-s-10.place_name.fs0:nth-child(1)")).isDisplayed();
        System.out.println(state);



    }
}

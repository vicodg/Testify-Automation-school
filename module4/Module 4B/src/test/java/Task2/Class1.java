package Task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {




    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "/Users/victorodogwu/Downloads/chromedriver-mac-arm64/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("Http://www.google.com");
    }
}

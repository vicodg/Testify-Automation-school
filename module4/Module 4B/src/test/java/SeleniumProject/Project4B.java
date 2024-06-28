package SeleniumProject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;

public class Project4B {
    WebDriver driver;
    @BeforeClass

    public void setDriver() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/victorodogwu/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200)");
    }

    @Test
    public void projectLunch() throws InterruptedException {
        // launch another window and visit https://blazedemo.com/
        driver.get("https://blazedemo.com/");

        // -SelectBoston and Rome as departure and arrival destinations.

        driver.findElement(By.xpath("//select[@name='fromPort']")).click();
        WebElement selectmenu = driver.findElement(By.xpath("//select[@name='fromPort']"));
        Thread.sleep(2000);
        Select select = new Select(selectmenu);
        select.selectByVisibleText("Boston");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//select[@name='toPort']")).click();
        WebElement menu = driver.findElement(By.xpath("//select[@name='toPort']"));
        Thread.sleep(2000);
        Select select1 = new Select(menu);
        select1.selectByVisibleText("Rome");
        Thread.sleep(3000);

        // -Click on “FindFlights”

        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
        Thread.sleep(2000);

        // -Select a flight
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")).click();



        // -Fill all other fields with validinputs

        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("victor");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("United States");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("New York");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("New York");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("UA954");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("12345678910");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("victor odogwu");
        Thread.sleep(2000);



        //-Copy the flightnumber and paste into the Zipcodefield
        /*Actions actions = new Actions(driver);

        WebElement zip = driver.findElement(By.xpath("//input[@id='zipCode']"));

        WebElement zip2 = driver.findElement(By.xpath("//p[normalize-space()='Flight Number: UA954']"));
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, window.scrollHeight)");
        Thread.sleep(2000);

        //Enter Text in Zip
        actions.moveToElement(zip);
        // Press CTRL "a" and "c"
        actions.sendKeys("UA954").keyDown(Keys.CONTROL).sendKeys("a","c").build().perform();
        Thread.sleep(2000);
        //Press CTRL "v" to paste
        actions.moveToElement(zip2).click().keyDown(Keys.CONTROL).sendKeys("v").build().perform();
        //actions.keyUp(Keys.CONTROL).build().perform();*/


        // -Tick the‘RememberMe’checkbox and Purchaseflight

        driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();


    }

    @AfterClass
    public void quitDriver() {
        driver.quit();
    }


}

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Task16 {

    WebDriver driver = null;

    @BeforeMethod
    public void setDriver() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/victorodogwu/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testifyltd.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
    }

    @Test
    public void contactDetails() throws InterruptedException {
        // Locate the "Our Contact" section
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[5]/ul[1]/li[3]/a[1]")).click();
        Thread.sleep(2000);
        // Assert the email address
        String expectedEmail = "info@testifyltd.com";
        String actualEmail = driver.findElement(By.cssSelector("div div div div div:nth-child(1) li:nth-child(1) span:nth-child(2)")).getText();
        System.out.println("Actual Email: " + actualEmail);
        System.out.println("Expected Email: " + expectedEmail);
        Assert.assertEquals(actualEmail, expectedEmail);

        // Assert the location
        String expectedLocation = "Nigeria";
        String actualLocation = driver.findElement(By.cssSelector("div:nth-child(3) li:nth-child(1) span:nth-child(2)")).getText();
        System.out.println("Actual Location: " + actualLocation);
        System.out.println("Expected Location: " + expectedLocation);
        Assert.assertTrue(actualLocation.contains(expectedLocation));

        // Assert the phone number
       /* String expectedPhone = "(+234)904-882-0971";
        String actualPhone = driver.findElement(By.cssSelector("body > div:nth-child(1) > main:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > div:nth-child(2) > li:nth-child(1) > span:nth-child(2)")).getText();
        System.out.println("Actual Phone: " + actualPhone);
        System.out.println("Expected Phone: " + expectedPhone);
        Assert.assertTrue(actualPhone.contains(expectedPhone));*/



    }

    @AfterMethod
    public void TearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }

    }
}





           /* String Email = "info@testifyltd.co.uk";
       String Location = "Nigeria";
       String Phone = "+2349048820971";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Email, "info@testifyltd.co.uk");
        softAssert.assertEquals(Location, "Nigeria");
        softAssert.assertEquals(Phone, "+2349048820971");



        softAssert.assertAll();*/




















            // Locate the 'Our contact' column in the footer
            //WebElement footer = driver.findElement(By.xpath("//div[@id='__next']/section//div[@class='w-full xl:w-4/12']"));
            //Thread.sleep(2000);
          //  WebElement emailElement = footer.findElement(By.xpath("//p[contains(text(), 'info@testifyltd.co.uk')]"));
           // Thread.sleep(2000);
           // WebElement locationElement = footer.findElement(By.xpath("//p[contains(text(), 'Nigeria')]"));
           // Thread.sleep(2000);
           // WebElement phoneElement = footer.findElement(By.xpath("//p[contains(text(), '(+234)904-882-0971')]"));
           // Thread.sleep(2000);

            // Assert the contact details
        //SoftAssert softAssert = new SoftAssert();
           // softAssert.assertEquals(emailElement.getText().trim(), "EMAIL: info@testifyltd.co.uk");
           // Thread.sleep(2000);
          //  softAssert.assertEquals(locationElement.getText().trim(), "LOCATION: Nigeria");
           // Thread.sleep(2000);
           // softAssert.assertEquals(phoneElement.getText().trim(), "PHONE: (+234)904-882-0971");
           // Thread.sleep(2000);
           // softAssert.assertAll();










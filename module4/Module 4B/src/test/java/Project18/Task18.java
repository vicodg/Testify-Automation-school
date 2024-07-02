package Project18;

import org.example.Task18a;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//Using your knowledge of POM, organize your order item test case below:
//Navigate to saucedemo.com
//Login with the username and password on the Login screen.
//Add to items to cart. Click on the cart icon on the top right.
//assert that the items you clicked and added to cart are what are displayed on the "YOUR CART" page.
//Click on the checkout button. 6. Input first name last name and postal code and click on continue.
//Assert that the item showed on the CHECKOUT: OVERVIEW page is the item that was added to cart from the first page.
//Click on the "Finish" button. Assert that user sees an success message "THANK YOU FOR YOUR ORDER".

public class Task18 {

    WebDriver driver= null;


    @Test
    public void itemTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/victorodogwu/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navigate to saucedemo.com

        driver.get("https://www.saucedemo.com/");

        Task18a logs = new Task18a(driver);

        logs.getUserName().sendKeys("standard_user");

        Thread.sleep(2000);

        logs.getPassword().sendKeys("secret_sauce");
        Thread.sleep(2000);

        //Click on the Login Button
        logs.clicklogin().click();

        Thread.sleep(2000);

        //Click on the Cart Button
        logs.CartButton().click();

        Thread.sleep(2000);

        //Click on the Cart basket
        logs.CartDisplay().click();

        Thread.sleep(3000);

//assert that the items you clicked and added to cart are what are displayed on the "YOUR CART" page
        String expectedMessage = "Sauce Labs Bolt T-Shirt";
        String actualMessage = driver.findElement(By.cssSelector(".inventory_item_name")).getText();
        System.out.println("Expected Message: " + expectedMessage);
        System.out.println("Actual Message: " + actualMessage);
        Assert.assertEquals(actualMessage, expectedMessage, "Sucessfull");


        logs.CheckButton().click();
        Thread.sleep(2000);

        logs.getFirstname().sendKeys("Victor");
        Thread.sleep(2000);
        logs.getLastname().sendKeys("Odogwu");
        Thread.sleep(2000);

        logs.getPostalcode().sendKeys("12345");
        Thread.sleep(2000);

        logs.getContinueButton().click();
        Thread.sleep(2000);

//Assert that the item showed on the CHECKOUT: OVERVIEW page is the item that was added to cart from the first page.
        String expecteditem = "Sauce Labs Bolt T-Shirt";
        String actualitem = driver.findElement(By.cssSelector(".inventory_item_name")).getText();
        System.out.println("Expected Message: " + expecteditem);
        System.out.println("Actual Message: " + actualitem);
        Assert.assertEquals(actualitem, expecteditem, "Sucessfull");


        //Click on the "Finish" button. Assert that user sees an success message "THANK YOU FOR YOUR ORDER".

        logs.getFinishButton().click();
        Thread.sleep(2000);

        String expectedsuccess = "Thank you for your order!";
        String actualsuccess = driver.findElement(By.cssSelector(".complete-header")).getText();
        System.out.println("Expected Message: " + expectedsuccess);
        System.out.println("Actual Message: " + actualsuccess);
        Assert.assertEquals(actualsuccess, expectedsuccess, "Sucessfull");




        driver.quit();
    }








    }



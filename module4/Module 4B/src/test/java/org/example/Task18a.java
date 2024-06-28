package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task18a{

          WebDriver Tdriver = null;

     public Task18a(WebDriver driver){

          Tdriver = driver;

          PageFactory.initElements(Tdriver, this);

     }
     @FindBy(xpath = "//input[@id='user-name']")
     private WebElement UserName;
     public WebElement getUserName(){
          return UserName;
     }


     @FindBy(xpath = "//input[@id='password']")
     private WebElement password;
     public WebElement getPassword(){
          return password;
     }

     @FindBy(xpath = "//input[@id='login-button']")
     private WebElement login;
     public WebElement clicklogin(){
          return login;
     }


     //Add to items to cart. Click on the cart icon on the top right.
//assert that the items you clicked and added to cart are what are displayed on the "YOUR CART" page.
//Click on the checkout button. 6. Input first name last name and postal code and click on continue.
//Assert that the item showed on the CHECKOUT: OVERVIEW page is the item that was added to cart from the first page.
//Click on the "Finish" button. Assert that user sees an success message "THANK YOU FOR YOUR ORDER".


     @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
     private WebElement CartButton;

     public WebElement CartButton() {
          return CartButton;
     }


     @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
     private WebElement CartDisplay;
     public WebElement CartDisplay() {
          return CartDisplay;
     }


     @FindBy(xpath = "//button[@id='checkout']")
     private WebElement CheckButton;

     public WebElement CheckButton() {
          return CheckButton;
     }



     @FindBy(xpath = "//input[@id='first-name']")
     private WebElement Firstname;

     public WebElement getFirstname() {
          return Firstname;
     }


     @FindBy(xpath = "//input[@id='last-name']")
     private WebElement Lastname;

     public WebElement  getLastname() {
          return Lastname;
     }


     @FindBy(xpath = "//input[@id='postal-code']")
     private WebElement Postalcode;

     public WebElement  getPostalcode() {
          return Postalcode;
     }


     @FindBy(xpath = "//input[@id='continue']")
     private WebElement ContinueButton;

     public WebElement getContinueButton() {
          return ContinueButton;
     }


     @FindBy(xpath = "//button[@id='finish']")
     private WebElement FinishButton;

     public WebElement getFinishButton() {
          return FinishButton;
     }

}

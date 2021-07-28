package Elements;

import Main.Regression;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CheckoutWO extends Regression {

    public WebDriver driver;

    public CheckoutWO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='v-btn v-btn--contained v-btn--tile theme--light v-size--default']")
    public WebElement Checkout_Button;

    @FindBy (xpath = "//a[normalize-space()='Order More']")
    public WebElement Order_More;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/main/div/div/div/div[1]/div[2]/div/div/span/div[2]/div/div/div[1]/div/div/div[5]/div")
    public WebElement Second_item_Selection;

    @FindBy(xpath = "//button[@class='add-to-cart v-btn v-btn--contained v-btn--tile theme--light v-size--default']")
    public WebElement Add_to_Basket;

    @FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-menu-down theme--light'])[2]")
    public WebElement Select_Payment;

    @FindBy(xpath = "//body/div/div[@class='v-application v-application--is-ltr theme--light page-background']/div[@class='v-menu__content theme--light menuable__content__active']/div[@role='listbox']/div[3]/div[1]")
    public WebElement Select_CC;

    @FindBy(xpath = "//p[normalize-space()='Place Order']")
    public WebElement PlaceOrder_CTA;

    //checkout
    public void Checkout(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Checkout_Button.click();
            Thread.sleep(4000);
        }
    }

    //add more items to basket
    public void OrderMore(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Thread.sleep(4000);
            Order_More.click();
            Thread.sleep(4000);
            Second_item_Selection.click();
            Thread.sleep(4000);
            Add_to_Basket.click();
            Thread.sleep(4000);
            Checkout_Button.click();
        }

        }

    //select payment method on checkout
    public void Payment_Selection(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Thread.sleep(4000);
            Select_Payment.click();
            Thread.sleep(4000);
            Select_CC.click();
            Thread.sleep(4000);
        }
    }





    //Place order
    public void Place_Order(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            PlaceOrder_CTA.click();
            Thread.sleep(4000);

        }
    }
}

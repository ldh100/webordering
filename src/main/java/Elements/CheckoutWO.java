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

    @FindBy(xpath = "//a[normalize-space()='Order More']")
    public WebElement Order_More;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/main/div/div/div/div[1]/div[2]/div/div/span/div[2]/div/div/div[1]/div/div/div[5]/div")
    public WebElement Second_item_Selection;

    @FindBy(xpath = "//button[@class='add-to-cart v-btn v-btn--contained v-btn--tile theme--light v-size--default']")
    public WebElement Add_to_Basket;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/main/div/div/div/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/span/button")
    public WebElement Delete_Item_From_Basket;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/main/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div[1]/span/button")
    public WebElement Delete_Item_In_Checkout;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/main/div/div/div/div[2]/button")
    public WebElement KeepBrowsing;

    @FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-menu-down theme--light'])[2]")
   // @FindBy(xpath = "//*[@id=\"app\"]/div[1]/main/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/div/div/div[1]/div[1]/div[1]")
    public WebElement Select_Payment;

    // @FindBy(xpath = "//body/div/div[@class='v-application v-application--is-ltr theme--light page-background']/div[@class='v-menu__content theme--light menuable__content__active']/div[@role='listbox']/div[3]/div[1]")
    @FindBy(xpath = "//div[contains(text(),'1111')]")
    public WebElement Select_CC;

    @FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-menu-down theme--light'])[1]")
    public WebElement Select_timeslot;


    @FindBy(xpath = "//div[@class='v-responsive__content']")
    public WebElement Thrive_icon;

    @FindBy(xpath = "//span[normalize-space()='Log Out']")
    public WebElement Logout;


    @FindBy(xpath = "//strong[normalize-space()='Delivery']")
    public WebElement Delivery_Toggle;


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
            Thread.sleep(8000);
            Second_item_Selection.click();
            Thread.sleep(4000);
            Add_to_Basket.click();
            Thread.sleep(6000);
            // Thread.sleep(4000);
            // Checkout_Button.click();
        }
    }

    //delete item from basket
    public void DeleteItem_From_Basket(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Thread.sleep(4000);
            Delete_Item_From_Basket.click();
            Thread.sleep(4000);

        }
    }

    //delete item in checkout page
    public void DeleteItem_On_Checkout(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Delete_Item_In_Checkout.click();
            Thread.sleep(4000);
        }
    }

    //keep browsing
    public void Keep_Browsing(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            KeepBrowsing.click();
            Thread.sleep(4000);
        }
    }

    //select payment method on checkout
    public void Payment_Selection(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Thread.sleep(5000);
            Select_Payment.click();
            Thread.sleep(4000);
            Select_CC.click();
            Thread.sleep(4000);
        }
    }

    //time slot selection
    public void Pickup_Timeslot(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Thread.sleep(4000);
            Select_timeslot.click();
        }
    }

    //Place order
    public void Place_Order(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            PlaceOrder_CTA.click();
            Thread.sleep(4000);

        }
    }

    //click on Thrive logo
    public void Logo(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Thrive_icon.click();
            Thread.sleep(4000);
        }
    }

    //log out
    public void Log_Out(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Thread.sleep(4000);
            Logout.click();

        }
    }

    //toggling to delivery
    public void Toggle_to_Delivery(String Automation_type) throws InterruptedException {
        Delivery_Toggle.click();
        Thread.sleep(4000);
    }
}

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

    @FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-menu-down theme--light'])[2]")
    public WebElement Select_Payment;

    @FindBy(xpath = "//body/div/div[@class='v-application v-application--is-ltr theme--light page-background']/div[@class='v-menu__content theme--light menuable__content__active']/div[@role='listbox']/div[3]/div[1]")
    public WebElement Select_CC;

    @FindBy(xpath = "//div[@class='v-text-field__slot']//input[@type='text']")
    public WebElement Add_Promo;

    @FindBy(xpath = "//span[@class='promo-button-txt']")
    public WebElement Apply_Promotion;

    @FindBy(xpath = "//p[normalize-space()='Place Order']")
    public WebElement PlaceOrder_CTA;

    //checkout
    public void Checkout(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Checkout_Button.click();
            Thread.sleep(4000);
        }
    }

    //select payment method on checkout
    public void Payment_Selection(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Select_Payment.click();
            Thread.sleep(4000);
            Select_CC.click();
            Thread.sleep(4000);
        }
    }

    // apply promo code
    public void Apply_Promocode(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Add_Promo.sendKeys("compassunlimited");
            Thread.sleep(4000);
            Apply_Promotion.click();
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

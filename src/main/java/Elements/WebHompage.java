package Elements;

import Main.Regression;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebHompage extends Regression {
    public WebDriver driver;

    public WebHompage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //@FindBy(css = "#input-37")
    @FindBy(xpath = "//*[@id=\"app\"]/div/main/div/div/div[1]/header/div/div[1]/div/div[2]/div/div/div[3]/button/span/div")
    public WebElement Menu_Button;

    @FindBy(xpath = "//span[normalize-space()='Search Locations']")
    public WebElement Search_Loc;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement Enter_Loc;

    @FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']//div[@class='v-list-item__content']//div[1]")
    public WebElement Select_Loc;

    @FindBy(xpath = "//p[@class='mt-2 switch-form-text']")
    public WebElement Close_Loc;

    @FindBy(xpath = "//div[contains(text(),'Log In')]")
    public WebElement Home_Login;

    @FindBy(xpath = "//div[@class='row mt-3 align-end switch-form justify-end no-gutters']//p[@class='mt-1 switch-form-text'][normalize-space()='Close']")
    public WebElement HomeLogin_Close;


    @FindBy(xpath = "//h4[normalize-space()='Log In']")
    public WebElement Menu_Login;

    @FindBy(xpath = "//div[@class='v-dialog v-dialog--active']//p[@class='mt-1 switch-form-text'][normalize-space()='Close']")
    public WebElement Menu_Login_Close;

    @FindBy(xpath = "//h4[normalize-space()='Sign Up']")
    public WebElement Menu_Signup;

    @FindBy(xpath = "//div[@class='v-dialog v-dialog--active']//p[@class='mt-1 switch-form-text'][normalize-space()='Close']")
    public WebElement Menu_Signup_close;

    @FindBy(css = "div[class='v-input my-5 form-field theme--light v-text-field v-text-field--is-booted'] input")
    public WebElement Email_text;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement Email_Pwd;

    @FindBy(xpath = "//button[@class='v-btn v-btn--contained theme--light v-size--default']//span[@class='v-btn__content']")
    public WebElement Email_login;





    @FindBy(xpath = "//button[@class='v-btn v-btn--contained v-btn--tile theme--light v-size--default']")
    public WebElement Checkout_Button;

    @FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-menu-down theme--light'])[2]")
    public WebElement Select_Payment;

    @FindBy(xpath = "//body/div/div[@class='v-application v-application--is-ltr theme--light page-background']/div[@class='v-menu__content theme--light menuable__content__active']/div[@role='listbox']/div[3]/div[1]")
    public WebElement Select_CC;

    @FindBy(xpath = "//p[normalize-space()='Place order']")
    public WebElement PlaceOrder_CTA;

    @FindBy(xpath = "//h4[normalize-space()='Support Desk']")
    public WebElement Menu_Support;

    @FindBy(xpath = "//button[@aria-label='Minimize widget']//*[local-name()='svg']")
    public WebElement Menu_support_Close;

    @FindBy(xpath = "//i[@class='v-icon notranslate mdi mdi-menu theme--light']")
    public WebElement Mobile_Menu;

    @FindBy(xpath = "(//p[@class='mt-1 switch-form-text'][normalize-space()='Close'])[2]")
    public WebElement Mobile_Login_Close;

    @FindBy(xpath = "//div[@class='row mt-3 align-end switch-form justify-end no-gutters']//p[@class='mt-1 switch-form-text'][normalize-space()='Close']")
    public WebElement Mobile_Signup_Close;
    @FindBy(xpath = "//video[@class='fetch-sites-loader']")
    public WebElement search_message;

    @FindBy(xpath = "//div[contains(text(),‘Login’)]")
    public WebElement Login_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.Button")
    public WebElement Hamburger;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[6]")
    public WebElement Mobile_login_button;

    //checking visibility of buttons on home page and links under Menu dashboard
    public void Homepage_Visibility(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Home_Login.click();
            Thread.sleep(4000);
            HomeLogin_Close.click();
            this.Menu_Location("Web");
            this.Close_Dialog("Web");
            Menu_Button.click();
            Thread.sleep(4000);
            Menu_Login.click();
            Thread.sleep(4000);
            Menu_Login_Close.click();
            Thread.sleep(4000);
            Menu_Button.click();
            Thread.sleep(4000);
            Menu_Signup.click();
            Thread.sleep(4000);
            Menu_Signup_close.click();
            Thread.sleep(4000);

            //obj_config.Extent_Result( "PASS",  " is available in URL screenshot attached: " );
            //Menu_Support.click();
            //Thread.sleep(4000);
            //Menu_support_Close.click();
            //Thread.sleep(4000);

        } else if (Automation_type.equals("Mobile")) {

            Mobile_Menu.click();
            Thread.sleep(4000);
            Menu_Login.click();
            Thread.sleep(4000);
            Mobile_Login_Close.click();
            Thread.sleep(4000);
            Mobile_Menu.click();
            Thread.sleep(4000);
            Menu_Signup.click();
            Thread.sleep(4000);
            Mobile_Signup_Close.click();
            Thread.sleep(4000);
            //Menu_Support.click();
            //Thread.sleep(4000);
            //Menu_support_Close.click();
            //Thread.sleep(4000);

        }
    }

    //non-logged in user taps on Menu to select "search the location" and close the dialog
    public void Menu_Location(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Menu_Button.click();
            Thread.sleep(4000);
            Search_Loc.click();
            Thread.sleep(4000);
        }
    }

    public void Close_Dialog(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Close_Loc.click();
            Thread.sleep(4000);
        }
    }

    public void Select_Location(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Enter_Loc.sendKeys("KK");
            Thread.sleep(4000);
            Select_Loc.click();
            Thread.sleep(10000);
        }
    }

    //login method

    public void Login_Desktop(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Home_Login.click();
            Thread.sleep(4000);
            Email_text.sendKeys("gagandev@mailsac.com");
            Thread.sleep(4000);
            Email_Pwd.sendKeys("Testing100");
            Thread.sleep(4000);
            Email_login.click();


        }
    }
}

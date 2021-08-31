package Main;

import Configuration.config;
import Elements.AddItemstoBasket;
import Elements.CheckoutWO;
import Elements.PromoCode;
import Elements.WebHompage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import freemarker.core.Environment;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class Regression {

    public static config obj_config = new config();

    public WebDriver driver;
    public static WebHompage obj_WebHompage;
    public static CheckoutWO obj_CheckoutWo;
    public static PromoCode obj_PromoCode;
    public static String AutomationType;
    public static AddItemstoBasket obj_Add_Items_toBasket;

    //public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest logger;

    @BeforeSuite(groups = {"Regression"})
    //@Parameters("Environment")
    public void Extent_Init() {
        obj_config.Extent_Report_Init("Chrome");
    }

    @BeforeMethod(groups = {"Mobile_Chrome"})
    private void Setup_Mobile_Chrome() throws Exception {
        driver = obj_config.init_Mobile_Chrome();
        obj_WebHompage = new WebHompage(driver);
        //obj_config.init_Web_Chrome();
    }

    @BeforeMethod(groups = {"Web_Chrome"})
    //@Parameters("Environment")
    private void Setup_Web_Chrome() throws Exception {
        driver = obj_config.init_Web_Chrome();
        obj_WebHompage = new WebHompage(driver);
        obj_CheckoutWo = new CheckoutWO(driver);
        obj_PromoCode = new PromoCode(driver);
        obj_Add_Items_toBasket = new AddItemstoBasket(driver);
        //obj_config.init_Web_Chrome();
    }

    @Test(priority = 0, groups = {"Mobile_Chrome", "Web_Chrome"})
    //@Parameters("Automation_Type")
    @Parameters(value = {"Automation_Type"})
    private void test1(String Automation_Type) throws InterruptedException {
        //logger = extent.startTest("Icon visibility on Homepage: ");
        Thread.sleep(8000);
        AutomationType = Automation_Type;
        obj_WebHompage.Homepage_Visibility(AutomationType);
        obj_WebHompage.Menu_Location(AutomationType);
        obj_WebHompage.Select_Location(AutomationType);
        obj_WebHompage.Login_Desktop(AutomationType);
        obj_Add_Items_toBasket.Add_Items(AutomationType);
        obj_CheckoutWo.Checkout(AutomationType);
        obj_CheckoutWo.OrderMore(AutomationType);
        obj_CheckoutWo.DeleteItem_From_Basket(AutomationType);
        obj_CheckoutWo.Checkout(AutomationType);
        obj_CheckoutWo.DeleteItem_On_Checkout(AutomationType);
        obj_CheckoutWo.Keep_Browsing(AutomationType);
        obj_Add_Items_toBasket.Add_Items(AutomationType);
        obj_CheckoutWo.Checkout(AutomationType);
        obj_CheckoutWo.OrderMore(AutomationType);
        obj_CheckoutWo.Checkout(AutomationType);
        obj_CheckoutWo.Payment_Selection(AutomationType);
        obj_PromoCode.Apply_Promocode(AutomationType);
        obj_PromoCode.Delete_Promo_and_Reapply(AutomationType);
        //obj_CheckoutWo.Pickup_Timeslot(AutomationType);
        obj_CheckoutWo.Place_Order(AutomationType);
        //obj_CheckoutWo.Logo(AutomationType);
        //obj_WebHompage.Menu_Location(AutomationType);
        //obj_CheckoutWo.Log_Out(AutomationType);
        //obj_WebHompage.Login_Desktop(AutomationType);
        // obj_CheckoutWo.Toggle_to_Delivery(AutomationType);
        //obj_Add_Items_toBasket.Add_Items(AutomationType);
        //obj_CheckoutWo.Checkout(AutomationType);
        Thread.sleep(8000);
        // extent.endTest(logger);
        //extent.flush();
    }

    @AfterMethod(groups = {"Mobile_Chrome", "Web_Chrome"})
    public void tearDown() {
        driver.quit();
    }


}

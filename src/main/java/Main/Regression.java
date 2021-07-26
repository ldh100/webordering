package Main;

import Configuration.config;
import Elements.CheckoutWO;
import Elements.WebHompage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class Regression {

    public static config obj_config = new config();

    public WebDriver driver;
    public static WebHompage obj_WebHompage;
    public static CheckoutWO obj_CheckoutWo;
    public static String AutomationType;

    //public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest logger;

    @BeforeSuite(groups = {"Regression"})
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

    private void Setup_Web_Chrome() throws Exception {
        driver = obj_config.init_Web_Chrome();
        obj_WebHompage = new WebHompage(driver);
        obj_CheckoutWo = new CheckoutWO(driver);

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
        obj_WebHompage.Add_Items(AutomationType);
        obj_CheckoutWo.Checkout(AutomationType);
        obj_CheckoutWo.Payment_Selection(AutomationType);
        obj_CheckoutWo.Apply_Promocode(AutomationType);
        obj_CheckoutWo.Place_Order(AutomationType);
        Thread.sleep(8000);
        // extent.endTest(logger);
        //extent.flush();
    }

    @AfterMethod(groups = {"Mobile_Chrome", "Web_Chrome"})
    public void tearDown() {
        driver.quit();
    }


}

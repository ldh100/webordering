package Main;

import Configuration.config;
import Elements.WebHompage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class Regression {

    public static config obj_config = new config();

    public WebDriver driver;
    public static WebHompage obj_WebHompage;
    public static String AutomationType;


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

        //obj_config.init_Web_Chrome();
    }

    @Test(priority = 0, groups = {"Mobile_Chrome", "Web_Chrome"})
    //@Parameters("Automation_Type")
    @Parameters(value = {"Automation_Type"})
    private void test1(String Automation_Type) throws InterruptedException {
        Thread.sleep(8000);
        AutomationType = Automation_Type;
        obj_WebHompage.Homepage_Visibility(AutomationType);
        obj_WebHompage.Menu_Location(AutomationType);
        obj_WebHompage.Select_Location(AutomationType);
        Thread.sleep(8000);

    }

    @AfterMethod(groups = {"Mobile_Chrome", "Web_Chrome"})
    public void tearDown() {
        driver.quit();
    }


}

package Main;

import Configuration.config;
import Elements.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class Regression {

    public static config obj_config = new config();

    public WebDriver driver;
    public static Elements obj_Elements;
    public static String AutomationType;


    @BeforeMethod(groups = {"Mobile_Chrome"})

    private void Setup_Mobile_Chrome() throws Exception {
        driver =  obj_config.init_Mobile_Chrome();

        //obj_config.init_Web_Chrome();
    }

    @BeforeMethod(groups = {"Web_Chrome"})

    private void Setup_Web_Chrome() throws Exception {
        driver =  obj_config.init_Web_Chrome();
        obj_Elements=new Elements(driver);

        //obj_config.init_Web_Chrome();
    }



    @AfterMethod(groups = {"Mobile_Chrome","Web_Chrome"})
    public void tearDown() {
        driver.quit();
    }




    @Test(priority = 0, groups = {"Mobile_Chrome","Web_Chrome"})
    @Parameters(value = {"Automation_Type"})
    private void test1(String Automation_Type) throws InterruptedException {
        Thread.sleep(2000);
        AutomationType = Automation_Type;

        obj_Elements.Login_Test(AutomationType);

    }



}
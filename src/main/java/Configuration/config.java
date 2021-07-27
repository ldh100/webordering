package Configuration;

import Main.Regression;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class config extends Regression {

    DesiredCapabilities cap = new DesiredCapabilities();
    private static String Platform;
    public static String platformVersion = null;
    public static String WDAPort = null;
    public static String Application_Name = null;
    public static String App_Version_My_Account = null;

    public static ExtentReports extent;
    public static ExtentTest logger;
    public static int Pass_count = 0;
    public static int Fail_count = 0;
    public static int Skip_count = 0;
    public static int Warning_count = 0;
    public static int Info_count = 0;
    public static int Total_Steps;

    public static String App_Id;


    public WebDriver init_Mobile_Chrome() throws MalformedURLException {

        cap.setCapability("deviceName", "Pixel_2_API_29_1");
        cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        cap.setCapability("avdLaunchTimeout", "120000");
        cap.setCapability("adbExecTimeout", "120000");
        cap.setCapability("platformName", "Android");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("platformVersion", "10");
        cap.setCapability("autoAcceptAlerts", true);
        cap.setCapability("webviewConnectRetries", "25");
        cap.setCapability("webkitResponseTimeout", "10000");
        cap.setCapability("newCommandTimeout", "300");
        cap.setCapability("newCommandTimeout", "300");
        cap.setCapability("systemPort", WDAPort);//
        cap.setCapability("resetKeyboard", true);
        cap.setCapability("sendKeyStrategy", "oneByOne");

        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.get("https://dev.thriveapp.io/");
        return driver;

    }


    public WebDriver init_Web_Chrome() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://dev.thriveapp.io/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;
    }

    public static void Extent_Report_Init(String Browser_Name) {
        String HTML_Report = "/Users/gagandeep.kaur/Desktop/WebOrdering.html";
        extent = new ExtentReports(HTML_Report, true);
        extent
                .addSystemInfo("Host Name", "Compass Digital Lab,Mississauga")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("Automation Tester Name", "Gagandeep")
                .addSystemInfo("QA Manager", "Ludmilla Sivanathan")
                .addSystemInfo("Application Name", "WebOrdering")
                .addSystemInfo("Application Version", "Alpha")
                .addSystemInfo("Device", Browser_Name)
                .addSystemInfo("Testing Environment", "Staging");
        extent.loadConfig(new File("extent-config.xml"));
    }

    public void Extent_Result(String type, String Test_Description) {
        if (type.equals("PASS")) {
            Pass_count++;
            logger.log(LogStatus.PASS, Test_Description);
        }
        if (type.equals("FAIL")) {
            Fail_count++;
            logger.log(LogStatus.FAIL, Test_Description);
        }
        if (type.equals("SKIP")) {
            Skip_count++;
            logger.log(LogStatus.SKIP, Test_Description);
        }
        if (type.equals("INFO")) {
            Info_count++;
            logger.log(LogStatus.INFO, Test_Description);
        }
        if (type.equals("WARNING")) {
            Warning_count++;
            logger.log(LogStatus.WARNING, Test_Description);
        }
    }


}

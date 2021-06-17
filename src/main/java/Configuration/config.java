package Configuration;

import Main.Regression;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

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

    public WebDriver init_Web_Chrome(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://dev.thriveapp.io/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;
    }



}

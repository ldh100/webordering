package Elements;

import Main.Regression;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends Regression {
    public WebDriver driver;
    public Elements(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//div[contains(text(),‘Login’)]")
    public WebElement Login_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.Button")
    public WebElement Hamburger;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[6]")
    public WebElement Mobile_login_button;



    public void Login_Test(String Automation_type) throws InterruptedException {
        if(Automation_type.equals("Mobile")){
            Hamburger.click();
            Thread.sleep(5000);
            Mobile_login_button.click();
        }
        else{
            Thread.sleep(2000);
        Login_Button.click();}

    }

}

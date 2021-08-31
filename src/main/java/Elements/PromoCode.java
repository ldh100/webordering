package Elements;

import Main.Regression;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromoCode extends Regression {

    public WebDriver driver;

    public PromoCode(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='v-text-field__slot']//input[@type='text']")
    public WebElement Add_Promo;

    @FindBy(xpath = "//span[@class='promo-button-txt']")
    public WebElement Apply_Promotion;

    // @FindBy(xpath = "//button[@class='v-icon notranslate promo-button pa-6 v-icon--link mdi mdi-close-circle theme--light']")
    @FindBy(id = "remove-promo")
    public WebElement Delete_Promo;

    // apply promo code
    public void Apply_Promocode(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Add_Promo.sendKeys("compassunlimited");
            Thread.sleep(4000);
            Apply_Promotion.click();
            Thread.sleep(4000);
        }
    }

    // delete promo and re-apply
    public void Delete_Promo_and_Reapply(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Thread.sleep(4000);
            Delete_Promo.click();
            Thread.sleep(4000);
            this.Apply_Promocode("Web");
            Thread.sleep(4000);
        }
    }


}

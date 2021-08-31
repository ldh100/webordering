package Elements;

import Main.Regression;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddItemstoBasket extends Regression {
    public WebDriver driver;

    public AddItemstoBasket(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "brand-label-0")
    public WebElement Brand_Selection;

    //@FindBy(xpath = "//*[@id=\"app\"]/div/main/div/div/div/div[1]/div[2]/div/div/span/div[2]/div/div/div[1]/div/div/div[3]")
    @FindBy(id = "item-label-2")
    public WebElement Item_Selection;

   // @FindBy(xpath = "//button[@class='add-to-cart v-btn v-btn--contained v-btn--tile theme--light v-size--default']")
    @FindBy(id = "add-to-basket")
    public WebElement Add_to_Basket;


    public void Add_Items(String Automation_type) throws InterruptedException {
        if (Automation_type.equals("Web")) {
            Thread.sleep(4000);
            Brand_Selection.click();
            Thread.sleep(4000);
            Item_Selection.click();
            Thread.sleep(4000);
            Add_to_Basket.click();
            Thread.sleep(6000);

        }
    }


}

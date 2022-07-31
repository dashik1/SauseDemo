package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    private WebElement itemNameInCart;

    @FindBy(css = "div.inventory_item_price")
    private WebElement itemPriceInCart;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return itemNameInCart.isDisplayed();
    }

    public String getItemNameInCart() {
        return itemNameInCart.getText();
    }

    public String getItemPriceInCart() {
        return itemPriceInCart.getText();
    }
}

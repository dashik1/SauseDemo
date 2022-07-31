package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    private WebElement itemName;

    @FindBy(css = ".inventory_list > div:first-child > div:nth-child(2) > div:nth-child(2) > div.inventory_item_price")
    private WebElement itemPrice;

    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    private WebElement addToCartButton;

    @FindBy(css = ".shopping_cart_link")
    private WebElement cartLink;

    @FindBy(xpath = "//a[text()='LinkedIn']")
    private WebElement linkedInLink;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return cartLink.isDisplayed();
    }

    public String getItemName() {
        return itemName.getText();
    }

    public String getItemPrice() {
        return itemPrice.getText();
    }

    public ProductsPage clickAddToCartButton() {
        addToCartButton.click();
        return this;
    }

    public CartPage goToCart() {
        cartLink.click();
        return new CartPage(driver);
    }

    public ExternalPage goToLinkedInLink() {
        linkedInLink.click();
        return new ExternalPage(driver);
    }


}

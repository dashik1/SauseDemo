package Tests;

import Pages.CartPage;
import Pages.LoginPage;
import Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.RetryAnalyzer;

public class CartTest extends BaseTest {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void itemInCartTest() {

        LoginPage loginPage = new LoginPage(driverManager.getDriver());
        loginPage.openLoginPage();
        loginPage.inputStandardUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();

        ProductsPage productsPage = new ProductsPage(driverManager.getDriver());
        String itemNameExpected = productsPage.getItemName();
        String itemPriceExpected = productsPage.getItemPrice();
        productsPage.clickAddToCartButton();
        productsPage.goToCart();

        CartPage cartPage = new CartPage(driverManager.getDriver());
        String itemNameInCart = cartPage.getItemNameInCart();
        String itemPriceInCart = cartPage.getItemPriceInCart();

        Assert.assertEquals(itemNameExpected, itemNameInCart);
        Assert.assertEquals(itemPriceExpected, itemPriceInCart);

    }

}

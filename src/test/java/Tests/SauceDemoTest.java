package Tests;

import DriverManager.DriverManager;
import Pages.CartPage;
import Pages.ExternalPage;
import Pages.LoginPage;
import Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoTest extends BaseTest {

    @Test
    public void itemInCartTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.inputStandardUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();

        ProductsPage productsPage = new ProductsPage(driver);
        String itemNameExpected = productsPage.getItemName();
        String itemPriceExpected = productsPage.getItemPrice();
        productsPage.clickAddToCartButton();
        productsPage.goToCart();

        CartPage cartPage = new CartPage(driver);
        String itemNameInCart = cartPage.getItemNameInCart();
        String itemPriceInCart = cartPage.getItemPriceInCart();

        Assert.assertEquals(itemNameExpected, itemNameInCart);
        Assert.assertEquals(itemPriceExpected, itemPriceInCart);

    }

    @Test
    public void linkedInLogoTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.inputStandardUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();

        //removeImplicitlyWait();
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.goToLinkedInLink();

        ExternalPage externalPage = new ExternalPage(driver);
        externalPage.switchToNewTab();
        externalPage.setWebDriverWaitForLogo();
        //setImplicitlyWait();
        Assert.assertTrue(externalPage.isLogoDisplayed(), "Logo is not displayed!");


    }

}

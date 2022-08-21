package Tests;

import Pages.ExternalPage;
import Pages.LoginPage;
import Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.RetryAnalyzer;

public class ExternalLinkTest extends  BaseTest {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void linkedInLogoTest() {

        LoginPage loginPage = new LoginPage(driverManager.getDriver());
        loginPage.openLoginPage();
        loginPage.inputStandardUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();

        //removeImplicitlyWait();
        ProductsPage productsPage = new ProductsPage(driverManager.getDriver());
        productsPage.goToLinkedInLink();

        ExternalPage externalPage = new ExternalPage(driverManager.getDriver());
        externalPage.switchToNewTab();
        externalPage.setWebDriverWaitForLogo();
        //setImplicitlyWait();
        Assert.assertTrue(externalPage.isLogoDisplayed(), "Logo is not displayed!");


    }
}

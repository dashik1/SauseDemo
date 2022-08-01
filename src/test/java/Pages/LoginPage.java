package Pages;

import Constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(css = "#user-name")
    private WebElement usernameField;

    @FindBy(css = "#password")
    private WebElement passwordField;

    @FindBy(css = "#login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return loginButton.isDisplayed();
    }

    public LoginPage openLoginPage() {
        driver.get(Constants.URL);
        return this;
    }

    public LoginPage inputStandardUsername() {
        usernameField.sendKeys(Constants.STANDARD_USER_NAME);
        return this;
    }

    public LoginPage inputPassword() {
        passwordField.sendKeys(Constants.PASSWORD);
        return this;
    }

    public ProductsPage clickLoginButton() {
        loginButton.click();
        return new ProductsPage(driver);
    }


}

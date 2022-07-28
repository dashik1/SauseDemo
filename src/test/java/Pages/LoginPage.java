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

    public void openLoginPage() {
        driver.get(Constants.URL);
    }

    public void inputStandardUsername() {
        usernameField.sendKeys(Constants.STANDARD_USER_NAME);
    }

    public void inputPassword() {
        passwordField.sendKeys(Constants.PASSWORD);
    }

    public void clickLoginButton() {
        loginButton.click();
    }


}

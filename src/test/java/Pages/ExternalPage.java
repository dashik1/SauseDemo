package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;


public class ExternalPage extends BasePage {

    @FindBy(xpath = "//icon[@data-test-id='nav-logo']")
    private WebElement logo;

    public ExternalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return logo.isDisplayed();
    }

    public ExternalPage switchToNewTab() {
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        return this;
    }

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public ExternalPage setWebDriverWaitForLogo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//icon[@data-test-id='nav-logo']")));
        return this;
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }
}

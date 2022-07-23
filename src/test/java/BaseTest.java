import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.URL;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        PropertyManager propertyManager = new PropertyManager();
        propertyManager.loadData();
        System.setProperty("webdriver.chrome.driver", propertyManager.get("PATH_TO_DRIVER"));
        driver = new ChromeDriver();
        driver.get(Constants.URL);
    }

    public void standardLogin(){
        driver.findElement(By.cssSelector("#user-name")).sendKeys(Constants.STANDARD_USER_NAME);
        driver.findElement(By.cssSelector("#password")).sendKeys(Constants.PASSWORD);
        driver.findElement(By.cssSelector("#login-button")).click();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
         driver.quit();
    }

}

package DriverManager;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.PropertyManager;

public class FirefoxDriverManager extends DriverManager {


    @Override
    public void createDriver() {
        PropertyManager propertyManager = new PropertyManager();
        propertyManager.loadData();
        System.setProperty("webdriver.gecko.driver", propertyManager.get("PATH_TO_FIREFOX"));
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        driver = new FirefoxDriver(capabilities);

    }
}

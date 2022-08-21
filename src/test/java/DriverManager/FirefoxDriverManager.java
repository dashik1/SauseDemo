package DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.PropertyManager;

public class FirefoxDriverManager extends DriverManager {


    @Override
    public void createDriver() {
        WebDriverManager.firefoxdriver().setup();
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        threadLocalDriver.set(new FirefoxDriver(capabilities));

    }
}

package DriverManager;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class RemoteDriverManager extends DriverManager {
    @Override
    public void createDriver() {

        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setCapability("platformName","Windows 11");
        browserOptions.setCapability("browserVersion", "104");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "1");
        sauceOptions.put("name", "SauceDemo tests");
        browserOptions.setCapability("sauce:options", sauceOptions);





        try {
            driver = new RemoteWebDriver( new URL("https://oauth-dashadovgalenok-f4ef1:106357d4-cd06-4f9c-b912-59c1f114dc13@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), browserOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}

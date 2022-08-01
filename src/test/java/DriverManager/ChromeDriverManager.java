package DriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import utils.PropertyManager;

public class ChromeDriverManager extends DriverManager {


    @Override
    public void createDriver() {
        PropertyManager propertyManager = new PropertyManager();
        propertyManager.loadData();
        System.setProperty("webdriver.chrome.driver", propertyManager.get("PATH_TO_CHROME"));
        driver = new ChromeDriver();

    }
}

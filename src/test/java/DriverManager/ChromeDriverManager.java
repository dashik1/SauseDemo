package DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.PropertyManager;

public class ChromeDriverManager extends DriverManager {


    @Override
    public void createDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
}

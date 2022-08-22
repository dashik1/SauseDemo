package Tests;

import DriverManager.DriverManager;
import org.openqa.selenium.WebDriver;
import DriverManager.DriverFactory;
import DriverManager.DriverType;
import org.testng.annotations.*;
import utils.TestListeners;


@Listeners(TestListeners.class)
public class BaseTest {
    //public WebDriver driver;
    DriverManager driverManager;


    @BeforeClass
    @Parameters({"browser"})
    public void createManager(@Optional("chrome") String browser) {
        DriverFactory driverFactory = new DriverFactory();
        DriverType type;
        if (browser.equals("chrome")) {
            type = DriverType.CHROME;
        } else if (browser.equals("firefox")) {
            type = DriverType.FIREFOX;
        } else type = DriverType.REMOTE;
        driverManager = driverFactory.getManager(DriverType.CHROME);
    }

    @BeforeMethod
    public void setUp() {
        driverManager.createDriver();
        driverManager.setTimeout();
        driverManager.startMaximize();

    }


    public WebDriver getDriver() {
        return driverManager.getDriver();
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driverManager.getDriver().quit();

    }


}

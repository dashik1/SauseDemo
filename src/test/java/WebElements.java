import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
    WebDriver driver = new ChromeDriver();
    WebElement logo = driver.findElement(By.className("login_logo"));
    WebElement spanProducts = driver.findElement(By.tagName("span"));
    WebElement linkAbout = driver.findElement(By.linkText("About"));
    WebElement linkLinkedIn = driver.findElement(By.partialLinkText("Linked"));

    WebElement backpack = driver.findElement(By.xpath("//a[@id='item_4_title_link']/div"));
    WebElement bikeLight = driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']"));
    WebElement itemContainer = driver.findElement(By.xpath("//div[contains(@id, 'item_container')]"));
    WebElement backpackItem = driver.findElement(By.xpath("//div[contains(text(), 'Labs Backpack')]"));
    WebElement social = driver.findElement(By.xpath("//a[text()='LinkedIn']//ancestor::ul"));
    WebElement socialLinkedIn = driver.findElement(By.xpath("//a[text()='LinkedIn']//parent::li"));
    WebElement checkoutButton = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button' and text()='Checkout']"));

    WebElement containerClass = driver.findElement(By.cssSelector(".inventory_container"));
    WebElement headerContainer = driver.findElement(By.cssSelector("#header_container"));
    WebElement footer = driver.findElement(By.cssSelector("footer.footer"));
    WebElement removeButton = driver.findElement(By.cssSelector("[name^=remove-sauce]"));
    WebElement description = driver.findElement(By.cssSelector("[class$=desc_label]"));
    WebElement continueShopping = driver.findElement(By.cssSelector("[name*=tinue-shop]"));
    WebElement firstItem = driver.findElement(By.cssSelector(".inventory_list > div:first-child"));
    WebElement foursItem = driver.findElement(By.cssSelector(".inventory_list > div:nth-child(4)"));


}
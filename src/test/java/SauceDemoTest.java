import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SauceDemoTest extends BaseTest {

    @Test
    public void itemInBasketTest() {
        standardLogin();
        String itemNameExpected = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
        String itemPriceExpected = driver.findElement(By.cssSelector(".inventory_list > div:first-child > div:nth-child(2) > div:nth-child(2) > div.inventory_item_price")).getText();
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        String itemNameActual = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
        String itemPriceActual = driver.findElement(By.cssSelector("div.inventory_item_price")).getText();
        Assert.assertEquals(itemNameActual, itemNameExpected);
        Assert.assertEquals(itemPriceActual, itemPriceExpected);
    }


}

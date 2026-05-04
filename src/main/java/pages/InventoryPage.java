package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    private WebDriver driver;

    private By cartBadge = By.className("shopping_cart_badge");

    private By backpackBtn = By.id("add-to-cart-sauce-labs-backpack");
    private By bikeLightBtn = By.id("add-to-cart-sauce-labs-bike-light");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addBackpack() {
        driver.findElement(backpackBtn).click();
    }

    public void addBikeLight() {
        driver.findElement(bikeLightBtn).click();
    }

    public int getCartCount() {
        return Integer.parseInt(driver.findElement(cartBadge).getText());
    }

    public String getBackpackButtonText() {
        return driver.findElement(backpackBtn).getText();
    }
}

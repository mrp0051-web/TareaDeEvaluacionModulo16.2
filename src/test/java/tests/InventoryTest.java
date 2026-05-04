package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.InventoryPage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryTest {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    private void login() {
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");
    }

    @Test
    public void anadirUnProductoAlCarrito() {
        login();

        InventoryPage inventory = new InventoryPage(driver);
        inventory.addBackpack();

        assertEquals(1, inventory.getCartCount());
    }

    @Test
    public void anadirDosProductosAlCarrito() {
        login();

        InventoryPage inventory = new InventoryPage(driver);
        inventory.addBackpack();
        inventory.addBikeLight();

        assertEquals(2, inventory.getCartCount());
    }

    @Test
    public void botonCambiaTrasAnadirProducto() {
        login();

        InventoryPage inventory = new InventoryPage(driver);
        inventory.addBackpack();

        assertEquals("Remove", inventory.getBackpackButtonText());
    }
}

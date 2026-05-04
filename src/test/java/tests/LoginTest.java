package tests;

import org.junit.jupiter.api.Test;
import org.example.pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    void loginCorrecto() {
        LoginPage login = new LoginPage(driver);

        login.loginCompleto("standard_user", "secret_sauce");

        assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

    @Test
    void loginIncorrecto() {
        LoginPage login = new LoginPage(driver);

        login.loginCompleto("standard_user", "mal_password");

        assertTrue(login.hayError());
    }
}
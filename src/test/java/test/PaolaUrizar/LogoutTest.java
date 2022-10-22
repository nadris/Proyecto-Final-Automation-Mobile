package test.PaolaUrizar;

import activity.Inventory.LoginScreen;
import activity.Inventory.MainScreen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogoutTest {
    LoginScreen loginScreen =  new LoginScreen();
    MainScreen mainScreen = new MainScreen();

    @Test
    public void verifySuccessLogout(){
        loginScreen.login();
        mainScreen.logoutButton.click();
        Assertions.assertTrue(loginScreen.isNameApplicationDisplayed("Mi Inventario"));
    }
}

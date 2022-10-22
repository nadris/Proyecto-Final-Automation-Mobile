package test.NoemiAncari;

import activity.Inventory.LoginScreen;
import activity.Inventory.MainScreen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {
    LoginScreen loginScreen =  new LoginScreen();
    MainScreen mainScreen = new MainScreen();

    @Test
    public void verifySuccessLogin(){
        loginScreen.login();
        Assertions.assertTrue(mainScreen.isMainMenuDisplayed());
    }

}

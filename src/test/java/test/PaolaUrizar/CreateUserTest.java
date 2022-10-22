package test.PaolaUrizar;

import activity.Inventory.LoginScreen;
import activity.Inventory.MainScreen;
import activity.Inventory.users.NewUserScreen;
import activity.Inventory.users.UsersScreen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateUserTest {

    LoginScreen loginScreen =  new LoginScreen();

    MainScreen mainScreen = new MainScreen();

    UsersScreen usersScreen = new UsersScreen();
    NewUserScreen newUserScreen = new NewUserScreen();

    @Test
    public void verifyCreateNewUser(){

        String nameUser = "Catolica";
        String lastnameUser = "UCB";
        String emailUser = "cato@gmail.com";
        String passwordUser = "clave123";
        String phoneUser = "7777777";

        loginScreen.login();
        mainScreen.usersButton.click();
        usersScreen.createUserButton.click();
        newUserScreen.createUser(nameUser,lastnameUser,emailUser, passwordUser,phoneUser);
        Assertions.assertTrue(mainScreen.isCreatedUserSuccessfull());

    }

}

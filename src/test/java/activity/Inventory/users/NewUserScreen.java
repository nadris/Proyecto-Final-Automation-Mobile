package activity.Inventory.users;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class NewUserScreen {

    public TextBox nameUserTxtBox = new TextBox(By.id("com.vendetta.miinventario:id/register_name"));
    public TextBox lastnameUserTxtBox = new TextBox(By.id("com.vendetta.miinventario:id/register_last"));
    public TextBox emailUserTxtBox = new TextBox(By.id("com.vendetta.miinventario:id/register_email"));
    public TextBox passwordUserTxtBox = new TextBox(By.id("com.vendetta.miinventario:id/register_password"));
    public TextBox phoneUserTxtBox = new TextBox(By.id("com.vendetta.miinventario:id/register_phone"));
    public Button registerUserButton = new Button(By.id("com.vendetta.miinventario:id/btn_register"));

    public void createUser(String nameUser, String lastnameUser , String emailUser , String passwordUser, String phoneUser){
        nameUserTxtBox.setText(nameUser);
        lastnameUserTxtBox.setText(lastnameUser);
        emailUserTxtBox.setText(emailUser);
        passwordUserTxtBox.setText(passwordUser);
        phoneUserTxtBox.setText(phoneUser);
        registerUserButton.click();
    }


}

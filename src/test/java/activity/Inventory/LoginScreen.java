package activity.Inventory;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class LoginScreen {

    public TextBox emailTxtBox =  new TextBox(By.id("com.vendetta.miinventario:id/login_email"));
    public TextBox passwordTxtBox =  new TextBox(By.id("com.vendetta.miinventario:id/login_password"));
    public Button loginButton = new Button(By.id("com.vendetta.miinventario:id/btn_login"));

    public void login(){
        emailTxtBox.setText("nadris.xhhj@gmail.com");
        passwordTxtBox.setText("nadris7001");
        loginButton.click();
    }

    public boolean isNameApplicationDisplayed(String title){
        Label nameApplication = new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return nameApplication.isControlDisplayed();
    }
}

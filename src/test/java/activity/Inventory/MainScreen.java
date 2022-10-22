package activity.Inventory;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainScreen {


    public Button productButton = new Button( By.id("com.vendetta.miinventario:id/productos_btn"));
    public Button salesButton = new Button(By.id("com.vendetta.miinventario:id/ventas_btn"));
    public Button logoutButton = new Button(By.id("com.vendetta.miinventario:id/btn_logout"));
    public Button usersButton = new Button(By.id("com.vendetta.miinventario:id/usuarios_btn"));

    public boolean isMainMenuDisplayed(){
        return productButton.isControlDisplayed();
    }

    public boolean isCreatedUserSuccessfull(){
        Label toast = new Label(By.xpath("//android.widget.Toast"));

        if((toast.getText()).equals("Usuario registrado con exito")){
            return true;
        }

        return false;
    }
    public MainScreen(){}
}

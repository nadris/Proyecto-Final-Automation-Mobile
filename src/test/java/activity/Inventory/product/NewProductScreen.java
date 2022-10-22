package activity.Inventory.product;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class NewProductScreen {
    public TextBox nameProductTxtBox = new TextBox(By.id("com.vendetta.miinventario:id/nuevoNameProducto"));
    public TextBox priceProductTxtBox = new TextBox(By.id("com.vendetta.miinventario:id/nuevoPrecio_producto"));
    public TextBox quantityProductTxtBox = new TextBox(By.id("com.vendetta.miinventario:id/nuevaCantidadProducto"));
    public Button createProductButton = new Button(By.id("com.vendetta.miinventario:id/crearNuevoProducto_btn"));

    public void createProduct(String name, String price, String quantity){
        nameProductTxtBox.setText(name);
        priceProductTxtBox.setText(price);
        quantityProductTxtBox.setText(quantity);
        createProductButton.click();
    }

}

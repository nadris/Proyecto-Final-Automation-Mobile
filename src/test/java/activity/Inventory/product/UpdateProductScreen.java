package activity.Inventory.product;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class UpdateProductScreen {

    public TextBox priceProductTxtBox = new TextBox(By.id("com.vendetta.miinventario:id/editarPrecio_producto"));
    public TextBox quantityProductTxtBox = new TextBox(By.id("com.vendetta.miinventario:id/editarCantidadProducto"));
    public Button editProductButton = new Button(By.id("com.vendetta.miinventario:id/editarNuevoProducto_btn"));

    public void updateProduct(String price, String quantity){
        priceProductTxtBox.setText(price);
        quantityProductTxtBox.setText(quantity);
        editProductButton.click();
    }

}

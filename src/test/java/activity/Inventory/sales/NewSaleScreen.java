package activity.Inventory.sales;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.Spinner;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class NewSaleScreen {
    public TextBox salePriceTxtBox = new TextBox(By.id("com.vendetta.miinventario:id/nuevoPrecio_ventas"));
    public TextBox saleQualityTxtBox = new TextBox(By.id("com.vendetta.miinventario:id/nuevaCantidad_ventas"));

    public Button createSaleButton = new Button(By.id("com.vendetta.miinventario:id/crearNuevaVenta_btn"));

    public void SelectedProduct(String nameProduct){
        Spinner products =  new Spinner(By.id("com.vendetta.miinventario:id/spinner_productos"));
        products.click();
        Label productItem = new Label(By.xpath("//android.widget.TextView[@text='"+nameProduct+"']"));
        productItem.click();
    }

    public void createSale(String nameProduct, String salePrice, String saleQuality){
        SelectedProduct(nameProduct);
        salePriceTxtBox.setText(salePrice);
        saleQualityTxtBox.setText(saleQuality);
        createSaleButton.click();
    }

}

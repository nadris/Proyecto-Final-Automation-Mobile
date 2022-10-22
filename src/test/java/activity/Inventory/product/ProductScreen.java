package activity.Inventory.product;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class ProductScreen {
    public Button createProductButton = new Button(By.id("com.vendetta.miinventario:id/btnCrearProducto"));

    public boolean isProductDisplayed(String nameProduct){
        Label product = new Label(By.xpath("//android.widget.TextView[@text='"+nameProduct+"']"));
        return product.isControlDisplayed();
    }

    public void clickUpdateProductButton(String nameProduct){
        Button updateProductButton = new Button(By.xpath("//android.widget.TextView[@text='"+nameProduct+"']/../android.widget.ImageButton[1]"));
        updateProductButton.click();
    }

    public boolean isProductUpdateDisplayed(String nameProduct, String price, String quantity ){
        Label updatedPrice = new Label(By.xpath("//android.widget.TextView[@text='"+nameProduct+"']/../android.widget.TextView[4]"));
        Label updatedQuantity= new Label(By.xpath("//android.widget.TextView[@text='"+nameProduct+"']/../android.widget.TextView[2]"));

        if((updatedPrice.getText()).equals(price) && (updatedQuantity.getText().replace("Cantidad: ", "")).equals(quantity) ){
            return true;
        }
        return false;
    }

    public void clickDeleteProductButton(String nameProduct){
        Button deleteProductButton = new Button(By.xpath("//android.widget.TextView[@text='"+nameProduct+"']/../android.widget.ImageButton[2]"));
        deleteProductButton.click();
    }

}

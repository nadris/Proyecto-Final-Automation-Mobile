package activity.Inventory.sales;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class SalesScreen {
    public Button createSalesButton = new Button(By.id("com.vendetta.miinventario:id/crearVenta_btn"));

    public boolean isSalesDisplayed(String nameProduct){
        Label product = new Label(By.xpath("//android.widget.TextView[@text='"+nameProduct+"']"));
        return product.isControlDisplayed();
    }
}

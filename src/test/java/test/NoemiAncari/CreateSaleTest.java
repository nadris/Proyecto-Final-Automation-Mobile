package test.NoemiAncari;

import activity.Inventory.LoginScreen;
import activity.Inventory.MainScreen;
import activity.Inventory.sales.NewSaleScreen;
import activity.Inventory.sales.SalesScreen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateSaleTest {

    LoginScreen loginScreen =  new LoginScreen();
    MainScreen mainScreen = new MainScreen();

    SalesScreen salesScreen = new SalesScreen();

    NewSaleScreen newSaleScreen = new NewSaleScreen();

    @Test
    public void verifyCreateNewSale(){
        String nameProduct= "Product 1";
        String salePrice = "100";
        String saleQuality = "2";
        loginScreen.login();
        mainScreen.salesButton.click();
        salesScreen.createSalesButton.click();
        newSaleScreen.createSale(nameProduct, salePrice, saleQuality);
        Assertions.assertTrue(salesScreen.isSalesDisplayed(nameProduct));

    }
}

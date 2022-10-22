package test.AdrianSossa;

import activity.Inventory.LoginScreen;
import activity.Inventory.MainScreen;
import activity.Inventory.product.DeleteProductModal;
import activity.Inventory.product.NewProductScreen;
import activity.Inventory.product.ProductScreen;
import activity.Inventory.product.UpdateProductScreen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CRUDProductsTest {
    LoginScreen loginScreen =  new LoginScreen();
    MainScreen mainScreen = new MainScreen();

    ProductScreen productScreen = new ProductScreen();
    NewProductScreen newProductScreen = new NewProductScreen();

    UpdateProductScreen updateProductScreen = new UpdateProductScreen();

    DeleteProductModal deleteProductModal =  new DeleteProductModal();

    @Test
    public void verifyCreateNewProduct(){
        String nameProduct = "Product 1";
        String price = "100";
        String quantity = "10";
        loginScreen.login();
        mainScreen.productButton.click();
        productScreen.createProductButton.click();
        newProductScreen.createProduct(nameProduct,price, quantity);
        Assertions.assertTrue(productScreen.isProductDisplayed(nameProduct));
    }

    @Test
    public void verifyUpdateProduct(){
        String nameProduct = "Product 1";
        String price = "100";
        String quantity = "10";

        String updatedPrice = "200";
        String updatedQuantity = "20";

        loginScreen.login();
        mainScreen.productButton.click();
        productScreen.createProductButton.click();
        newProductScreen.createProduct(nameProduct,price, quantity);
        productScreen.clickUpdateProductButton(nameProduct);
        updateProductScreen.updateProduct(updatedPrice,updatedQuantity);
        Assertions.assertTrue(productScreen.isProductUpdateDisplayed(nameProduct, updatedPrice,updatedQuantity));
    }

    @Test
    public void verifyDeleteProduct(){

        String nameProduct = "Product 300";
        String price = "300";
        String quantity = "30";

        loginScreen.login();
        mainScreen.productButton.click();
        productScreen.createProductButton.click();
        newProductScreen.createProduct(nameProduct,price, quantity);
        productScreen.clickDeleteProductButton(nameProduct);
        deleteProductModal.confirmDeleteProduct.click();
        Assertions.assertFalse(productScreen.isProductDisplayed(nameProduct));
    }

}

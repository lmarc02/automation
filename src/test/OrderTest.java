import main.pages.CartPage;
import main.pages.IndexPage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class OrderTest extends BaseTest {
    public static final String DELIVERY_ADDRESS = "Baia Mare, Utah 84097";

    IndexPage indexPage = new IndexPage(driver);
    CartPage cartPage = new CartPage(driver);

    @Test
    public void addProductToCart() throws InterruptedException {
        indexPage.addProductToTheCart();
        indexPage.clickProceedToCheckout();
        Assert.assertEquals(cartPage.isProductInCart(), true,
                "Product is not displayed in cart");}

    @Test(dependsOnMethods = {"addProductToCart"})
    public void CompleteOrderProduct(){
        cartPage.clickSummaryProceedToCheckout();
        Assert.assertEquals(cartPage.getDeliveryAddress(), DELIVERY_ADDRESS,
                "Delivery address is not correct");
        cartPage.clickAddressProceedToCheckout();
        Assert.assertEquals(cartPage.isDeliveryOptionDisplayed(), true, "Delivery options are not displayed.");
        cartPage.clickAgreeCheckbox();
        Assert.assertEquals(cartPage.isAgreeTermChecked(), true, "The agree terms are not checked");
        cartPage.clickShippingProceedToCheckout();
        Assert.assertEquals(cartPage.isShippingPageHeadingDisplayed(), true,
                "Page heading is no displayed on Address cart page.");
        Assert.assertEquals(cartPage.isPaymentCartSummaryDisplayed(), true,
                "Cart summary is not displayed on payment cart page.");
        Assert.assertEquals(cartPage.getQtyOnPaymentPage(), "1", "The item quantity number is not correct.");
        cartPage.clickPayByCheck();
        Assert.assertEquals(cartPage.isPaymentConfirmationDIsplayed(), true,
                "The payment confirmation is not displayed");
        cartPage.clickConfirmOrderButton();
        Assert.assertEquals(cartPage.isConfirmationMessageDisplayed(), true, "Order confirmation message is not displayed.");
    }
}

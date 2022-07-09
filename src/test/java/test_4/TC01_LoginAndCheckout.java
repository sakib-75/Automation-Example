package test_4;

import base.BaseClass;
import base.PageDriver;
import org.testng.annotations.Test;

import static utilities.CommonUtility.assertTrueUrl;

public class TC01_LoginAndCheckout extends BaseClass {

    @Test
    public void loginAndCheckout() throws InterruptedException {

        loginPage_POM login_page = new loginPage_POM();
        CartPage_POM cart_page = new CartPage_POM();
        InventoryPage_POM inventory_page = new InventoryPage_POM();
        CheckoutStepOne_POM checkout_page1 = new CheckoutStepOne_POM();
        CheckoutStepTwo_POM checkout_page2 = new CheckoutStepTwo_POM();

        PageDriver.getCurrentDriver().get("https://www.saucedemo.com/");

        login_page.login("standard_user", "secret_sauce");
        assertTrueUrl("https://www.saucedemo.com/inventory.html");

        int[] product_list = {1, 3, 2};
        for (int i = 0; i < 3; i++) {
            inventory_page.addToCartButton.get(product_list[i]).click();
        }
        inventory_page.cartButton.click();
        Thread.sleep(2000);
        cart_page.checkoutButton.click();

        checkout_page1.checkoutStepOne("Sakibul", "Islam", "1230");

        Thread.sleep(2000);
        checkout_page2.finishOder();

        assertTrueUrl("https://www.saucedemo.com/checkout-complete.html");

    }

}

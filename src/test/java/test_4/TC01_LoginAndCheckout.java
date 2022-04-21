package test_4;

import base.BaseClass;
import base.PageDriver;
import org.testng.annotations.Test;

import static utilities.CommonUtility.assertTrueUrl;

public class TC01_LoginAndCheckout extends BaseClass {

    @Test
    public void loginAndCheckout(){
        loginPage_POM login_page = new loginPage_POM();
        PageDriver.getCurrentDriver().get("https://www.saucedemo.com/");

        login_page.login("standard_user","secret_sauce");

        assertTrueUrl("https://www.saucedemo.com/inventory.html");

    }

}

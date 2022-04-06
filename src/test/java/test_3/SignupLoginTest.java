package test_3;

import base.BaseClass;
import base.PageDriver;
import data_set.DataSet;
import org.testng.annotations.Test;

public class SignupLoginTest extends BaseClass {

    @Test(priority = 1, dataProvider = "signupData", dataProviderClass = DataSet.class)
    public void signupTest(String name, String email, String password) {

        HomePage_POM home_page = new HomePage_POM();
        SignupPage_POM signup_page = new SignupPage_POM();

        PageDriver.getCurrentDriver().get("https://letcode.in/");
        home_page.signupButtonClick();
        signup_page.signupInfo(name, email, password);
        signup_page.signupSubmit();

    }

    @Test(priority = 2, dataProvider = "loginData", dataProviderClass = DataSet.class)
    public void loginTest(String email, String password) {

        HomePage_POM home_page = new HomePage_POM();
        LoginPage_POM login_page = new LoginPage_POM();

        PageDriver.getCurrentDriver().get("https://letcode.in/");
        home_page.loginButtonClick();
        login_page.loginInfo(email, password);
        login_page.loginSubmit();
        login_page.logout();

    }


}

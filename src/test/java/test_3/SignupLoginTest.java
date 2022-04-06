package test_3;

import base.BaseClass;
import base.PageDriver;
import data_set.DataSet;
import org.testng.annotations.Test;

public class SignupLoginTest extends BaseClass {

    LoginPage_POM login_page = new LoginPage_POM();

    @Test(dataProvider = "signupData", dataProviderClass = DataSet.class)
    public void signup(String name, String email, String password) {

        HomePage_POM home_page = new HomePage_POM();
        SignupPage_POM signup_page = new SignupPage_POM();
        PageDriver.getCurrentDriver().get("https://letcode.in/");
        home_page.signupButtonClick();
        signup_page.signupInfo(name, email, password);
        signup_page.signupButtonClick();

    }


}

package test_3;

import base.PageDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_POM {

    public LoginPage_POM() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

}

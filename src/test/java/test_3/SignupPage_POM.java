package test_3;

import base.PageDriver;
import org.openqa.selenium.support.PageFactory;

public class SignupPage_POM {

    public SignupPage_POM() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

}

package test_4;

import base.PageDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOne_POM {

    public CheckoutStepOne_POM() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

}

package test_4;

import base.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utilities.CommonUtility.scrollToElement;

public class CheckoutStepTwo_POM {

    public CheckoutStepTwo_POM() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;

    @FindBy(xpath = "//button[@id='cancel']")
    WebElement cancelButton;

    public void finishOder() {
        scrollToElement(finishButton);
        finishButton.click();

    }

}

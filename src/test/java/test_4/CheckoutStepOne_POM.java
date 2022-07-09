package test_4;

import base.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utilities.CommonUtility.*;

public class CheckoutStepOne_POM {

    public CheckoutStepOne_POM() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement zipCodeInput;

    @FindBy(id = "continue")
    WebElement continueButton;

    @FindBy(id = "cancel")
    WebElement cancelButton;

    public void checkoutStepOne(String first_name, String last_name, String zip_code) {
        sendText(firstNameInput, first_name);
        sendText(lastNameInput, last_name);
        sendText(zipCodeInput, zip_code);
        continueButton.click();
    }

}

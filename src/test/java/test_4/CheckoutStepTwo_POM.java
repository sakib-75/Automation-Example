package test_4;

import base.PageDriver;
import io.qameta.allure.Step;
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

    @Step("Finish order")
    public void finishOder() {
        scrollToElement(finishButton);
        finishButton.click();

    }

}

package test_3;

import base.PageDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utilities.CommonUtility.screenshotForAllure;
import static utilities.CommonUtility.sendText;

public class SignupPage_POM {

    public SignupPage_POM() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(id = "name")
    WebElement nameInput;

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(xpath = "//input[@id='pass']")
    WebElement passwordInput;

    @Step("Set name, email and password input")
    public void setNameInput(String name, String email, String password) {
        sendText(nameInput, name);
        sendText(emailInput, email);
        sendText(passwordInput, password);
        screenshotForAllure("Signup information");

    }


}

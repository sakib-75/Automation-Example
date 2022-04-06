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

    @FindBy(xpath = "//input[@id='agree']")
    WebElement agree;

    @FindBy(xpath = "//button[normalize-space()='SIGN UP']")
    WebElement signupBtn;

    @Step("Set name, email and password input")
    public void signupInfo(String name, String email, String password) {
        sendText(nameInput, name);
        sendText(emailInput, email);
        sendText(passwordInput, password);
        agree.click();
        screenshotForAllure("Signup information");
    }

    public void signupButtonClick() {
        signupBtn.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        screenshotForAllure("After signup button click");
    }


}

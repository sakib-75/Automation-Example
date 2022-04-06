package test_3;

import base.PageDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utilities.CommonUtility.screenshotForAllure;
import static utilities.CommonUtility.sendText;

public class LoginPage_POM {

    public LoginPage_POM() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(name = "email")
    WebElement emailInput;

    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(xpath = "//button[normalize-space()='LOGIN']")
    WebElement loginBtn;

    @FindBy(xpath = "//a[normalize-space()='Sign out']")
    WebElement logoutBtn;

    @Step("Provide an Email & Password input")
    public void loginInfo(String email, String password) {
        sendText(emailInput, email);
        sendText(passwordInput, password);
        screenshotForAllure("Login information");
    }

    public void loginSubmit() {
        loginBtn.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        screenshotForAllure("After login button click");
    }

    public void logout() {
        logoutBtn.click();
    }


}

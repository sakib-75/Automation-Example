package test_3;

import base.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public void loginInfo(String email, String password) {
        sendText(emailInput, email);
        sendText(passwordInput, password);
    }

    public void loginSubmit() {
        loginBtn.click();
    }

    public void logout() {
        logoutBtn.click();
    }


}

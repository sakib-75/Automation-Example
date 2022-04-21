package test_4;

import base.PageDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static utilities.CommonUtility.*;

public class loginPage_POM {

    public loginPage_POM() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(id = "user-name")
    WebElement userNameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @Step("Login user")
    public void login(String user_name, String password){
        sendText(userNameInput, user_name);
        sendText(passwordInput, password);
        loginButton.click();
    }
    
}

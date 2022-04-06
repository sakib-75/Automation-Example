package test_3;

import base.PageDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_POM {

    public HomePage_POM() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Sign up']")
    WebElement signupButton;

    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginButton;

    @Step("Click on signup button")
    public void signupButtonClick() {
        signupButton.click();
    }

    @Step("Click on login button")
    public void loginButtonClick() {
        loginButton.click();
    }

}

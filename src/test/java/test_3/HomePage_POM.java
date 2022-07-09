package test_3;

import base.PageDriver;
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

    public void signupButtonClick() {
        signupButton.click();
    }

    public void loginButtonClick() {
        loginButton.click();
    }

}

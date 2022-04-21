package test_4;

import base.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage_POM {

    public CartPage_POM() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Remove']")
    List<WebElement> removeFromCartButton;

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButton;

    @FindBy(xpath = "//button[@id='continue-shopping']")
    WebElement continueShoppingButton;

}

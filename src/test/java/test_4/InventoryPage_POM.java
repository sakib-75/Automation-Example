package test_4;

import base.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InventoryPage_POM {

    public InventoryPage_POM() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cartButton;

    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")
    List<WebElement> addToCartButton;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement productSort;

}

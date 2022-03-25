package test_1;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.CommonUtility;

public class SelectDropDown extends BaseClass {

    public String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

    @Test
    public void selectingValueFromDropdown() {

        driver.get(baseUrl);
        CommonUtility.implicitWait(driver, 5);

        driver.switchTo().frame("iframeResult");

        WebElement el = driver.findElement(By.name("cars"));
        Select s = new Select(el);
        s.selectByIndex(0);
        actions.keyDown(Keys.CONTROL)
                .click(s.getOptions().get(3))
                .click(s.getOptions().get(1))
                .keyUp(Keys.CONTROL)
                .build().perform();

        //deselectAll( ):
        //deselectByValue( )
        //deselectByVisibleText( ):
        //getAllSelectedOptions( ):

        driver.switchTo().defaultContent();
    }

}

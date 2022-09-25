package test_examples;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.CommonUtility;

public class ClickAction extends BaseClass {

    public String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

    @Test
    public void doubleClickRightClick() throws InterruptedException {
        driver.get(baseUrl);
        CommonUtility.implicitWait(driver, 5);

        driver.switchTo().frame("iframeResult");

        WebElement double_click = driver.findElement(By.xpath("//p[contains(text(),'The multiple attribute specifies that multiple opt')]"));
        actions.doubleClick(double_click).build().perform();
        Thread.sleep(2000);

        WebElement right_click = driver.findElement(By.xpath("//body/form[1]/input[1]"));
        actions.contextClick(right_click).build().perform();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();


        //click()
        //doubleClick
        //dragAndDrop( )
        //clickAndHold( )
        //keyDown( )
        //keyUp( )
        //release( )

        //build( )
        //perform();

    }

}

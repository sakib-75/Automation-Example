package test_1;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.CommonUtility;

public class KeyboardEvent extends BaseClass {
    public String baseUrl = "http://automationpractice.com/index.php";

    @Test
    public void KeyboardEventCheck() throws InterruptedException {

        driver.get(baseUrl);
        CommonUtility.implicitWait(driver, 5);

        WebElement e = driver.findElement(By.xpath("//input[@id='search_query_top']"));
        e.sendKeys(Keys.chord(Keys.SHIFT, "tedtalk"));

        e.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        e.sendKeys(Keys.chord(Keys.ENTER));

        Thread.sleep(2000);

    }

}

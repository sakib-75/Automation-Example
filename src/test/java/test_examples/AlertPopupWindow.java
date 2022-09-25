package test_examples;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.CommonUtility;

public class AlertPopupWindow extends BaseClass {
    public String baseUrl = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";

    @Test
    public void alertHandlingCheck() throws InterruptedException {
        driver.get(baseUrl);
        CommonUtility.implicitWait(driver, 5);

        WebElement b=driver.findElement(By.name("iframeResult"));
        driver.switchTo().frame(b);
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();

    }

}

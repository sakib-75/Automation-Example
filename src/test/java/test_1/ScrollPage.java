package test_1;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.CommonUtility;

public class ScrollPage extends BaseClass {

    public String baseUrl = "https://www.seleniumhq.org";

    @Test
    public void scrollCheck() throws InterruptedException {

        driver.get(baseUrl);
        CommonUtility.implicitWait(driver, 5);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Scroll to Bottom
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        Thread.sleep(2000);

        //Scroll to Top
        js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
        Thread.sleep(2000);

        //Scroll to specific Element
        WebElement element = driver.findElement(By.xpath("(//div[@class='row justify-content-center p-5'])[1]"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(2000);

    }

}

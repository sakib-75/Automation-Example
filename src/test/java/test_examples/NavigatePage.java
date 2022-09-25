package test_examples;

import base.BaseClass;
import org.testng.annotations.Test;
import utilities.CommonUtility;

public class NavigatePage extends BaseClass {

    public String baseUrl = "https://www.w3schools.com";

    @Test
    public void refreshPage() throws InterruptedException {

        driver.get(baseUrl);
        CommonUtility.implicitWait(driver, 5);

        driver.navigate().to("http://www.google.com");

        Thread.sleep(1000);
        driver.navigate().back();

        Thread.sleep(1000);
        driver.navigate().forward();

        Thread.sleep(1000);
        driver.navigate().refresh();

    }

}

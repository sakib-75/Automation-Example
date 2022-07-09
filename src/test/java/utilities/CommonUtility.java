package utilities;

import base.PageDriver;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.*;
import org.testng.Assert;

import java.time.Duration;

public class CommonUtility {
    public static void implicitWait(@NotNull WebDriver driver, int time) {
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    public static void sendText(@NotNull WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public static void assertEquals(String actual, String expected) {
        System.out.println("Actual: " + actual);
        System.out.println("Expected: " + expected);

        Assert.assertEquals(actual, expected);
    }

    public static void assertTrueUrl(String expectedUrl) {

        String currentUrl = PageDriver.getCurrentDriver().getCurrentUrl();
        boolean condition = currentUrl.contains(expectedUrl);

        System.out.println("Current URL: " + currentUrl);
        System.out.println("Expected URL: " + expectedUrl);

        if (condition) {
            System.out.println("Passed...! Expected URL contains in Current URL");
        } else {
            System.out.println("Current URL does not contain expected URL");
        }
        // Assertions
        Assert.assertTrue(condition);
    }

    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


}

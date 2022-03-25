package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;

public class CommonUtility {
    public static void implicitWait(WebDriver driver, int time) {
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    public static void assertEquals(String actual, String expected) {
        System.out.println("Actual: " + actual);
        System.out.println("Expected: " + expected);

        Assert.assertEquals(actual, expected);
    }

    public static void assertTrueUrl(WebDriver driver, String expectedUrl) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String currentUrl = driver.getCurrentUrl();
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


}

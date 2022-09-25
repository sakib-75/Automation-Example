package test_examples;

import base.BaseClass;
import org.testng.annotations.Test;
import utilities.CommonUtility;

public class Verify_Title_URL extends BaseClass {

    public String baseUrl = "http://automationpractice.com";

    @Test(priority = 1)
    public void verifyTitle() {
        driver.get(baseUrl);

        String title = driver.getTitle();
        CommonUtility.assertEquals("My Store", title);

    }

    @Test(priority = 2)
    public void verifyUrl() {
        String expected_url = "automationpractice.com";
        CommonUtility.assertTrueUrl(expected_url);

    }

    @Test(priority = 3)
    public static void isWebsiteSecured() {
        String url = driver.getCurrentUrl();
        if (url.contains("https")) {
            System.out.println("Site is secured");
        } else {
            System.out.println("Site is not secured");
        }
    }


}

package test_2;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.CommonUtility;

import java.util.List;

public class SearchFlights extends BaseClass {

    public String baseUrl = "https://www.yatra.com/";

    @Test
    public void s() throws InterruptedException {
        driver.get(baseUrl);
        CommonUtility.implicitWait(driver, 5);

        // Select depart from
        WebElement depart_from_inp = driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']"));
        depart_from_inp.click();
        String depart_city = "Chennai (MAA)";

        List<WebElement> all_depart_option = driver.findElements(By.xpath("//div[@class='viewport']//div[1]/li"));
        for (WebElement city : all_depart_option) {
            if (city.getText().contains(depart_city)) {
                city.click();
                break;
            }
        }
        Thread.sleep(2000);

        // Select going to
        WebElement going_to_inp = driver.findElement(By.xpath("//input[@id='BE_flight_arrival_city']"));
        

    }

}

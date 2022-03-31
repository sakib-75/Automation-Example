package test_2;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.CommonUtility;

import java.util.List;

public class SearchFlights extends BaseClass {

    public String baseUrl = "https://www.yatra.com/";

    @Test
    public void searchFlights() throws InterruptedException {
        driver.get(baseUrl);
        CommonUtility.implicitWait(driver, 5);

        // Select depart from
        WebElement depart_from_inp = driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']"));
        depart_from_inp.click();
        String depart_city = "Chennai (MAA)";
        selectCity(depart_city);
        Thread.sleep(1000);

        // Select going to
        WebElement going_to_inp = driver.findElement(By.xpath("//input[@id='BE_flight_arrival_city']"));
        going_to_inp.click();
        String going_to_city = "Goa (GOI)";
        selectCity(going_to_city);
        Thread.sleep(1000);

    }

    public static void selectCity(String city_name){
        List<WebElement> all_city = driver.findElements(By.xpath("//div[@class='viewport']//div[1]/li"));
        for (WebElement city : all_city) {
            if (city.getText().contains(city_name)) {
                city.click();
                break;
            }
        }
    }

}

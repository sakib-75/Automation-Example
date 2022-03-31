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
    public void searchFlights() throws InterruptedException {

        HomePage_POM pom = new HomePage_POM(driver);
        driver.get(baseUrl);
        CommonUtility.implicitWait(driver, 5);

        // Select depart from
        pom.depart_from_inp().click();
        String depart_city = "Chennai (MAA)";
        selectCity(pom, depart_city);
        Thread.sleep(1000);

        // Select going to
        pom.going_to_inp().click();
        String going_to_city = "Goa (GOI)";
        selectCity(pom, going_to_city);
        Thread.sleep(1000);

        // Select date
       pom.departure_date().click();
        for (WebElement date : pom.all_date()) {
            if (date.getAttribute("data-date").equals("12/04/2022")){
                date.click();
                break;
            }
        }
        Thread.sleep(3000);

    }

    public static void selectCity(HomePage_POM pom, String city_name) {
        for (WebElement city : pom.all_city()) {
            if (city.getText().contains(city_name)) {
                city.click();
                break;
            }
        }
    }

}

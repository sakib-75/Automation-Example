package test_2;

import base.BaseClass;
import base.PageDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.CommonUtility;

import static utilities.CommonUtility.implicitWait;

public class SearchFlights extends BaseClass {

    public String baseUrl = "https://www.yatra.com/";

    @Test
    public void searchFlights() throws InterruptedException {

        WebDriver driver = PageDriver.getCurrentDriver();
        driver.get(baseUrl);
        implicitWait(driver, 5);
        HomePage_POM home = new HomePage_POM();

        // Select depart from
        home.departFromClick();
        String depart_city = "Chennai (MAA)";
        home.selectCity(depart_city);
        Thread.sleep(1000);

        // Select going to
        home.goingToClick();
        String going_to_city = "Goa (GOI)";
        home.selectCity(going_to_city);
        Thread.sleep(1000);

        // Select departure date
        home.departureDateClick();
        String departure_date = "12/07/2022";
        home.selectDate(departure_date);
        Thread.sleep(1000);

        // Select return date
        home.returnDateClick();
        String return_date = "16/07/2022";
        home.selectDate(return_date);
        Thread.sleep(1000);

        home.traveller_class.click();
        home.adults.click();
        home.senior_citizen.click();
        home.search_flights_btn.click();

        CommonUtility.assertTrueUrl("air-search-ui");

    }


}

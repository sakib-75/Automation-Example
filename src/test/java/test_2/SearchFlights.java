package test_2;

import base.BaseClass;
import org.testng.annotations.Test;

import static utilities.CommonUtility.implicitWait;
import static utilities.Test2Utility.selectCity;
import static utilities.Test2Utility.selectDate;

public class SearchFlights extends BaseClass {

    public String baseUrl = "https://www.yatra.com/";

    @Test
    public void searchFlights() throws InterruptedException {

        HomePage_POM pom = new HomePage_POM(driver);
        driver.get(baseUrl);
        implicitWait(driver, 5);

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
        String select_date = "12/04/2022";
        selectDate(pom, select_date);

        Thread.sleep(1000);

    }


}

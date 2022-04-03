package utilities;

import org.openqa.selenium.WebElement;

import java.util.List;

public class Test2Utility {

    public static void selectCity(List<WebElement> all_city, String city_name) {
        for (WebElement city : all_city) {
            if (city.getText().contains(city_name)) {
                city.click();
                break;
            }
        }
    }

    public static void selectDate(List<WebElement> all_date, String select_date) {
        for (WebElement date : all_date) {
            if (date.getAttribute("data-date").equals(select_date)) {
                date.click();
                break;
            }
        }
    }


}

package utilities;

import org.openqa.selenium.WebElement;
import test_2.HomePage_POM;

public class Test2Utility {

    public static void selectCity(HomePage_POM pom, String city_name) {
        for (WebElement city : pom.all_city()) {
            if (city.getText().contains(city_name)) {
                city.click();
                break;
            }
        }
    }

    public static void selectDate(HomePage_POM pom, String select_date) {
        for (WebElement date : pom.all_date()) {
            if (date.getAttribute("data-date").equals(select_date)) {
                date.click();
                break;
            }
        }
    }


}

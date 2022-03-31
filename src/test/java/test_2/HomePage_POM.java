package test_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage_POM {

    WebDriver driver;
    public HomePage_POM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='BE_flight_origin_city']")
    WebElement depart_from_inp;

    @FindBy(xpath = "//input[@id='BE_flight_arrival_city']")
    WebElement going_to_inp;

    @FindBy(xpath = "//input[@id='BE_flight_origin_date']")
    WebElement departure_date;

    @FindBy(xpath = "//div[@id='monthWrapper']//tbody//td[@class!='inActiveTd']")
    List<WebElement> all_date;

    @FindBy(xpath = "//div[@class='viewport']//div[1]/li")
    List<WebElement> all_city;

    public WebElement depart_from_inp(){
        return depart_from_inp;
    }

    public WebElement going_to_inp(){
        return going_to_inp;
    }

    public WebElement departure_date(){
        return departure_date;
    }

    public List<WebElement> all_date(){
        return all_date;
    }

    public List<WebElement> all_city(){
        return all_city;
    }


}

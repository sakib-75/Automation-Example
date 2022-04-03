package test_2;

import base.PageDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import utilities.Test2Utility;

public class HomePage_POM {

    public HomePage_POM() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//input[@id='BE_flight_origin_city']")
    WebElement depart_from_inp;

    @FindBy(xpath = "//input[@id='BE_flight_arrival_city']")
    WebElement going_to_inp;

    @FindBy(xpath = "//input[@id='BE_flight_origin_date']")
    WebElement departure_date;

    @FindBy(xpath = "//input[@id='BE_flight_arrival_date']")
    WebElement return_date;

    @FindBy(xpath = "//div[@id='monthWrapper']//tbody//td[@class!='inActiveTd']")
    List<WebElement> all_date;

    @FindBy(xpath = "//div[@class='viewport']//div[1]/li")
    List<WebElement> all_city;

    @FindBy(xpath = "//span[@class='txt-ellipses flight_passengerBox travellerPaxBox']")
    WebElement traveller_class;

    @FindBy(xpath = "(//span[@class='ddSpinnerPlus'])[1]")
    WebElement adults;

    @FindBy(xpath = "//a[normalize-space()='Senior Citizen']")
    WebElement senior_citizen;

    @FindBy(xpath = "(//input[@id='BE_flight_flsearch_btn'])[1]")
    WebElement search_flights_btn;


    @Step("Click on depart from input")
    public void departFromClick() {
        depart_from_inp.click();
    }

    @Step("Click on going to input")
    public void goingToClick() {
        going_to_inp.click();
    }

    @Step("Select specific city")
    public void selectCity(String name) {
        Test2Utility.selectCity(all_city, name);
    }

    @Step("Click on departure date")
    public void departureDateClick() {
        departure_date.click();
    }

    @Step("Click on return date")
    public void returnDateClick() {
        return_date.click();
    }

    @Step("Select date")
    public void selectDate(String date) {
        Test2Utility.selectDate(all_date, date);
    }

}

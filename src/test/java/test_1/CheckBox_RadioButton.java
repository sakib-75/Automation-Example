package test_1;

import base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.CommonUtility;

// Selection of Radio button and Check box in Frames:
public class CheckBox_RadioButton extends BaseClass {

    public String baseUrl = "https://jqueryui.com/checkboxradio";

    @Test
    public void CheckBoxAndRadioButtonInFrame() {

        driver.get(baseUrl);
        CommonUtility.implicitWait(driver,5);

        // Switch to Frame
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("(//span[contains(@class,'checkboxradio')])[5]")).click();
        driver.findElement(By.xpath("//body/div[1]/fieldset[1]/label[3]")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/fieldset[2]/label[4]/span[1]")).click();

        // Back to page
        driver.switchTo().defaultContent();

    }

}

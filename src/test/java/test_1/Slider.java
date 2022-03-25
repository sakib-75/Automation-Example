package test_1;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.CommonUtility;

public class Slider extends BaseClass {

    public String baseUrl = "https://jqueryui.com/slider/";

    @Test
    public void sliderCheck() throws InterruptedException {

        driver.get(baseUrl);
        CommonUtility.implicitWait(driver, 10);

        //Horizontal Slider
        driver.switchTo().frame(0);
        WebElement e=driver.findElement(By.xpath("//div[@id='slider']/span"));

        actions.dragAndDropBy(e,300,0).build().perform();
        actions.dragAndDropBy(e,-200,0).build().perform();

        driver.switchTo().defaultContent();

        //Vertical Slider
        driver.findElement(By.linkText("Vertical slider")).click();
        Thread.sleep(1000);

        driver.switchTo().frame(0);
        WebElement e1=driver.findElement(By.xpath("//div[@id='slider-vertical']/descendant::span"));

        actions.dragAndDropBy(e1,0,100).build().perform();
        actions.dragAndDropBy(e1,0,-200).build().perform();

        driver.switchTo().defaultContent();

    }

}

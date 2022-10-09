package test_examples;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.CommonUtility;

public class KeyboardEvent extends BaseClass {
    public String baseUrl = "http://automationpractice.com/index.php";

    @Test
    public void KeyboardEventCheck() throws InterruptedException {

        driver.get(baseUrl);
        CommonUtility.implicitWait(driver, 5);

        WebElement e = driver.findElement(By.xpath("//input[@id='search_query_top']"));
        e.sendKeys("smartphone");

        e.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        e.sendKeys(Keys.chord(Keys.ENTER));

        Thread.sleep(2000);

    }

    @Test
    public void keyboardEventCheck2() throws InterruptedException {
        driver.get("https://letcode.in/edit");

        WebElement input1 = driver.findElement(By.id("join"));
        WebElement input2 = driver.findElement(By.id("getMe"));

        Actions actions = new Actions(driver);
        actions.moveToElement(input1).click()
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build().perform();

        Thread.sleep(5000);

        actions.moveToElement(input2).click()
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("v")
                .keyUp(Keys.CONTROL)
                .build().perform();

        Thread.sleep(5000);

    }

    @Test
    public void keyboardEventCheck3() throws InterruptedException {
        driver.get("https://letcode.in/edit");

        WebElement input1 = driver.findElement(By.id("join"));
        WebElement input2 = driver.findElement(By.id("getMe"));

        input1.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        input1.sendKeys(Keys.chord(Keys.CONTROL, "c"));

        Thread.sleep(5000);

        input2.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        input2.sendKeys(Keys.chord(Keys.CONTROL, "v"));

        Thread.sleep(5000);

    }

}

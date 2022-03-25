package test_1;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.CommonUtility;

public class DragAndDrop extends BaseClass {

    public String baseUrl = "https://jqueryui.com/droppable";

    @Test
    public void dragAndDropCheck() {

        driver.get(baseUrl);
        CommonUtility.implicitWait(driver, 5);

        // Drag and Drop
        driver.switchTo().frame(0);

        WebElement e1 = driver.findElement(By.id("draggable"));
        WebElement e2 = driver.findElement(By.id("droppable"));

        actions.dragAndDrop(e1, e2).build().perform();
        driver.switchTo().defaultContent();

    }

}

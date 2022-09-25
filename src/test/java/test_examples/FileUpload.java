package test_examples;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;

public class FileUpload extends BaseClass {

    @Test
    public void file_upload() throws InterruptedException {

        driver.get("https://www.monsterindia.com/seeker/registration");

        File file_dir = new File("src/test/java/resources");
        File file = new File(file_dir, "image.jpg");

        WebElement browse_file = driver.findElement(By.id("file-upload"));
        browse_file.sendKeys(file.getAbsolutePath());
        Thread.sleep(2000);
        System.out.println("File is Uploaded Successfully");

    }

}

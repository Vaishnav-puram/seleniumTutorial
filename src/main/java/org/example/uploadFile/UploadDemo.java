package org.example.uploadFile;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class UploadDemo {
    @Test
    public  void sampleUpload() throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        //maximize browser window
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:/Users/Guest007/Downloads/SDET.pdf");
        driver.findElement(By.xpath("//input[@id='file-submit']")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).isDisplayed());
        driver.quit();
    }
}

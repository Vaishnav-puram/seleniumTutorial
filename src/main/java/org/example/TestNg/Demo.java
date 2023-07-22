package org.example.TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class Demo {
    @Parameters({"URL"})
    @Test(groups = {"smoke"})
    public  void sampleAutomation(String url) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //maximize browser window
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='alert1']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}

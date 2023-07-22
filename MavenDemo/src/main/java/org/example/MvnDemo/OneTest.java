package org.example.MvnDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class OneTest { //class should end with 'Test'
    WebDriver driver;
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        //maximize browser window
        driver.manage().window().maximize();
        String actual=driver.findElement(By.xpath("//p[text()='PracticeAutomationHere']")).getText();
        Assert.assertEquals(actual,"PracticeAutomationHere");
    }

    @AfterMethod
    public void closure(){
        driver.quit();
    }
}


package org.example.TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ListenersDemo {

    @Test
    @Parameters({"A"})
    public void test1(int a){
        int b=5,c=6;
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        if(a==1){
            Assert.assertTrue(b<c);
        } else if (a==2) {
            Assert.assertTrue(b>c);
        } else if (a==3) {
            throw new SkipException("Test is skipped");
        }
        driver.quit();
    }
}

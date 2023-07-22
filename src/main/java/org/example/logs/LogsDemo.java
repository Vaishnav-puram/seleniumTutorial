package org.example.logs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogsDemo {
    //logs xml file name should be strictly 'log4j2.xml' and be placed in resource folder
    //by default only error logs will be displayed
    @Test
    public static void test() throws InterruptedException {
        Logger log= LogManager.getLogger(LogsDemo.class.getName());
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        log.debug("Test execution started...");
        driver.manage().window().maximize();
        log.debug("window is maximised");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.linkText("compendiumdev")).click();
        log.debug("link text is being clicked..");
        driver.navigate().back();
        log.debug("page navigated to back");
        driver.navigate().forward();
        log.debug("page navigated to forward");
        if(driver.getTitle().equalsIgnoreCase("Basic Web Page Title")){
            log.info("Success: correct page title displayed");
        }else{
            log.error("Failure: incorrect page title displayed");
        }
        driver.quit();
        log.debug("browser closed");
    }
}

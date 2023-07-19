package org.example.handlingWindowsAlertsWaiting.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertsDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        //maximize browser window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.id("alert1")).click();
        Alert alert=driver.switchTo().alert();
        String string=alert.getText();
        System.out.println("string present in alert box is -->"+string);
        alert.accept();//to click ok
        driver.quit();
    }
}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/java/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.id("input-email")).sendKeys("vaishv@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("pass@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

    }
}

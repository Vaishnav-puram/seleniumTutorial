package org.example.frames_lightbox_actions.lightbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LightBoxDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/p/lightbox.html");
        //maximize browser window
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//img[@id='lightbox1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='close cursor']")).click();
    }
}

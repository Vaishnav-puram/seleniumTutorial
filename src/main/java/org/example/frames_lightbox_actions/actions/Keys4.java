package org.example.frames_lightbox_actions.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        //maximize browser window
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement element=driver.findElement(By.id("ta1"));
        actions.keyDown(Keys.SHIFT).sendKeys(element,"vaishnav").keyUp(Keys.SHIFT).build().perform();
        driver.close();

    }
}

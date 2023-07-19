package org.example.handlingWindowsAlertsWaiting.frames_lightbox_actions.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        //maximize browser window
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        driver.findElement(By.name("userid")).sendKeys("Vaishnav");
        actions.sendKeys(Keys.TAB).perform();
        driver.findElement(By.name("pswrd")).sendKeys("Puram");
//      actions.sendKeys(Keys.TAB).perform();
//      actions.sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        driver.quit();

    }
}

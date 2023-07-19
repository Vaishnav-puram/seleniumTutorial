package org.example.handlingWindowsAlertsWaiting.frames_lightbox_actions.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovingMouseandClick {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        //maximize browser window
        driver.manage().window().maximize();
        Actions actions=new Actions(driver);
        WebElement element=driver.findElement(By.id("blogsmenu"));
        actions.moveToElement(element).perform(); // important to add the method perform
        WebElement element1=driver.findElement(By.xpath("//a/span[text()='Selenium143']"));
//      actions.moveToElement(element1).perform();
//      actions.click(element1).perform();
        actions.moveToElement(element1).click().build().perform();
        driver.quit();




    }
}

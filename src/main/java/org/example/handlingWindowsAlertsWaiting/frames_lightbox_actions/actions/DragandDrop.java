package org.example.handlingWindowsAlertsWaiting.frames_lightbox_actions.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        //maximize browser window
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement source=driver.findElement(By.xpath("//div[@id='box5']"));
        WebElement destination=driver.findElement(By.xpath("//div[@id='box105']"));
        actions.dragAndDrop(source,destination).perform();
        driver.quit();
    }

}

package org.example.frames_lightbox_actions.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropBy {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/p/page3.html");
        //maximize browser window
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-btn ui-shadow ui-btn-null' and @title='200']"));
        actions.dragAndDropBy(element,100,0).perform(); //move to right
        actions.dragAndDropBy(element,-200,0).perform(); //move to left
        driver.quit();

    }
}

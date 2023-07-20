package org.example.frames_lightbox_actions.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        //maximize browser window
        driver.manage().window().maximize();

        //we have to switch to frame
        WebElement element=driver.findElement(By.id("iframe1"));
        //driver.switchTo().frame(element);
        //perform operations
        //driver.switchTo().defaultContent(); //switches the control back to default / main page
        System.out.println("no.of frames in the document are -->"+driver.findElements(By.tagName("iframe")).size());
        driver.quit();
    }
}

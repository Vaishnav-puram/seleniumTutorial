package org.example.autosuggestivedropdows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.time.Duration;

public class Demo {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        //maximize browser window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement element=driver.findElement(By.xpath("//div[@class='imageSlideContainer']"));
        driver.navigate().refresh();

        driver.findElement(By.xpath("//input[@id='fromCity']")).click();
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("D");
        Thread.sleep(2000);
        for(int i=0;i<4;i++){
            driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
        }
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//input[@id='toCity']")).click();
        driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("M");
        Thread.sleep(2000);
        for(int i=0;i<1;i++){
            driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.DOWN);
        }
        driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
        driver.quit();

    }
}

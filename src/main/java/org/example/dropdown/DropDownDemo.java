package org.example.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        //maximize browser window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //driver.findElement(By.id("drop1")).sendKeys("doc 3"); //wrong way to select options from dropdowm field
        WebElement dropdown=driver.findElement(By.id("drop1"));
        WebElement multiselect=driver.findElement(By.id("multiselect1"));
        Thread.sleep(2000);
        Select select=new Select(dropdown);
        Select select1=new Select(multiselect);
        select.selectByValue("doc 3");
        //select.selectByIndex(1);
        select1.selectByVisibleText("Volvo");
        select1.selectByVisibleText("Audi");
        Thread.sleep(2000);
        select1.deselectByValue("Volvo");
        driver.quit();

    }
}

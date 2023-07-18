package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/java/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        //maximize browser window
        driver.manage().window().maximize();
        //finding element by id
        WebElement button=driver.findElement(By.id("confirm"));
        //button.click();
        WebElement text=driver.findElement(By.id("textbox1"));
        Thread.sleep(5000);
        //clearing textfield
        text.clear();
        text.sendKeys("vaishnav");
        //finding element by classname
        WebElement element=driver.findElement(By.className("classone"));
        element.sendKeys("vaishnav");

        //finding element by linkselector - need to give the complete name the link text has
        WebElement element1=driver.findElement(By.linkText("compendiumdev"));
        //element1.click();
        //finding element by linkselector - no need to give the complete name the link text has
        WebElement element2=driver.findElement(By.partialLinkText("compendium"));
        //element2.click();
        //finding element by css selector
        WebElement element3=driver.findElement(By.cssSelector("#confirm"));
        //element3.click();
        //finding element by relative xpath
        WebElement element4=driver.findElement(By.xpath("//input[@id='confirm']"));
        //element4.click();
        //driver.findElement(By.xpath("//input[@id='confirm']")).click();
        //reading text from the browser
        String str=driver.findElement(By.className("widget-content")).getText();
        System.out.println(str);
        driver.close();
    }

}

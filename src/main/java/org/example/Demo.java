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
        String str=driver.findElement(By.xpath("//div[contains(text(),'This is a sample Text on this page. This is a samp')]")).getText();
        System.out.println(str);
        //reading attribute value
        String str1=driver.findElement(By.id("textbox1")).getAttribute("value");
        System.out.println(str1);
        //find the title of the page - high level not application level(no need of the web element to use these)
        String str2=driver.getTitle();
        System.out.println("title of the page is --->"+str2);
        //checks if the checkbox is selected , if yes returns true
        boolean flag=driver.findElement(By.id("checkbox1")).isSelected();
        System.out.println("is the checkbox selected--->"+flag);
        //main window gets closed
        //driver.close();
        //every window will get closed i.e., the main and the child windows will get closed
        //driver.quit();
    }

}

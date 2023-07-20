package org.example.xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        //maximize browser window
        driver.manage().window().maximize();
        //syntax = tagName[@attributeName='attributeValue']
        // /html/body/p[@id='para1'] -- absPath
        // //p[@id='para1'] -- relativePath
        // //p[@id='para1'][@class='main'] by giving both id and class name
        // to locate multiple xpaths with same tags use or //p[@id='para1'or @id='para2']
        //to locate multiple xpaths with different tags use pipe select[@id='drop1']|//button[@id='but1']
        // //input[1] -- tag level
        // (//input)[1] -- page level
        // any tags having any attribute having any value //*[@*]
        // input tag having any attribute //input[@*]

        driver.quit();
    }
}

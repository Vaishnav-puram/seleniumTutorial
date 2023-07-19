package org.example.handlingWindowsAlertsWaiting.windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        //maximize browser window
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Blogger")).click();//first child window will be opened
        driver.findElement(By.xpath("//a[contains(text(),'Open a popup window')]")).click();//second child window will be opened
        //so to capture more than one window use window handles
        Set<String> windows=driver.getWindowHandles(); //3 windows in set in random order
        Iterator<String> it=windows.iterator();
        String str1="";
        while (it.hasNext()){
            String windowid=it.next(); //every window has a unique id
            driver.switchTo().window(windowid);
            if(driver.getTitle().equals("Basic Web Page Title")){
                str1=driver.findElement(By.id("para1")).getText();
                System.out.println("the string for the child window is -->"+str1);
            }
        }
        driver.close();

    }
}

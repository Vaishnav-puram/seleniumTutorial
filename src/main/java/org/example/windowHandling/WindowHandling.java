package org.example.windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        //maximize browser window
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'Open a popup window')]")).click();
        //so to capture more than one window use window handles
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
//        while (it.hasNext()){
//            String windowid=it.next(); //every window has a unique id
//            System.out.println(windowid);
//        }
        String mainWindow=it.next();
        String childWindow=it.next();
        //String str=driver.findElement(By.id("para1")).getText();//gives no such element exception as selenium by default sees only main window
        //switching to another window i.e. from main to child window
        driver.switchTo().window(childWindow);
        String str1=driver.findElement(By.id("para1")).getText();
        System.out.println("the paragraph in pop up window is -->"+str1);
        //only child window gets closed as at present this window is in focus
        driver.close();
        driver.switchTo().window(mainWindow);
        Thread.sleep(2000);
        driver.close();

    }
}

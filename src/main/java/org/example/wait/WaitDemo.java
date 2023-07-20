package org.example.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        //maximize browser window
        driver.manage().window().maximize();
        //implicit wait -- global wait , for all the elements it will wait for the specified time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //wait for max of 10sec
        driver.findElement(By.className("dropbtn")).click();
        //Thread.sleep(10000); //here we have to wait for the  whole time , suppose if the web element appears after 3 sec it has to wait for 10 sec to complete
        //driver.findElement(By.linkText("Facebook")).click();//here it won't wait for complete 10 sec as soon as it appears it selects
        //explicit wait--default polling time is 0.5 sec,  can be used for individual element , so the advantage is if only  an individual wait is taking more time we can set implicit wait ot others and the element which is taking longer time can be set explicitly
        WebDriverWait webDriverWait=new WebDriverWait(driver,Duration.ofSeconds(30));//here it won't wait for complete 30 sec , if facebook appears after 3 sec it stops waiting after 3
        WebElement facebookElement=webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
        facebookElement.click();
        driver.quit();
    }
}

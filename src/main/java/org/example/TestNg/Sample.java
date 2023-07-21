package org.example.TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Sample {
    @Test
    public void login() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        //maximize browser window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("input-email")).sendKeys("selenium123@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("1234");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        //System.out.println(driver.findElement(By.xpath("//*[@class='breadcrumb']//a[text()='Account']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='breadcrumb']//a[text()='Account']")).isDisplayed());
        driver.findElement(By.name("search")).sendKeys("iphone");
        driver.findElement(By.xpath("//*[@class='fa fa-search']/parent::button")).click();
        //System.out.println(driver.findElement(By.xpath("//*[@class='caption']//a[text()='iPhone']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='caption']//a[text()='iPhone']")).isDisplayed());
        driver.findElement(By.xpath("//*[@class='caption']//a[text()='iPhone']")).click();
        //System.out.println(driver.findElement(By.xpath("//*[@class='breadcrumb']//a[text()='iPhone']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='breadcrumb']//a[text()='iPhone']")).isDisplayed());
        WebElement quantity=driver.findElement(By.name("quantity"));
        quantity.clear();
        quantity.sendKeys("2");
        driver.findElement(By.id("button-cart")).click();
        WebElement successStatus=driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
        String status=successStatus.getText();
        //System.out.println(status.contains("Success: You have added"));
        Assert.assertEquals(status,"Success: You have added");
        successStatus.findElement(By.xpath("//span[@id='cart-total']")).click();
        driver.findElement(By.linkText("Checkout")).click();
        driver.findElement(By.id("input-payment-firstname")).sendKeys("Vaishnav");
        driver.findElement(By.id("input-payment-lastname")).sendKeys("Puram");
        driver.findElement(By.id("input-payment-address-1")).sendKeys("H.no-103");
        driver.findElement(By.id("input-payment-city")).sendKeys("New York");
        driver.findElement(By.id("input-payment-postcode")).sendKeys("10098");
        WebElement country=driver.findElement(By.id("input-payment-country"));
        Select select=new Select(country);
        select.selectByVisibleText("United States");
        WebElement state=driver.findElement(By.id("input-payment-zone"));
        Select select1=new Select(state);
        select1.selectByVisibleText("New York");
        driver.findElement(By.id("button-payment-address")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("button-shipping-address")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("button-shipping-method")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("button-confirm")).click();
        Thread.sleep(2000);
        //System.out.println(driver.findElement(By.xpath("//*[@class='breadcrumb']//a[text()='success']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='breadcrumb']//a[text()='success']")).isDisplayed());
        //System.out.println(driver.findElement(By.xpath("//*[@id='content']//h1[text()='Your order has been placed!']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='content']//h1[text()='Your order has been placed!']")).isDisplayed());

    }
}

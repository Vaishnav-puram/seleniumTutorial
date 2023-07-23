package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;
import objectRepository.MyAccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        driver = new ChromeDriver();
        loginPage=new LoginPage(driver);
        myAccountPage=new MyAccountPage(driver);
    }
    @Test
    public void login() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");
        //maximize browser window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        driver.findElement(By.linkText("Login")).click();
//        driver.findElement(By.id("input-email")).sendKeys("selenium123@gmail.com");
        loginPage.getEmailField().sendKeys("selenium123@gmail.com");
//        driver.findElement(By.id("input-password")).sendKeys("1234");
        loginPage.getPasswordField().sendKeys("1234");
//        driver.findElement(By.xpath("//input[@value='Login']")).click();
        loginPage.getLoginField().click();
        Assert.assertTrue(myAccountPage.getAccount().isDisplayed());
    }

    @AfterMethod
    public void closure(){
        driver.quit();
    }
}

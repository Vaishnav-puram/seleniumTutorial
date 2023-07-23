package org.example;

import PageFactory.LoginPagePF;
import PageFactory.MyAccountPagePF;
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

public class LoginTest1 {
    WebDriver driver;
    LoginPagePF loginPagePF;
    MyAccountPagePF myAccountPagePF;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        driver = new ChromeDriver();
        loginPagePF=new LoginPagePF(driver);
        myAccountPagePF=new MyAccountPagePF(driver);
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
        loginPagePF.getEmailField().sendKeys("selenium123@gmail.com");
//        driver.findElement(By.id("input-password")).sendKeys("1234");
        loginPagePF.getPasswordField().sendKeys("1234");
//        driver.findElement(By.xpath("//input[@value='Login']")).click();
        loginPagePF.getLoginField().click();
        Assert.assertTrue(myAccountPagePF.getAccount().isDisplayed());
    }

    @AfterMethod
    public void closure(){
        driver.quit();
    }
}

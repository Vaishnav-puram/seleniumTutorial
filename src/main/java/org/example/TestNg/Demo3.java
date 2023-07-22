package org.example.TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Demo3 {
    @BeforeMethod //will be executed before every test method
    public void setup(){
        System.out.println("launching browser...");
    }
    @Parameters({"URL"})
    @Test(priority = 1,groups = {"smoke"})
    public void testRegistration(String url){
        System.out.println("Registration test got executed...");
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.quit();
    }
    @Parameters({"URL"})
    @Test(priority = 2)
    public void testLogin(String url){
        System.out.println("Login test got executed...");
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.quit();
    }
    @Parameters({"URL"})
    @Test(priority = 3,groups = {"smoke"})
    public void testHomePage(String url){
        System.out.println("Home test got executed...");
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.quit();
    }
    @AfterMethod //will be executed after every test method
    public void closure(){
        System.out.println("closing browser...");
    }
    @BeforeClass
    public void test1(){ //executes one time before the execution of the class
        System.out.println("testing before class....");
    }
    @AfterClass
    public void test2(){ //executes one time after the execution of the class
        System.out.println("testing after class....");
    }
}

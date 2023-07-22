package org.example.MvnDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtentReportDemo {
    WebDriver driver;
    ExtentReports extentReports;
    @BeforeMethod
    public void configuration(){
        ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter("src/main/java/org/example/MvnDemo/extentReport/index.html");
        extentSparkReporter.config().setReportName("Omayo Test Report");
        extentSparkReporter.config().setDocumentTitle("Omayo Test Report Title");
        extentReports=new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
        extentReports.setSystemInfo("Operating System","Windows11");

    }
    @Test
    public void test1(){
        ExtentTest extentTest=extentReports.createTest("Test one created"); //starting of the report
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        driver = new ChromeDriver();
        extentTest.info("Chrome Browser Launched...");
        driver.get("https://omayo.blogspot.com/");
        extentTest.info("navigated to Omayo home page");
        //maximize browser window
        driver.manage().window().maximize();
        String actual=driver.findElement(By.xpath("//p[text()='PracticeAutomationHere']")).getText();
        Assert.assertEquals(actual,"PracticeAutomationHere");
        extentTest.info("Assertion completed...");
    }
    @Test
    public void test2(){
        ExtentTest extentTest=extentReports.createTest("Test two created"); //starting of the report
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        driver = new ChromeDriver();
        extentTest.info("Chrome Browser Launched...");
        driver.get("https://omayo.blogspot.com/");
        extentTest.info("navigated to Omayo home page");
        //maximize browser window
        driver.manage().window().maximize();
        String actual=driver.findElement(By.xpath("//p[text()='PracticeAutomationHere']")).getText();
        extentTest.fail("Test two failed");
        Assert.assertEquals(actual,"PracticeAutomationHereABC");
        extentTest.info("Assertion completed...");
    }

    @AfterMethod
    public void closure(){
        driver.quit();
        //extentReports.flush(); //closing reports
    }
}

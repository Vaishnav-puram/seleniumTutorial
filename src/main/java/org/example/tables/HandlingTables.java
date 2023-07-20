package org.example.tables;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class HandlingTables {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        //maximize browser window
        driver.manage().window().maximize();
        String str1=driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th[1]")).getText();
        System.out.println("first heading of the table is --> "+str1);
        String str2=driver.findElement(By.xpath("//table[@id='table1']//th[2]")).getText();
        System.out.println("second heading of the table is --> "+str2);
        String str3=driver.findElement(By.xpath("//table[@id='table1']//td[1]")).getText();
        System.out.println("first data of the table is --> "+str3);
        String str5=driver.findElement(By.xpath("//table[@id='table1']//tr[3]//td[2]")).getText();
        System.out.println("3rd row 2nd column of the table is --> "+str5);
        List<WebElement> elements=driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("heading are :\n");
        for (int i=0;i<elements.size();i++){
            System.out.println(elements.get(i).getText());
        }
        List<WebElement> elements2=driver.findElements(By.xpath("//table[@id='table1']//td"));
        System.out.println("all table data are :\n");
        for (int i=0;i<elements2.size();i++){
            System.out.println(elements2.get(i).getText());
        }
        List<WebElement> elements3=driver.findElements(By.xpath("//table[@id='table1']//tr[1]//td"));
        System.out.println("first row data are :\n");
        for (int i=0;i<elements3.size();i++){
            System.out.println(elements3.get(i).getText());
        }
        driver.quit();
    }
}

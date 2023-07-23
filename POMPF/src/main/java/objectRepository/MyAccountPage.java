package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
    WebDriver driver;
    public MyAccountPage(WebDriver driver){
        this.driver=driver;
    }
    By account= By.xpath("//*[@class='breadcrumb']//a[text()='Account']");

    public WebElement getAccount(){
        return driver.findElement(account);
    }
}

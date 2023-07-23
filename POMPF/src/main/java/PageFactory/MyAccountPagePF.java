package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPagePF {
    WebDriver driver;
    public MyAccountPagePF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//*[@class='breadcrumb']//a[text()='Account']")
    private WebElement account;

    public WebElement getAccount(){
        return account;
    }
}

package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {
    WebDriver driver;
    public LoginPagePF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="input-email")
    private WebElement emailField;
    @FindBy(id="input-password")
    private WebElement passwordField;
    @FindBy(xpath="//input[@value='Login']")
    private WebElement loginField;

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLoginField() {
        return loginField;
    }
}

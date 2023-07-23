package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    private By emailField=By.id("input-email");
    private By passwordField=By.id("input-password");
    private By loginField=By.xpath("//input[@value='Login']");

    public WebElement getEmailField() {
        return driver.findElement(emailField);
    }

    public WebElement getPasswordField() {
        return driver.findElement(passwordField);
    }

    public WebElement getLoginField() {
        return driver.findElement(loginField);
    }


}

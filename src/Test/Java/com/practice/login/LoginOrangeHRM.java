package Test.Java.com.practice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginOrangeHRM {
    WebDriver driver;
    String siteURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    String usernameXpath = "//input[@name='username']";
    String passwordXpath = "//input[@name='password']";
    String loginXpath = "//button[@type='submit']";

    public LoginOrangeHRM(WebDriver driver){
        this.driver = driver;
    }
    public void goToLoginPage() {
        driver.get(siteURL);
    }

    public void setUsername(String username){
        WebElement userField = driver.findElement(By.xpath(usernameXpath));
        userField.sendKeys(username);
    }

    public void setPassword(String pass){
        WebElement passwordField = driver.findElement(By.xpath(passwordXpath));
        passwordField.sendKeys(pass);
    }

    public void clickLogin(){
        WebElement loginButton = driver.findElement(By.xpath(loginXpath));
        loginButton.click();
    }
}

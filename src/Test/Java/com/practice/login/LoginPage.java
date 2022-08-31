package Test.Java.com.practice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    String siteURL = "https://www.saucedemo.com/";
    String userXpath = "//input[@id='user-name']";
    String passwordXpath = "//input[@id='password']";
    String loginXpath = "//input[@id='login-button']";

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void goToLoginPage() {
        driver.get(siteURL);
    }

    public void setUser(String user){
        WebElement userField = driver.findElement(By.xpath(userXpath));
        userField.sendKeys(user);
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

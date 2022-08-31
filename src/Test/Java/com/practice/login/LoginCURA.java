package Test.Java.com.practice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginCURA {
    WebDriver driver;
    String siteURL = "https://katalon-demo-cura.herokuapp.com/profile.php#login";
    String userXpath = "//input[@id='txt-username']";
    String passwordXpath = "//input[@id='txt-password']";
    String loginXpath = "//button[@id='btn-login']";

    public LoginCURA(WebDriver driver){
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

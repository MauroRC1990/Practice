package Test.Java.com.practice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class CleanLogin {
    public static void main(String[] args) {
        DriverManager driverConfigurationObject = new DriverManager();
        WebDriver driver = driverConfigurationObject.makeChromeDriver();
        driverConfigurationObject.setUpWaits(30, 2);
        Wait<WebDriver> wait = driverConfigurationObject.getWaitObject();

        String userName = "standard_user";
        String password = "secret_sauce";

        LoginPage loginWebPage = new LoginPage(driver);
        loginWebPage.goToLoginPage();
        loginWebPage.setUser(userName);
        loginWebPage.setPassword(password);
        loginWebPage.clickLogin();





        WebElement pageLoad = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='shopping_cart_link']")));


        String shoppingCartXpath = "//a[@class='shopping_cart_link']";
        WebElement shoppingCart = driver.findElement(By.xpath(shoppingCartXpath));

        if (shoppingCart.isDisplayed()) {
            System.out.println("Successful case");
        } else {
            System.out.println("Failed Case");
        }
        driver.quit();
    }
}

package Test.Java.com.practice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class CleanLoginCURA {
    public static void main(String[] args) {
        DriverManager driverConfigurationObject = new DriverManager();
        WebDriver driver = driverConfigurationObject.makeChromeDriver();
        driverConfigurationObject.setUpWaits(30, 2);
        Wait<WebDriver> wait = driverConfigurationObject.getWaitObject();

        String userName = "John Doe";
        String password = "ThisIsNotAPassword";

        LoginCURA loginWebPage = new LoginCURA(driver);
        loginWebPage.goToLoginPage();
        loginWebPage.setUser(userName);
        loginWebPage.setPassword(password);
        loginWebPage.clickLogin();

        WebElement pageLoad = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@id='combo_facility']")));

        String facilityXpath = "//select[@id='combo_facility']";
        WebElement facility = driver.findElement(By.xpath(facilityXpath));

        if (facility.isDisplayed()) {
            System.out.println("Successful case");
        } else {
            System.out.println("Failed Case");
        }

        driver.quit();
    }
}

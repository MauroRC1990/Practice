package Test.Java.com.practice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class RemoveEmployee {
    public static void main(String[] args) {
        DriverManager driverConfigurationObject = new DriverManager();
        WebDriver driver = driverConfigurationObject.makeChromeDriver();
        driverConfigurationObject.setUpWaits(30, 2);
        Wait<WebDriver> wait = driverConfigurationObject.getWaitObject();

        String userName = "Admin";
        String password = "admin123";

        LoginOrangeHRM loginOrangeHRM = new LoginOrangeHRM(driver);
        loginOrangeHRM.goToLoginPage();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));
        loginOrangeHRM.setUsername(userName);
        loginOrangeHRM.setPassword(password);
        loginOrangeHRM.clickLogin();

        HomePageOrangeHRM homeWebPage = new HomePageOrangeHRM(driver, wait);
        homeWebPage.trashCan();
        homeWebPage.clickConfirmEmployeeDelete();

        String successfullyDeletedMsgXpath = "//*[text()='Successfully Deleted']";
        WebElement validateDelete = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(successfullyDeletedMsgXpath)));
        if (validateDelete.isDisplayed()) {
            System.out.println("Successful case");
        }else {
            System.out.println("Failed case");
        }

        driver.close();
        driver.quit();
    }
}

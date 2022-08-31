package Test.Java.com.practice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;



public class AddEmployee {
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
        homeWebPage.selectAddEmployee();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstName']")));

        homeWebPage.setFirstName("Hermann");
        homeWebPage.setMiddleName("Pirate");
        homeWebPage.setLastName("Toothrot");
        homeWebPage.setEmployeeId("1000");
        homeWebPage.createLoginDetailsSwitch();
        homeWebPage.setUserName("Hermann");
        homeWebPage.statusEnabled();
        homeWebPage.setPassword("221BBak.");
        homeWebPage.setConfirmPassword("221BBak.");
        homeWebPage.saveButton();


        String successfullyAddedMsgXpath = "//*[text()='Successfully Saved']";
        WebElement validateAdded = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(successfullyAddedMsgXpath)));
        if (validateAdded.isDisplayed()) {
            System.out.println("Successful case");
        }else {
            System.out.println("Failed case");
        }

        driver.close();
        driver.quit();
    }
}

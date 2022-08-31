package Test.Java.com.practice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class EditEmployeeProfile {
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
        homeWebPage.selectEmployeeProfile();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")));

        homeWebPage.setNickname("Hermit");
        homeWebPage.selectNationality();
        homeWebPage.selectArgentineanNationality();
        homeWebPage.selectMaritalStatus();
        homeWebPage.selectSingleStatus();
        homeWebPage.selectDateOfBirth();
        homeWebPage.selectCalendarMonthMenu();
        homeWebPage.selectMonth();
        homeWebPage.selectCalendarYearMenu();
        homeWebPage.selectYear();
        homeWebPage.selectDay();
        homeWebPage.selectGender();
        homeWebPage.setMilitaryService("Quartermaster");
        homeWebPage.saveButton();


        homeWebPage.selectContactDetails();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-sub-title']")));

        homeWebPage.setStreet1("221B Baker Street");
        homeWebPage.setStateProvince("Monkey Island");
        homeWebPage.saveButton();


        String successfullyUpdatedMsgXpath = "//*[text()='Successfully Updated']";
        WebElement validateUpdated = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(successfullyUpdatedMsgXpath)));
        if (validateUpdated.isDisplayed()) {
            System.out.println("Successful case");
        }else {
            System.out.println("Failed case");
        }

        driver.close();
        driver.quit();
    }
}

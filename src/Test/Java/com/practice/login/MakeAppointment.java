package Test.Java.com.practice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class MakeAppointment {
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

        HomePage homeWebPage = new HomePage(driver);
        homeWebPage.selectFacilityOptions();
        homeWebPage.selectHongKongFacility();
        homeWebPage.selectCheckReadmission();
        homeWebPage.selectRadioMedicaid();
        homeWebPage.selectDate();
        homeWebPage.selectDay();
        homeWebPage.writeComment("Thank you for your time.");
        homeWebPage.bookAppointment();

        WebElement pageLoad = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text() = 'Appointment Confirmation']")));

        String appointmentConfirmationXpath = "//*[text() = 'Appointment Confirmation']";
        WebElement confirmation = driver.findElement(By.xpath(appointmentConfirmationXpath));

        if (confirmation.isDisplayed()) {
            System.out.println("Successful case");
        } else {
            System.out.println("Failed Case");
        }

        driver.quit();
    }
}

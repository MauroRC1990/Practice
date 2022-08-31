package Test.Java.com.practice.login;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class DriverManager {
    String driverPath = "Drivers\\chromedriver.exe";
    WebDriver driver;
    Wait<WebDriver> wait;

    public WebDriver makeChromeDriver() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        return driver;
    }

    public void setUpWaits(int maxDuration, int quearyInterval) {
        wait = new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(maxDuration))
            .pollingEvery(Duration.ofSeconds(quearyInterval))
            .ignoring(NoSuchElementException.class);
    }

    public Wait<WebDriver> getWaitObject() {
        return wait;
    }
}

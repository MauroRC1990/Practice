package Test.Java.com.practice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitTimePractice {
    public static void main(String[] args) {
        String driverPath = "Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        // Abro el explorador
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(1));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.xpath("//button[text()='Start']")).click();

        //WebElement helloWorld = new WebDriverWait(driver, Duration.ofSeconds(100)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h4[text()='Hello World!']")));


        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement helloWorld = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
        System.out.println(helloWorld.getText());
        //driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText();
        // Cierre de browser
        driver.quit();

    }
}

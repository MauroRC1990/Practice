package Test.Java.com.practice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABTesting {
    public static void main(String[] args) {
        String driverPath = "Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
// Abro el explorador
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/abtest']")).click();


        waitExternalReasons(4000);
// Cierre de browser
        driver.quit();

    }
    protected static void waitExternalReasons(long miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
    }
}

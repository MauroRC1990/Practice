package Test.Java.com.practice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ChallengingDOM {
    public static void main(String[] args) {
        String driverPath = "Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        // Abro el explorador
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/challenging_dom");
//        WebElement example = driver.findElement(By.xpath(""));
        List<WebElement> columnName = driver.findElements(By.xpath("//thead//th"));

        int sitIndex = 0;
        String targetColumn = "Dolor";

        for (int counter = 0; counter < columnName.size(); counter++) {
            System.out.println(columnName.get(counter).getText());
            if (columnName.get(counter).getText().equals(targetColumn)) {
                sitIndex = counter;
            }
        }

        System.out.println(sitIndex);

        String lineValue = "Consequuntur7";
        List<WebElement> targetLine = driver.findElements(By.xpath("//td[text()='" + lineValue + "']/parent::tr/child::td"));
        System.out.println(targetLine.get(sitIndex).getText());
        // Cierre de browser
        driver.quit();

    }
}

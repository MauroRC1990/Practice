package Test.Java.com.practice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;

public class Login {
    public static void main(String[] args) {
        String driverPath = "Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        // Abro el explorador
        WebDriver driver = new ChromeDriver();
        // (espero a que inicie)
        // Cargo la URL
        String siteURL = "https://www.saucedemo.com/";
        driver.get(siteURL);
        // (espero a que inicie)

        // Ubico para escribir en la casilla de usuario e ingreso mi usuario
        String userXpath = "//input[@id='user-name']";
        WebElement userField = driver.findElement(By.xpath(userXpath));
        String userName = "standard_user";
        userField.sendKeys(userName);

        // Ubico para escribir en la casilla de contraseña e ingreso mi contraseña
        String passwordXpath = "//input[@id='password']";
        WebElement passwordField = driver.findElement(By.xpath(passwordXpath));
        String password = "secret_sauce";
        passwordField.sendKeys(password);

        // Ubico el mouse sobre el botón de iniciar sesión y le doy click
        String loginXpath = "//input[@id='login-button']";
        WebElement loginButton = driver.findElement(By.xpath(loginXpath));
        loginButton.click();

        // (espero a que cargue)
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement pageLoad = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='shopping_cart_link']")));


        String shoppingCartXpath = "//a[@class='shopping_cart_link']";
        WebElement shoppingCart = driver.findElement(By.xpath(shoppingCartXpath));

        if (shoppingCart.isDisplayed()) {
            System.out.println("Successful case");
        }else {
            System.out.println("Failed Case");
        }

        if (shoppingCart.isEnabled()) {
            System.out.println("Successful case");
        }else {
            System.out.println("Failed Case");
        }

        String listXpath = "//div[@class='inventory_item']";
        List<WebElement> itemsList = driver.findElements(By.xpath(listXpath));

        if (itemsList.size() > 0 ) {
            System.out.println("Successful case");
        }else {
            System.out.println("Failed Case");
        }

        String imageBackpackXpath = "//img[@alt='Sauce Labs Backpack']";
        WebElement imageBackpack = driver.findElement(By.xpath(imageBackpackXpath));

        if (imageBackpack.isDisplayed()) {
            System.out.println("Successful case");
        }else {
            System.out.println("Failed Case");
        }

        String botFooterXpath = "//img[@alt='Swag Bot Footer']";
        WebElement imageBotFooter = driver.findElement(By.xpath(botFooterXpath));

        if (imageBotFooter.isEnabled()) {
            System.out.println("Successful case");
        }else {
            System.out.println("Failed Case");
        }

        String productSortXpath = "//select[@class='product_sort_container']";
        WebElement productSort = driver.findElement(By.xpath(productSortXpath));

        if (productSort.isEnabled()) {
            System.out.println("Successful case");
        }else {
            System.out.println("Failed Case");
        }


        System.out.println("La lista de elementos tiene " + itemsList.size() + " elementos");



        //Cierre de browser
        driver.quit();
    }
}

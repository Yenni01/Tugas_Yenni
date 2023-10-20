package TestList;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChart {
    @Test
    public void addToChart() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3);

        WebElement getUsername = driver.findElement(By.id("user-name"));
        WebElement getPassword = driver.findElement(By.id("password"));
        WebElement getBtnLogin = driver.findElement(By.id("login-button"));

        getUsername.sendKeys("standard_user");
        Thread.sleep(3000);
        getPassword.sendKeys("secret_sauce");
        Thread.sleep(3000);
        getBtnLogin.click();



        WebElement getAddToChartBackPack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        Thread.sleep(3000);
        getAddToChartBackPack.click();
        Thread.sleep(3000);

        WebElement getShoppingCart = driver.findElement(By.id("shopping_cart_container"));
        getShoppingCart.click();


    }
}

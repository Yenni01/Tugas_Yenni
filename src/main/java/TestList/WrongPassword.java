package TestList;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongPassword {

    @Test
    public void userLogin() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3);

        WebElement getUsername = driver.findElement(By.id("user-name"));
        WebElement getPassword = driver.findElement(By.id("password"));
        WebElement getBtnLogin = driver.findElement(By.id("login-button"));

        getUsername.sendKeys("standard_user");
        Thread.sleep(3000);
        getPassword.sendKeys("secret");
        Thread.sleep(3000);

        getBtnLogin.click();
    }

}

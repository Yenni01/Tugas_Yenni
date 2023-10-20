package TestList;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenDemoSauce {
    @Test
    public void testGoogle(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver chrome = new ChromeDriver();
        chrome.get("https://www.saucedemo.com/");
    }
}

package tech.credify;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;

public class WebDriverProvider {
    @DataProvider(name = "webDriver")
    public static Object[][] initializeWebDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        return new Object[][]{
                {new ChromeDriver(options)}
        };
    }
}

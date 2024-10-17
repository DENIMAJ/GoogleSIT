package utils;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {

    public static WebDriver driver;
    public static void initializeBrowser(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        }
        else if (browserName.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        }
    }
    @After(order = 0)
    public void tearDown(){
        driver.quit();
    }
}

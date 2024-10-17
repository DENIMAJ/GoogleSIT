package CommontoAllPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {

    public WebDriver driver;
    public BaseClass(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterText(WebElement ele,String text){
        ele.sendKeys(text);
    }
}

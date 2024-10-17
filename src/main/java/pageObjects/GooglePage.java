package pageObjects;

import CommontoAllPages.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BaseClass {

    public GooglePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//textarea[@name=\"q\"]")
    private WebElement googleSearchBox;

    public void enterTextSearch(String text){
        enterText(googleSearchBox,text);
    }
}

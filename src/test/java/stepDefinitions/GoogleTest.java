package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GooglePage;
import utils.BrowserFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

import static utils.BrowserFactory.driver;

public class GoogleTest {

    @Given("user navigate to Google website")
    public void user_navigate_to_google_website() {
        BrowserFactory.initializeBrowser("edge");
        driver.get("https://www.google.co.in");
    }
    @When("user enter text in searchbox")
    public void user_enter_text_in_searchbox() {
        GooglePage page = new GooglePage(driver);
        page.enterTextSearch("iphone");

    }
    @When("hit enter")
    public void hit_enter() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(3000);

    }
    @Then("user able to see details regarding product")
    public void user_able_to_see_details_regarding_product() {
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Hello");
    }
}

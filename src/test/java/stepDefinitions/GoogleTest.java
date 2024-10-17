package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BrowserFactory;
import static utils.BrowserFactory.driver;

public class GoogleTest {

    @Given("user navigate to Google website")
    public void user_navigate_to_google_website() {
        BrowserFactory.initializeBrowser("edge");
        driver.get("https://www.google.co.in");
    }
    @When("user enter text in searchbox")
    public void user_enter_text_in_searchbox() {
        System.out.println("Hello");

    }
    @When("hit enter")
    public void hit_enter() {
        System.out.println("Hello");

    }
    @Then("user able to see details regarding product")
    public void user_able_to_see_details_regarding_product() {
        System.out.println("Hello");
    }
}

package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import pageobject.HomePO;
import utilities.SeleniumHelpers;
import utilities.ThreadManager;

public class CommonSteps {
    private WebDriver driver = ThreadManager.getDriver();
    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private HomePO home = new HomePO(driver);

    @Given("user access page {string}")
    public void user_access_page(String url) {
        selenium.navigateToPage(url);
    }

    @Given("user access page automationpractice")
    public void user_access_page_automation_practice() {
        selenium.navigateToPage("https://rahulshettyacademy.com/AutomationPractice/");
    }

    @When("users on {string}")
    public void usersOnWebsite(String title) {
        Assert.assertEquals(title, home.getTitle());
    }

    @Then("compare current url with {string}")
    public void compare_url(String url){
        Assert.assertEquals(url, selenium.getURL());
   }


}
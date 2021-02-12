package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

    GoogleSearchPage gp = new GoogleSearchPage();

    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @When("User searches for apple")
    public void user_searches_for_apple() {
        gp.searchBar.sendKeys("apple", Keys.ENTER);
    }

    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("apple"));
        Driver.closeDriver();
    }

}

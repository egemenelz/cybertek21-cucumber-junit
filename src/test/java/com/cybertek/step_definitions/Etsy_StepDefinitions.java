package com.cybertek.step_definitions;

import com.cybertek.pages.EtsyPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinitions {
    EtsyPage etsyPage = new EtsyPage();

    @Given("user is on the Etsy landing page")
    public void user_is_on_the_etsy_landing_page() {
        String url = ConfigurationReader.getProperty("etsyUrl");
        Driver.getDriver().get(url);
    }

    @Then("user should see Etsy title as {string}")
    public void user_should_see_etsy_title_as(String title) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = title;
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @When("user searches for {string}")
    public void userSearchesFor(String item) {
        etsyPage.setSearchBox().sendKeys(item);
        etsyPage.clicktoSearchButton();
    }

    @Then("user should see {string} in the Etsy title")
    public void userShouldSeeInTheEtsyTitle(String item) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = item + " | Etsy";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}

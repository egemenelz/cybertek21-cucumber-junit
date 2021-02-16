package com.cybertek.step_definitions;

import com.cybertek.pages.WikipediaPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import javax.security.auth.login.Configuration;

public class Wikipedia_StepDefinitions {
    WikipediaPage wikipediaPage = new WikipediaPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wikiUrl"));
    }

    @When("user types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String searchInput) {
        wikipediaPage.getSearchBox().sendKeys(searchInput);
    }

    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaPage.clickSubmit();
    }

    @Then("user sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String searchInput) {
        String expectedTit = searchInput;
        String actualTit = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTit.contains(expectedTit));
    }

    @Then("user sees {string} in the main header")
    public void user_sees_in_the_main_header(String header) {
        Assert.assertTrue(wikipediaPage.getFirstHeader().equals(header));
    }
}

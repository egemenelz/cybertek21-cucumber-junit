package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Google_StepDefinitions {

    GoogleSearchPage gp = new GoogleSearchPage();

    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @When("User searches for {string}")
    public void userSearchesFor(String fruit) {
        gp.searchBar.sendKeys(fruit, Keys.ENTER);
    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String fruit) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(fruit));
    }

    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @Then("User should see following links")
    public void user_should_see_following_links(List<String> linkList) {
        int i = 0;
        for (WebElement eachLink : gp.footerLinks) {
            System.out.println("eachLink = " + eachLink.getText());
            System.out.println("linkList = " + linkList.get(i++));
            Assert.assertEquals(eachLink.getText(), linkList.get(i++));
        }
    }


}

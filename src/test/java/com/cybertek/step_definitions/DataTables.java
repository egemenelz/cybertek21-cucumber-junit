package com.cybertek.step_definitions;

import com.cybertek.pages.CTPractice;
import com.cybertek.pages.SmartBearLogin;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.List;
import java.util.Map;

public class DataTables {
    SmartBearLogin sb = new SmartBearLogin();
    CTPractice ct = new CTPractice();

    @Given("User is on the login page of SmartBear")
    public void user_is_on_the_login_page_of_smart_bear() {
        String url = ConfigurationReader.getProperty("smartbearURL");
        Driver.getDriver().get(url);
    }

    @When("User enters below info")
    public void user_enters_below_info(Map<String, String> loginInfo) {
        String username = loginInfo.get("username");
        String pwd = loginInfo.get("password");
        /*sb.inputUsername.sendKeys(username);
        sb.inputPassword.sendKeys(pwd);
        sb.loginButton.click();*/
        sb.loginToSmartBear(username, pwd);
    }

    @Then("User should see title changed to {string}")
    public void user_should_see_title_changed_to_web_order(String title) {
        BrowserUtils.titleAssertion(title);
    }


    @Then("user should be below words displayed")
    public void user_should_be_below_words_displayed(List<String> fruits) {
        for (String eachFruits : fruits) {
            System.out.println("eachFruits = " + eachFruits);
        }
    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get(ConfigurationReader.getProperty("dropdownURL"));
    }

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> months) {
        Assert.assertEquals(months,(BrowserUtils.getElementsText(ct.dropdownOptions())));
    }
    //
    //
    //
    //
    //
    //
}

package com.cybertek.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_StepDefinitions {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("User is on the login page..");
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters librarian username..");
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
    }

    @Then("user should see the dashboard")
    public void userShouldSeeTheDashboard() {
        System.out.println("user should see librarian in the dashboard");
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("user enters student username");
    }

    @And("user enter student password")
    public void userEnterStudentPassword() {
        System.out.println("user enter student password");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("user enters admin username");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enters admin password");
    }


}

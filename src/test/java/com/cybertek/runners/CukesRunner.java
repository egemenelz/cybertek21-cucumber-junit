package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty","html:target/cucumber-report.html"},
        features = "src/test/resources/features",
        glue = "com/cybertek/step_definitions",
        dryRun = false,
        tags = "@etsy"

        //@librarian or @student --> With or keyword, It will run the scenario if it has either one of tags.
        //@librarian and @employee --> With and keyword, it will run the scenario if it has BOTH OF THE TAGS at the same time
        //@employee and not @admin --> With and not keyword, it will run the tags has first side, it will EXCLUDE the scenarios that has the tag that comes after "and not"
)

public class CukesRunner {
}


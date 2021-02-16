package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before(order = 1)
    public void setUpScenario() {
        System.out.println("Setting up browser with further details..");
    }

    @Before(value = "@db", order = 2)
    public void connectingDataBase() {
        System.out.println("Connecting Data Base...");
    }

    @After(order = 2)
    public void tearDownScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
    }

    @After(value = "@db", order = 1)
    public void closingDataBase() {
        System.out.println("Closing Data Base...");
    }

    @BeforeStep
    public void runBeforeStep() {
        System.out.println("Before step...");
    }

    @AfterStep
    public void runsAfterStep() {
        System.out.println("After step...");
    }
}

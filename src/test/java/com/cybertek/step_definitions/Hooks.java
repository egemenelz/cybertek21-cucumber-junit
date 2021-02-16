package com.cybertek.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

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
    public void tearDownScenario() {
        System.out.println("Closing browser");
        System.out.println("Take a Screenshot");
    }

    @After(value = "@db", order = 1)
    public void closingDataBase() {
        System.out.println("Closing Data Base...");
    }

    @BeforeStep
    public void runBeforeStep(){
        System.out.println("Before step...");
    }
    @AfterStep
    public void runsAfterStep(){
        System.out.println("After step...");
    }
}

package com.cybertek.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static void Sleep(int howLong) {
        try {
            Thread.sleep(howLong * 1000);
        } catch (InterruptedException e) {
        }
    }

    public static void titleAssertion(String title) {
        String actulTit = Driver.getDriver().getTitle();
        String expectedTit = title;
        Assert.assertTrue(actulTit.contains(expectedTit));
    }

    public static List<String> getElementsText(List<WebElement> webElementList){
        //PlaceHolder empty list of webElement
        List<String> stringList = new ArrayList<>();

        //Looping thru list of web elements and storing text into placeholder list
        for (WebElement eachElement : webElementList) {
            stringList.add(eachElement.getText());
        }
        //returning final List<String>
        return stringList;
    }
}

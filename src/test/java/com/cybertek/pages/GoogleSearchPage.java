package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoogleSearchPage extends BasePage {


    @FindBy(name = "q")
    public WebElement searchBar;
    @FindBy(xpath = "//a[@class='pHiOh']")
    public  List<WebElement> footerLinks;

}

package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WikipediaPage {

    @FindBy(id = "searchInput")
    private WebElement searchBox;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;
    @FindBy(id = "firstHeading")
    private WebElement firstHeader;

    public WebElement getSearchBox() {
        return searchBox;
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public String getFirstHeader() {
        return firstHeader.getText();
    }

}

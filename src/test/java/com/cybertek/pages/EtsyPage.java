package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EtsyPage extends BasePage {

    @FindBy(id = "global-enhancements-search-query")
    private WebElement searchBox;
    @FindBy(xpath = "(//button[@class='wt-input-btn-group__btn'])[1]")
    private WebElement searchButton;

    public WebElement setSearchBox() {
        return searchBox;
    }

    public void clicktoSearchButton() {
        searchButton.click();
    }

}

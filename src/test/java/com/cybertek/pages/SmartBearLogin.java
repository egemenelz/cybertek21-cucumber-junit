package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.sun.tools.internal.jxc.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartBearLogin extends BasePage {

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement inputUsername;
    @FindBy(id = "ctl00_MainContent_password")
    public WebElement inputPassword;
    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;
    @FindBy(id = "ctl00_MainContent_status")
    public WebElement errorMessage;

    public void loginToSmartBear(){
        inputUsername.sendKeys("Tester");
        inputPassword.sendKeys("test");
        loginButton.click();
    }
    public void loginToSmartBear(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }
    public void loginToSmartBear_Config(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("sbUsername"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("sbPassword"));
        loginButton.click();
    }

}
